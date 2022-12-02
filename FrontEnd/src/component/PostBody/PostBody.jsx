import React from "react";

function PostBody(props) {
  function markPostBody(event) {
    const newPost = { ...props.post, "text": event.target.value };
    props.setPost(newPost);
  }
  return (
    <div className="form-group" hidden={!props.validTitle}>
      <label htmlFor="exampleFormControlTextarea1">Post Body</label>
      <textarea
        className="form-control"
        id="exampleFormControlTextarea1"
        rows="3"
        onChange={markPostBody}
      ></textarea>
    </div>
  );
}

export default PostBody;
