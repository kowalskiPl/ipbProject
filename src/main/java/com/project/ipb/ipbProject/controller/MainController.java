package com.project.ipb.ipbProject.controller;

import com.project.ipb.ipbProject.hibernateTools.HibernateDBUtil;
import com.project.ipb.ipbProject.model.Estimate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @RequestMapping(value = "/estimate/{estimateId}", method = RequestMethod.GET)
    public ResponseEntity<Estimate> getEstimate(@PathVariable long estimateId){
        return new ResponseEntity<>(HibernateDBUtil.getEstimate(estimateId), HttpStatus.OK);
    }

    @RequestMapping(value = "/estimates", method = RequestMethod.GET)
    public ResponseEntity<List<Estimate>> getEstimates(){
        return new ResponseEntity<>(HibernateDBUtil.getEstimates(), HttpStatus.OK);
    }
}
