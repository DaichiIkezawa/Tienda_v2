package com.tienda_v2.controller;

import com.tienda_v2.domain.Usuario;
import com.tienda_v2.service.ReporteService;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reportes")
public class ReporteController {

    @Autowired
    ReporteService reporteService;

    @GetMapping("/principal")
    public String principal(Model model) {
        return "/reportes/principal";
    }

    @GetMapping("/usuarios")
    public ResponseEntity<Resource>
            usuarios(@RequestParam String tipo) throws IOException {
        return reporteService.generarReporte("usuarios",
                null,
                tipo);
    }

    @GetMapping("/ventas")
    public ResponseEntity<Resource>
            ventas(@RequestParam String tipo) throws IOException {
        return reporteService.generarReporte("ventas",
                null,
                tipo);
    }

    @GetMapping("/Categoria")
    public ResponseEntity<Resource>
            categoria(@RequestParam String tipo) throws IOException {
        return reporteService.generarReporte("Categoria",
                null,
                tipo);
    }
            
    @GetMapping("/productos")
    public ResponseEntity<Resource>
            productos(@RequestParam String tipo) throws IOException {
        return reporteService.generarReporte("productos",
                null,
                tipo);
    }
}
