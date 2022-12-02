import React from "react";

function NewPost(props) {
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

export default NewPost;
