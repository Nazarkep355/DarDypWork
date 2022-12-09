package com.example.dardypwork.entity.enums;

import com.example.dardypwork.entity.Residence;
import com.example.dardypwork.entity.State;
import com.example.dardypwork.entity.Status;
import com.example.dardypwork.entity.User;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private Date createDate;
    @Column
    private Date refreshDate;
    @ManyToOne
    @JoinColumn(name = "owner")
    private User owner;
    @ManyToOne
    @JoinColumn(name ="residence")
    private Residence residence;
    @ElementCollection
    private List<String> photo;
    @Column
    private String mainPhoto;
    @Column
    private State state;
    @Column
    private Status status;
    @Column
    private AppType appType;
    @Column
    private String additionalInfo;

}
