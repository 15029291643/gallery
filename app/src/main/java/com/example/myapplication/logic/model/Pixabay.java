package com.example.myapplication.logic.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pixabay {
    private Integer total;
    private Integer totalHits;
    private List<HitsDTO> hits;

    public static class HitsDTO {
        private Integer id;
        private String pageURL;
        private String type;
        private String tags;
        private String previewURL;
        private Integer previewWidth;
        private Integer previewHeight;
        private String webformatURL;
        private Integer webformatWidth;
        private Integer webformatHeight;
        private String largeImageURL;
        private Integer imageWidth;
        private Integer imageHeight;
        private Integer imageSize;
        private Integer views;
        private Integer downloads;
        private Integer collections;
        private Integer likes;
        private Integer comments;
        private Integer userId;
        private String user;
        private String userImageURL;

        public HitsDTO() {
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getPageURL() {
            return pageURL;
        }

        public void setPageURL(String pageURL) {
            this.pageURL = pageURL;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public String getPreviewURL() {
            return previewURL;
        }

        public void setPreviewURL(String previewURL) {
            this.previewURL = previewURL;
        }

        public Integer getPreviewWidth() {
            return previewWidth;
        }

        public void setPreviewWidth(Integer previewWidth) {
            this.previewWidth = previewWidth;
        }

        public Integer getPreviewHeight() {
            return previewHeight;
        }

        public void setPreviewHeight(Integer previewHeight) {
            this.previewHeight = previewHeight;
        }

        public String getWebformatURL() {
            return webformatURL;
        }

        public void setWebformatURL(String webformatURL) {
            this.webformatURL = webformatURL;
        }

        public Integer getWebformatWidth() {
            return webformatWidth;
        }

        public void setWebformatWidth(Integer webformatWidth) {
            this.webformatWidth = webformatWidth;
        }

        public Integer getWebformatHeight() {
            return webformatHeight;
        }

        public void setWebformatHeight(Integer webformatHeight) {
            this.webformatHeight = webformatHeight;
        }

        public String getLargeImageURL() {
            return largeImageURL;
        }

        public void setLargeImageURL(String largeImageURL) {
            this.largeImageURL = largeImageURL;
        }

        public Integer getImageWidth() {
            return imageWidth;
        }

        public void setImageWidth(Integer imageWidth) {
            this.imageWidth = imageWidth;
        }

        public Integer getImageHeight() {
            return imageHeight;
        }

        public void setImageHeight(Integer imageHeight) {
            this.imageHeight = imageHeight;
        }

        public Integer getImageSize() {
            return imageSize;
        }

        public void setImageSize(Integer imageSize) {
            this.imageSize = imageSize;
        }

        public Integer getViews() {
            return views;
        }

        public void setViews(Integer views) {
            this.views = views;
        }

        public Integer getDownloads() {
            return downloads;
        }

        public void setDownloads(Integer downloads) {
            this.downloads = downloads;
        }

        public Integer getCollections() {
            return collections;
        }

        public void setCollections(Integer collections) {
            this.collections = collections;
        }

        public Integer getLikes() {
            return likes;
        }

        public void setLikes(Integer likes) {
            this.likes = likes;
        }

        public Integer getComments() {
            return comments;
        }

        public void setComments(Integer comments) {
            this.comments = comments;
        }

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getUserImageURL() {
            return userImageURL;
        }

        public void setUserImageURL(String userImageURL) {
            this.userImageURL = userImageURL;
        }

        @Override
        public String toString() {
            return "HitsDTO{" +
                    "id=" + id +
                    ", pageURL='" + pageURL + '\'' +
                    ", type='" + type + '\'' +
                    ", tags='" + tags + '\'' +
                    ", previewURL='" + previewURL + '\'' +
                    ", previewWidth=" + previewWidth +
                    ", previewHeight=" + previewHeight +
                    ", webformatURL='" + webformatURL + '\'' +
                    ", webformatWidth=" + webformatWidth +
                    ", webformatHeight=" + webformatHeight +
                    ", largeImageURL='" + largeImageURL + '\'' +
                    ", imageWidth=" + imageWidth +
                    ", imageHeight=" + imageHeight +
                    ", imageSize=" + imageSize +
                    ", views=" + views +
                    ", downloads=" + downloads +
                    ", collections=" + collections +
                    ", likes=" + likes +
                    ", comments=" + comments +
                    ", userId=" + userId +
                    ", user='" + user + '\'' +
                    ", userImageURL='" + userImageURL + '\'' +
                    '}';
        }
    }

    public Pixabay() {
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(Integer totalHits) {
        this.totalHits = totalHits;
    }

    public List<HitsDTO> getHits() {
        return hits;
    }

    public void setHits(List<HitsDTO> hits) {
        this.hits = hits;
    }

    @Override
    public String toString() {
        return "Pixabay{" +
                "total=" + total +
                ", totalHits=" + totalHits +
                ", hits=" + hits +
                '}';
    }
}
