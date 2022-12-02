import React from "react";

function NewThread(props) {
  return (
    <button
      type="button"
      className="btn btn-outline-primary"
      onClick={() => {
        props.setNewThread(true);
      }}
    >
      New Post
    </button>
  );
}

export default NewThread;
