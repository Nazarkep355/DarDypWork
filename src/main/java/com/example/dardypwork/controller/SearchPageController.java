package com.example.dardypwork.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class SearchPageController {
    @Autowired
    private AnnounceService service;

    @GetMapping("/search")
    public String AnnounceList(Pageable pageable, Model model, Optional<String> city) {
        if (city.isPresent()) {
            Page<Announcement> page = service.findByCity(city.get(), pageable);
            model.addAttribute("announces", page.getContent());
        } else {
            Page<Announcement> page = service.findByPageable(pageable);
            model.addAttribute("announces", page.getContent());
        }
        model.addAttribute("photo","bf901160-10dc-4a99-b3a8-d9d2a14feb67.2.0548072639162815E9banner-1544x500.png");
        return "search_page.html";
    }
