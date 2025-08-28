import java.util.*;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) {
            return 0;
        }
        int total = 0;
        for (int count : interactions) {
            total += count;
        }
        return total;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) {
            return "Viral";
        } else if (engagementScore >= 500) {
            return "Popular";
        } else if (engagementScore >= 100) {
            return "Good";
        } else if (engagementScore >= 50) {
            return "Low";
        } else {
            return "Poor";
        }
    }

    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }

    public ArrayList<String> manageHashtags(String[] hashtags) {
        Set<String> uniqueSet = new LinkedHashSet<>();
        if (hashtags != null) {

            int limit = Math.min(hashtags.length, 5);
            for (int i = 0; i < limit; i++) {
                if (hashtags[i] != null && !hashtags[i].isEmpty()) {
                    uniqueSet.add(hashtags[i]);
                }
            }
        }

        return new ArrayList<>(uniqueSet);
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        if (posts != null && postEngagement != null) {
            for (String post : posts) {
                Integer score = postEngagement.get(post);
                if (score != null && score > 500) {
                    trending.add(post);
                }
            }
        }
        return trending;
    }

    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> uniqueAuthors = new HashSet<>();
        if (authors != null) {
            for (String author : authors) {
                if (author != null && !author.isEmpty()) {
                    uniqueAuthors.add(author);
                }
            }
        }
        return uniqueAuthors;
    }


    public static void main(String[] args) {
        PostManager pm = new PostManager();

        System.out.println("═══ Social Media Post Manager ═══");

        String postTitle = "Java Programming Tips";
        int[] interactions = {150, 75, 25};
        int engagementScore = pm.calculateEngagement(interactions);
        String category = pm.getCategoryRating(engagementScore);
        pm.displayPostStats(postTitle, engagementScore, category);

        String[] hashtags = { "#java", "#coding", "#programming", "#java", "#tips" };
        ArrayList<String> uniqueHashtags = pm.manageHashtags(hashtags);
        ArrayList<String> posts = new ArrayList<>(Arrays.asList("Advanced Java Tutorial", "Spring Boot Guide", postTitle));
        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Advanced Java Tutorial", 800);
        postEngagement.put("Spring Boot Guide", 650);
        postEngagement.put(postTitle, engagementScore);
        LinkedList<String> trendingPosts = pm.findTrendingPosts(posts, postEngagement);
        HashSet<String> uniqueAuthorsSet = pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");

        System.out.println();

        System.out.print("Unique Hashtags: [");
        for (int i = 0; i < uniqueHashtags.size(); ++i) {
            System.out.print(uniqueHashtags.get(i));
            if (i < uniqueHashtags.size() - 1) System.out.print(", ");
        }
        System.out.println("]");

        System.out.print("Trending Posts: [");
        for (int i = 0; i < trendingPosts.size(); ++i) {
            System.out.print(trendingPosts.get(i));
            if (i < trendingPosts.size() - 1) System.out.print(", ");
        }
        System.out.println("]");

        List<String> authorOrder = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.print("Unique Authors: [");
        boolean first = true;
        for (String author : authorOrder) {
            if (uniqueAuthorsSet.contains(author)) {
                if (!first) System.out.print(", ");
                System.out.print(author);
                first = false;
            }
        }
        System.out.println("]");
    }
}