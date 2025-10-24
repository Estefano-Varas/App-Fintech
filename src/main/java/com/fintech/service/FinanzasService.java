
package com.fintech.service;

public class FinanzasService {
    
    private IngresoService ingresoService;
    private GastoService gastoService;
    private ReporteService reporteService;
    private AlertaService alertaService;

    public FinanzasService(IngresoService is, GastoService gs, ReporteService rs, AlertaService as) {
        this.ingresoService = is; this.gastoService = gs; this.reporteService = rs; this.alertaService = as;
    }


    }


    
  

