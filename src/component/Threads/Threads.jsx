import React from 'react'
import { useState } from 'react'
import Thread from '../Thread/Thread'
import axios from "axios";

function Threads() {
  const urlForum = "https://localhost:7261/forum";
  const titles=["Analisis","Coding","Testing"]
  const [thread_name,setThreadName] = useState()
  const [showingThread,setShowingThread] = useState(false)
  const [threads, setThreads] = useState([]);
  function chargeThread(){
    axios.get(urlForum).then((response)=>{
      setThreads(response.data)})
  }
  return (
    <div>
    <div hidden={showingThread}>
    {titles.map((title)=>(
      <div className="card">
      <div className="card-body" onClick={()=>{chargeThread();
      setThreadName(title)
      setShowingThread(true)
      }}>
        <h5 className="card-title">{title}</h5>
      </div>
    </div>
    ))}
    </div>
    <Thread showingThread={showingThread} threadTitle={thread_name} threads={threads}setThreads={setThreads}/>
    </div>
  )
}

export default Threads