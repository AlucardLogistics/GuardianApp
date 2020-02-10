package com.alucardlogistics.guardianapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results {
    @Expose
    @SerializedName("pillarName")
    private String pillarName;
    @Expose
    @SerializedName("pillarId")
    private String pillarId;
    @Expose
    @SerializedName("isHosted")
    private boolean isHosted;
    @Expose
    @SerializedName("apiUrl")
    private String apiUrl;
    @Expose
    @SerializedName("webUrl")
    private String webUrl;
    @Expose
    @SerializedName("webTitle")
    private String webTitle;
    @Expose
    @SerializedName("webPublicationDate")
    private String webPublicationDate;
    @Expose
    @SerializedName("sectionName")
    private String sectionName;
    @Expose
    @SerializedName("sectionId")
    private String sectionId;
    @Expose
    @SerializedName("type")
    private String type;
    @Expose
    @SerializedName("id")
    private String id;

    public String getPillarName() {
        return pillarName;
    }

    public void setPillarName(String pillarName) {
        this.pillarName = pillarName;
    }

    public String getPillarId() {
        return pillarId;
    }

    public void setPillarId(String pillarId) {
        this.pillarId = pillarId;
    }

    public boolean getIsHosted() {
        return isHosted;
    }

    public void setIsHosted(boolean isHosted) {
        this.isHosted = isHosted;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public void setWebTitle(String webTitle) {
        this.webTitle = webTitle;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public void setWebPublicationDate(String webPublicationDate) {
        this.webPublicationDate = webPublicationDate;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
