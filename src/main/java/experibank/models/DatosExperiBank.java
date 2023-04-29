package experibank.models;


import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class DatosExperiBank {

    private String usuario;
    private String clave;

    public static List<DatosExperiBank> setTablaDatos(DataTable dataTable) {
        List<DatosExperiBank> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, DatosExperiBank.class));
        }
        return dates;
    }

}
