package br.com.graphene.newtest.opentelemetry.dto;
import java.util.Objects;

public class TracingResponse{
    private final String message;

    public TracingResponse (final String message){
        Objects.requireNonNull(message);
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

}
