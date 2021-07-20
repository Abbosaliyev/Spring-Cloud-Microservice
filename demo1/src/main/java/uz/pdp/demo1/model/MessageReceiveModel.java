package uz.pdp.demo1.model;

/**
 * Created by
 * Sahobiddin Abbosaliyev
 * 7/17/2021
 */
public class MessageReceiveModel {
    private Long id;
    private String message;
    private Long createdDate;

    public MessageReceiveModel() {
    }

    public MessageReceiveModel(Long id, String message, Long createdDate) {
        this.id = id;
        this.message = message;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }
}
