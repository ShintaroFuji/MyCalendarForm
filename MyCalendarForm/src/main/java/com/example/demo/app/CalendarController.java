package com.example.demo.app;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Calendar;
import com.example.demo.service.CalendarService;

@Controller
public class CalendarController {
	
	private final CalendarService calendarService;
	
	public CalendarController(CalendarService calendarService) {
		this.calendarService = calendarService;
	}

	@GetMapping("/index")
	public String index(Model model) {
		List<Calendar> list = calendarService.getAll();
		
		model.addAttribute("scheduleList", list);
		model.addAttribute("title", "スケジュール一覧");
		
		return "index";
	}
	
    @GetMapping("/calendar")
    public String showCalendarForm(Model model) {
        model.addAttribute("calendarForm", new CalendarForm());
        return "calendar";
    }

    @PostMapping("/calendar")	
    public String processCalendar(@Validated @ModelAttribute CalendarForm calendarForm, //フォームからデータを受け取りFormオブジェクトへ
                                     BindingResult result,	//バリデーションエラーを検出するため
                                     Model model) {	//ビューに渡すため使用
        if (result.hasErrors()) {
            // エラーハンドリング
            return "calendar";
        }
        
        // データベースに保存するためのエンティティを作成
        Calendar calendar = new Calendar();
        calendar.setDate(calendarForm.getDate());
        calendar.setStartTime(calendarForm.getStartTime());
        calendar.setEndTime(calendarForm.getEndTime());
        calendar.setDescription(calendarForm.getDescription());
        
        // CalendarServiceを通じてデータベースに保存
        calendarService.save(calendar);
        
        return "redirect:/calendar-view";
    }
    
    @GetMapping("/calendar-view")
    public String calendarView(Model model) {
        List<Calendar> scheduleList = calendarService.getAll();
        model.addAttribute("scheduleList", scheduleList);
        return "calendar-view";
    }


}
