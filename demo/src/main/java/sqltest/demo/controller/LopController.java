package sqltest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sqltest.demo.services.LopService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import sqltest.demo.entity.Lop;

@Controller
@RequestMapping("/lop")
public class LopController {
    @Autowired
    private LopService lopService;

    @GetMapping
    public String showAllLop (Model model){
        List<Lop> dsLop = lopService.getAllLop();
        model.addAttribute("dsLop", dsLop);
        return "lop/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model){
        model.addAttribute("lop", new Lop());
        return"lop/add";
    }

    @PostMapping("/add")
    public String addLop(@ModelAttribute("lop") Lop lop) {
        lopService.addLop(lop);
        return "redirect:/lop";
    }
}
