package com.example.demo.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("AppointmentForm")
public class CalendarController {

    @GetMapping("/calendar")
    public String showCalendarForm(Model model) {
        model.addAttribute("appointmentForm", new AppointmentForm());
        return "calendar";
    }

    @PostMapping("/calendar")	
    public String processAppointment(@Validated @ModelAttribute AppointmentForm appointmentForm, //フォームからデータを受け取りFormオブジェクトへ
                                     BindingResult result,	//バリデーションエラーを検出するため
                                     Model model) {	//ビューに渡すため使用
        if (result.hasErrors()) {
            // エラーハンドリング
            return "calendar";
        }
        	//なかったらviewへ
        return "redirect:/calendar-view";
    }
    
    @GetMapping("/calendar-view")
    public String calendarView(Model model, HttpSession session) {
        AppointmentForm appointmentForm = (AppointmentForm) session.getAttribute("appointmentForm");
        if (appointmentForm != null) {
            model.addAttribute("appointmentForm", appointmentForm);
        }
        return "calendar-view";
    }
}
        	//なかったらviewへ
        return "redirect:/calendar-view";
    }
}
