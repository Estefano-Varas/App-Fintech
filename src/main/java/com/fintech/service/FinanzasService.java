
package com.fintech.service;

public class FinanzasService {
    public class FinanzasService {
    private IngresoService ingresoService;
    private GastoService gastoService;
    private ReporteService reporteService;
    private AlertaService alertaService;

    public FinanzasService(IngresoService is, GastoService gs, ReporteService rs, AlertaService as) {
        this.ingresoService = is; this.gastoService = gs; this.reporteService = rs; this.alertaService = as;
    }

    public Reporte generarReporte() {
        double ti = ingresoService.totalIngresos();
        double tg = gastoService.totalGastos();
        if (tg > ti) alertaService.push("Su balance es negativo: Gastos > Ingresos");
        return reporteService.generar(ti, tg);
    }
}

    
  
}
