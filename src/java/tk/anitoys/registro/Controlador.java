
package tk.anitoys.registro;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

    Conexion con = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.conectar());
    ModelAndView mav = new ModelAndView();

    @RequestMapping("index.htm")
    public ModelAndView listar() {
        String sql = "select * from administrador";
        List datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("datos", datos);
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping(value = "administrador.htm", method = RequestMethod.GET)
    public ModelAndView administrador() {
        mav.setViewName("administrador");
        return mav;
    }

    @RequestMapping(value = "administrador.htm", method = RequestMethod.POST)
    public ModelAndView administrador(Administrador ad) {
        String sql = "insert into administrador (usuario, password) values (?,?)";
        this.jdbcTemplate.update(sql, ad.getUsuario(),  ad.getPassword());
        return new ModelAndView("redirect:/index.htm");
    }

}
