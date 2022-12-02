using MongoDB.Driver;

namespace WebApplication1.Repository
{
    public class MongoDBRepository
    {
        public MongoClient client;

        public IMongoDatabase db;

        public MongoDBRepository()
        {
            client = new MongoClient("mongodb+srv://pcm:KyZoNylSf20LI5zX@cluster0.u69swpg.mongodb.net/Project04Solera?retryWrites=true&w=majority");
            db = client.GetDatabase("Forum");
        }

    }
}
