import "./App.css";
import React from "react";
import NewThread from "./component/NewThread/NewThread";
import pencil from "./assest/Pencil.jpg";
import loudspeaker from "./assest/LoudSpeaker.jpg";
import question from "./assest/Question.jpeg";
import axios from "axios";
import "./App.css";
import { useEffect, useState } from "react";
import Category from "./component/Category/Category";
import PostBody from "./component/PostBody/PostBody";

function App() {
  const urlForum = "https://localhost:7261/forum";
  const [threads, setThreads] = useState([
    {
      "title": "Title 1",
      "text": "Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.",
      "Category": "Question",
    },
    {
      "title": "Title 1",
      "text": "Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. Brunch 3 wolf moon tempor, sunt aliqua put a bird on it squid single-origin coffee nulla assumenda shoreditch et. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident. Ad vegan excepteur butcher vice lomo. Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.",
      "Category": "Suggestion",
    },
  ]);
 
  
  const [post, setPost] = useState({
    "title": "",
    "text": "",
    "Category": "Question",
  });

  const [newThread, setNewThread] = useState(false);
  const [validTitle, setValidTitle] = useState(false);
  function filterQuestion(thread) {
    return thread.category === "Question";
  }
  function filterSuggestion(thread) {
    return thread.category === "Suggestion";
  }
  function filterClarification(thread) {
    return thread.category === "Clarification";
  }
  function validateTitle(event) {
    const newPost = { ...post, "title": event.target.value };
    setPost(newPost);
    // alert("Make Validate Title method with API");
    setValidTitle(true);
  }
  function addNewPost() {
    // alert("Add new post to API");
    console.log(post)
    axios.post(urlForum, {
      title: post.title,
      text: post.text,
      category: post.category,
    }).then((response) => console.log(response));
    threads.push(post);
    setThreads(threads);
    setNewThread(false);
  }
    React.useEffect(() => {axios.get(urlForum).then((response)=>{
      console.log(response.data)
      setThreads(response.data)})},[])
  
  return (
    <div className="App">
      <div className="row">
        <div className="col-4">
          <div className="list-group" id="list-tab" role="tablist">
            <a
              className="list-group-item list-group-item-action"
              id="list-question-list"
              data-toggle="list"
              href="#list-question"
              role="tab"
              aria-controls="question"
              onChange={() => {
                setNewThread(false);
              }}
            >
              Question
            </a>
            <a
              className="list-group-item list-group-item-action"
              id="list-suggestion-list"
              data-toggle="list"
              href="#list-suggestion"
              role="tab"
              aria-controls="suggestion"
              onChange={() => {
                setNewThread(false);
              }}
            >
              Suggestion
            </a>
            <a
              className="list-group-item list-group-item-action"
              id="list-clarification-list"
              data-toggle="list"
              href="#list-clarification"
              role="tab"
              aria-controls="clarification"
            >
              Clarification
            </a>
          </div>
        </div>
        <div className="col-8">
          <div className="tab-content" id="nav-tabContent">
            <div
              className="tab-pane fade"
              id="list-question"
              role="tabpanel"
              aria-labelledby="list-question-list"
            >
              <div id="accordion">
                {threads.filter(filterQuestion).map((thread, index) => (
                  <div className="card">
                    <div className="card-header" id={index}>
                      <h5 className="mb-0">
                        <div>
                          <img src={question} className="icon" />
                        </div>
                        <button
                          className="btn btn-link"
                          data-toggle="collapse"
                          data-target={`#d${index}`}
                          aria-expanded="true"
                          aria-controls={`d${index}`}
                        >
                          {thread.title}
                        </button>
                      </h5>
                    </div>
                    <div
                      id={`d${index}`}
                      className="collapse show"
                      aria-labelledby={`${index}`}
                      data-parent="#accordion"
                    >
                      <div className="card-body">{thread.text}</div>
                    </div>
                  </div>
                ))}
                <NewThread setNewThread={setNewThread} />
              </div>{" "}
            </div>
            <div
              className="tab-pane fade"
              id="list-suggestion"
              role="tabpanel"
              aria-labelledby="list-suggestion-list"
            >
              <div id="accordion">
                {threads.filter(filterSuggestion).map((thread, index) => (
                  <div className="card">
                    <div className="card-header" id={index}>
                      <h5 className="mb-0">
                        <div>
                          <img src={loudspeaker} className="icon" />
                          <a href="https://www.freepik.com/free-vector/illustration-loudspeaker_3133065.htm">
                            Image by rawpixel.com on Freepik
                          </a>
                        </div>
                        <button
                          className="btn btn-link"
                          data-toggle="collapse"
                          data-target={`#d${index}`}
                          aria-expanded="true"
                          aria-controls={`d${index}`}
                        >
                          {thread.title}
                        </button>
                      </h5>
                    </div>
                    <div
                      id={`d${index}`}
                      className="collapse show"
                      aria-labelledby={`${index}`}
                      data-parent="#accordion"
                    >
                      <div className="card-body">{thread.text}</div>
                    </div>
                  </div>
                ))}
                <NewThread setNewThread={setNewThread} />
              </div>{" "}
            </div>
            <div
              className="tab-pane fade"
              id="list-clarification"
              role="tabpanel"
              aria-labelledby="list-clarification-list"
            >
              <div id="accordion">
                {threads.filter(filterClarification).map((thread, index) => (
                  <div className="card">
                    <div className="card-header" id={index}>
                      <h5 className="mb-0">
                        <div>
                          <img src={pencil} className="icon" />
                          <a href="https://www.freepik.com/free-vector/writting-pencil-design_850418.htm">
                            Designed by Yurlick / Freepik
                          </a>
                        </div>
                        <button
                          className="btn btn-link"
                          data-toggle="collapse"
                          data-target={`#d${index}`}
                          aria-expanded="true"
                          aria-controls={`d${index}`}
                        >
                          {thread.title}
                        </button>
                      </h5>
                    </div>
                    <div
                      id={`d${index}`}
                      className="collapse show"
                      aria-labelledby={`${index}`}
                      data-parent="#accordion"
                    >
                      <div className="card-body">{thread.text}</div>
                    </div>
                  </div>
                ))}
                <NewThread setNewThread={setNewThread} />
              </div>
            </div>
          </div>
        </div>
      </div>
      <NewThread setNewThread={setNewThread} />
      <div hidden={!newThread}>
        <div className="form-group">
          <label htmlFor="inputAddress">Title of Post</label>
          <input
            type="text"
            className="form-control"
            id="inputAddress"
            placeholder="Title of Post"
            onChange={validateTitle}
          />
        </div>
        <Category validTitle={validTitle} post={post} setPost={setPost} />
        <PostBody validTitle={validTitle} post={post} setPost={setPost} />
        <button type="submit" className="btn btn-primary" onClick={addNewPost}>
          Submit
        </button>
      </div>
    </div>
  );
}

export default App;
