import React from "react";

function Category(props) {
  function markCategory(event) {
    const newPost = { ...props.post, "category": event.target.value };
    props.setPost(newPost);
  }
  return (
    <div
      className="form-group col-md-4"
      hidden={!props.validTitle}
      onChange={markCategory}
    >
      <label htmlFor="inputState">Category</label>
      <select id="inputState" className="form-control">
        <option defaultValue>Question</option>
        <option>Suggestion</option>
        <option>Clarification</option>
      </select>
    </div>
  );
}

export default Category;
