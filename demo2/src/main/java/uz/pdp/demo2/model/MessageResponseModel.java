package uz.pdp.demo2.model;

/**
 * Created by
 * Sahobiddin Abbosaliyev
 * 7/17/2021
 */
public class MessageResponseModel {
    private int id;
    private String message;

    public MessageResponseModel() {
    }

    public MessageResponseModel(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
