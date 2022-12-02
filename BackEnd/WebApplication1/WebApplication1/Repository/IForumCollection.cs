using WebApplication1.Models;

namespace WebApplication1.Repository
{
    public interface IForumCollection
    {
        Task InsertForum(Forum forum);
        Task<List<Forum>> GetAllForums();
    }
}
