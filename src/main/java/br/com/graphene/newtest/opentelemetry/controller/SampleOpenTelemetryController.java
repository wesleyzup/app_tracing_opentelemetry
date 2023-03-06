package br.com.graphene.newtest.opentelemetry.controller;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.extension.annotations.WithSpan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.graphene.newtest.opentelemetry.dto.TracingResponse;

@RestController
@RequestMapping("/tracing")
public class SampleOpenTelemetryController {

    @WithSpan(value="MySpanName")
    @GetMapping
    public TracingResponse tracedMethodWithName() {
        Span currentSpan = Span.current();
        final TracingResponse response = new TracingResponse("Hello World");
        currentSpan.addEvent("ADDING EVENT TO tracedMethodWithName SPAN");
        currentSpan.setAttribute("isTestAttribute", true);
        return response;
    }

}
