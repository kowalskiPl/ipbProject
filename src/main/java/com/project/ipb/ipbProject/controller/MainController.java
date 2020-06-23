package com.project.ipb.ipbProject.controller;

import com.project.ipb.ipbProject.hibernateTools.HibernateDBUtil;
import com.project.ipb.ipbProject.model.Application;
import com.project.ipb.ipbProject.model.Car;
import com.project.ipb.ipbProject.model.Client;
import com.project.ipb.ipbProject.model.Estimate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
public class MainController {

    @RequestMapping(value = "/estimate", method = RequestMethod.GET)
    public ResponseEntity<Estimate> getEstimate(@RequestParam(name = "estimateid") long estimateId){
        return new ResponseEntity<>(HibernateDBUtil.getEstimate(estimateId), HttpStatus.OK);
    }

    @RequestMapping(value = "/estimates", method = RequestMethod.GET)
    public ResponseEntity<List<Estimate>> getEstimates(){
        return new ResponseEntity<>(HibernateDBUtil.getEstimates(), HttpStatus.OK);
    }

    @RequestMapping(value = "/application", method = RequestMethod.PUT)
    public HttpStatus insertApplication(@RequestBody Application application){
        HibernateDBUtil.insertApplication(application);
        return HttpStatus.OK;
    }

    @PostMapping("/carSubmit")
    public ModelAndView carSubmit(@ModelAttribute Car car) throws IOException {
        Application application = new Application();
        application.setDate(new Date());
        HibernateDBUtil.createApplication(1, application, car); //lmao hard code
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("carSubmit");
        return modelAndView;
    }

    @RequestMapping("/applicationList")
    public ModelAndView applicationList(Model model){
        List<Application> applications = HibernateDBUtil.getApplications();
        model.addAttribute("applicationList", applications);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("applicationList");
        return modelAndView;
    }

    @PostMapping("/applicationSubmit")
    public String applicationSubmit(@ModelAttribute Application application, @ModelAttribute Car car){
        return application.toString();
    }

    @RequestMapping(value = "/myApplications", method = RequestMethod.GET)
    public ModelAndView myApplications(Model model){
        List<Application> applications = HibernateDBUtil.getApplications(1); //KEKW hard code rofl shoot me pls
        model.addAttribute("applicationList", applications);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("myApplications");
        return modelAndView;
    }

    @RequestMapping(value = "/makeItModified", method = RequestMethod.POST)
    public ModelAndView makeItModified(@RequestParam(name = "applicationId")long id){
        HibernateDBUtil.makeItModified(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("makeItModified");
        return modelAndView;
    }
}
