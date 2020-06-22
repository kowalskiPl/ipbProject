package com.project.ipb.ipbProject.controller;

import com.project.ipb.ipbProject.hibernateTools.HibernateDBUtil;
import com.project.ipb.ipbProject.model.Application;
import com.project.ipb.ipbProject.model.Car;
import com.project.ipb.ipbProject.model.Client;
import com.project.ipb.ipbProject.model.Estimate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
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


//    @RequestMapping(value = "/car", method = RequestMethod.PUT)
//    public HttpStatus insertApplication(@RequestBody Car car){
//        System.out.println(car);
////        HibernateDBUtil.insertApplication(application);
//        return HttpStatus.OK;
//    }

    @PostMapping("/carSubmit")
    public ModelAndView carSubmit(@ModelAttribute Car car) throws IOException {
        Application application = new Application();
        application.setClient(new Client("Frank", "Klepacki"));
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("carSubmit");
        return modelAndView;
    }

//    @GetMapping("/car")
//    @ResponseBody
//    public String greetingForm(Model model) {
//        model.addAttribute("car", new Car());
//        return "car";
//    }

    @PostMapping("/applicationSubmit")
    public String applicationSubmit(@ModelAttribute Application application, @ModelAttribute Car car){
        return application.toString();
    }

    @RequestMapping(value = "/application", method = RequestMethod.GET)
    public ResponseEntity<Application> insertApplication(@RequestParam(name = "applicationid") long applicationId){
        return new ResponseEntity<>(HibernateDBUtil.getApplication(applicationId), HttpStatus.OK);
        //TODO: make new application insertion with client and the car
    }
}
