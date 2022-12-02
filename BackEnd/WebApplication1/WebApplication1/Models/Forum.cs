using MongoDB.Bson;
using MongoDB.Bson.Serialization.Attributes;

namespace WebApplication1.Models
{
    public class Forum
    {
        [BsonId]
        public ObjectId id { get; set; }
        public string title { get; set; }
        public string text { get; set; }
        public string category { get; set; }

    }
}
