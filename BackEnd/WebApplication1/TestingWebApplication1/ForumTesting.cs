
using Microsoft.AspNetCore.Mvc;
using WebApplication1.Controllers;
using WebApplication1.Models;
using WebApplication1.Repository;

namespace TestingWebApplication1
{
    public class ForumTesting
    {
        private readonly ForumController _controller;
        private readonly IForumCollection _forumCollection;

        public ForumTesting()
        {
            _forumCollection = new ForumColletion();
            _controller = new ForumController(_forumCollection);
        }

        [Fact]
        public void GetAllForums_Ok()
        {
            var result = _controller.GetAllForums();
            Assert.IsType<OkObjectResult>(result);
        }

        [Fact]
        public void Get_Quantity()
        {
            var result = _controller.GetAllForums();
            var forums = Assert.IsType<List<Forum>>(result);
            Assert.True(forums.Count > 0);
        }

        [Fact]
        public void CreateForum()
        {
            Forum forum = new Forum();
            var result = _controller.CreateForum(forum);
            Assert.IsType<OkObjectResult>(result);
        }

    }
}