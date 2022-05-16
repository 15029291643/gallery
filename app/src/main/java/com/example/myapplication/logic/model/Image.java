package com.example.myapplication.logic.model;

import java.io.Serializable;
import java.util.List;

public class Image implements Serializable {

    private int total;
    private int totalHits;
    private List<Hits> hits;

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotalHits(int totalHits) {
        this.totalHits = totalHits;
    }

    public int getTotalHits() {
        return totalHits;
    }

    public void setHits(List<Hits> hits) {
        this.hits = hits;
    }

    public List<Hits> getHits() {
        return hits;
    }

    public class Hits implements Serializable {

        private long id;
        private String pageURL;
        private String type;
        private String tags;
        private String previewURL;
        private int previewWidth;
        private int previewHeight;
        private String webformatURL;
        private int webformatWidth;
        private int webformatHeight;
        private String largeImageURL;
        private int imageWidth;
        private int imageHeight;
        private long imageSize;
        private long views;
        private long downloads;
        private int collections;
        private int likes;
        private int comments;
        private long user_id;
        private String user;
        private String userImageURL;

        public void setId(long id) {
            this.id = id;
        }

        public long getId() {
            return id;
        }

        public void setPageURL(String pageURL) {
            this.pageURL = pageURL;
        }

        public String getPageURL() {
            return pageURL;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public String getTags() {
            return tags;
        }

        public void setPreviewURL(String previewURL) {
            this.previewURL = previewURL;
        }

        public String getPreviewURL() {
            return previewURL;
        }

        public void setPreviewWidth(int previewWidth) {
            this.previewWidth = previewWidth;
        }

        public int getPreviewWidth() {
            return previewWidth;
        }

        public void setPreviewHeight(int previewHeight) {
            this.previewHeight = previewHeight;
        }

        public int getPreviewHeight() {
            return previewHeight;
        }

        public void setWebformatURL(String webformatURL) {
            this.webformatURL = webformatURL;
        }

        public String getWebformatURL() {
            return webformatURL;
        }

        public void setWebformatWidth(int webformatWidth) {
            this.webformatWidth = webformatWidth;
        }

        public int getWebformatWidth() {
            return webformatWidth;
        }

        public void setWebformatHeight(int webformatHeight) {
            this.webformatHeight = webformatHeight;
        }

        public int getWebformatHeight() {
            return webformatHeight;
        }

        public void setLargeImageURL(String largeImageURL) {
            this.largeImageURL = largeImageURL;
        }

        public String getLargeImageURL() {
            return largeImageURL;
        }

        public void setImageWidth(int imageWidth) {
            this.imageWidth = imageWidth;
        }

        public int getImageWidth() {
            return imageWidth;
        }

        public void setImageHeight(int imageHeight) {
            this.imageHeight = imageHeight;
        }

        public int getImageHeight() {
            return imageHeight;
        }

        public void setImageSize(long imageSize) {
            this.imageSize = imageSize;
        }

        public long getImageSize() {
            return imageSize;
        }

        public void setViews(long views) {
            this.views = views;
        }

        public long getViews() {
            return views;
        }

        public void setDownloads(long downloads) {
            this.downloads = downloads;
        }

        public long getDownloads() {
            return downloads;
        }

        public void setCollections(int collections) {
            this.collections = collections;
        }

        public int getCollections() {
            return collections;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public int getLikes() {
            return likes;
        }

        public void setComments(int comments) {
            this.comments = comments;
        }

        public int getComments() {
            return comments;
        }

        public void setUser_id(long user_id) {
            this.user_id = user_id;
        }

        public long getUser_id() {
            return user_id;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getUser() {
            return user;
        }

        public void setUserImageURL(String userImageURL) {
            this.userImageURL = userImageURL;
        }

        public String getUserImageURL() {
            return userImageURL;
        }

    }
}