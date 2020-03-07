package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value="")
@ResponseBody
public class SkillsController {

    @GetMapping
    public String skillsHome() {
        String html =
                "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

        return html;
    }

    @GetMapping("form")
    public String form() {
        String html =
                "<html>" +
                        "<body>" +
                            "<form method = 'post' action = '/formSubmit'>" +
                                "<label>Name:</label>" +
                                "<input type = 'text' name = 'user' />" +
                                "<br>" +
                                "<label>My favorite language:</label>" +
                                "<select name='firstLang'>" +
                                    "<option value='java'>Java</option>" +
                                    "<option value='javaScript'>JavaScript</option>" +
                                    "<option value='python'>Python</option>" +
                                "</select>" +
                                "<br>" +
                                "<label>My second favorite language:</label>" +
                                "<select name='secondLang'>" +
                                   "<option value='java'>Java</option>" +
                                   "<option value='javaScript'>JavaScript</option>" +
                                   "<option value='python'>Python</option>" +
                                "</select>" +
                                "<br>" +
                                "<label>My third favorite language:</label>" +
                                "<select name='thirdLang'>" +
                                    "<option value='Java'>Java</option>" +
                                    "<option value='JavaScript'>JavaScript</option>" +
                                    "<option value='Python'>Python</option>" +
                                "</select>" +
                                "<input type='submit' value='Submit' />" +
                            "</form>" +
                        "</body>" +
                "</html>";

        return html;
    }

    @PostMapping("formSubmit")
    public String formSubmit(@RequestParam String user,
                             @RequestParam String firstLang,
                             @RequestParam String secondLang,
                             @RequestParam String thirdLang){
        String html =                 "<html>" +
                "<body>" +
                "<h1>" + user + "</h1>" +
                "<ol>" +
                "<li>" + firstLang + "</li>" +
                "<li>" + secondLang + "</li>" +
                "<li>" + thirdLang + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";

        return html;
    }

}
