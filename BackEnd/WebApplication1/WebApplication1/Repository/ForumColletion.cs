using MongoDB.Bson;
using MongoDB.Driver;
using WebApplication1.Models;

namespace WebApplication1.Repository
{
    public class ForumColletion : IForumCollection
    {
        internal MongoDBRepository _repository = new MongoDBRepository();
        private IMongoCollection<Forum> Collection;

        public ForumColletion()
        {
            Collection = _repository.db.GetCollection<Forum>("Forums");
        }

        public async Task<List<Forum>> GetAllForums()
        {
            return await Collection.FindAsync(new BsonDocument()).Result.ToListAsync();
        }

        public async Task InsertForum(Forum forum)
        {
            await Collection.InsertOneAsync(forum);
        }
    }
}
