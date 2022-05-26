package com.example.BS5;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
public class errores {
    String error;
    public void muestra(){;
        log.trace("trace de prueba");
        log.debug("debug de prueba");
        log.info("info de prueba");
        log.warn("warn de prueba");
        log.error("error de prueba");
        log.error("Aquí hay un error");
    }
}
