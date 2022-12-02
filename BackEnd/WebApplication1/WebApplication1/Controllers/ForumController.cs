using Microsoft.AspNetCore.Mvc;
using WebApplication1.Models;
using WebApplication1.Repository;

namespace WebApplication1.Controllers
{
    [ApiController]
    [Route("forum")]
    public class ForumController : ControllerBase
    {
        private IForumCollection db = new ForumColletion();

        [HttpGet]
        public async Task<IActionResult> GetAllForums()
        {
            return Ok(await db.GetAllForums());
        }
        [HttpPost]
        public async Task<IActionResult> CreateForum([FromBody] Forum forum)
        {
            if (forum == null)
                return BadRequest();
            if (forum.title==string.Empty)
            {
                ModelState.AddModelError("Title", "The forum shouldm't be empty");
            }
            await db.InsertForum(forum);
            return Created("Created", true);
        }
    }
}
