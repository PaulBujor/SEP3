using System.Collections.Generic;
using System.Threading.Tasks;
using DataServer.Models;

namespace DataServer.Persistence
{
    public interface IReview_Persistance
    {
        Task<Review> AddReview(Review review, long placeId);

        Task<List<Review>> GetReviews(long placeId);

        Task<Review> GetReview(long reviewId);

        Task UpdateReview(Review reviewItem);

        Task RemoveReview(long reviewId);
    }
}