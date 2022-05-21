
package com.epe.epe1.Service;

import com.epe.epe1.Model.Tarea;
import java.util.List;

public interface TareaService {
    public List<Tarea> findAll();
    public Tarea save(Tarea tarea);
    public Tarea findById(Integer id);
    public void delete(Integer id);
}

