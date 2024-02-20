package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}kpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
};package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ypackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
};package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}vpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}vpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
};package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}fpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}wpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}kpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}fpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ypackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}upackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}wpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
};package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}fpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}wpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}kpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}wpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
};package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}fpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}wpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}kpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}wpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
};package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}fpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}wpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}kpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}wpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}qpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}upackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
};package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}fpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}wpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}kpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}wpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
};package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}jpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}vpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}upackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
};package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}/package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}*package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}*package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}*package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}fpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}*package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}/package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}@package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}@package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}@package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}qpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}upackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}(package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}"package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}/package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}"package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
})package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}upackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}{package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}vpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}fpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}vpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}vpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
};package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}@package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}upackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}wpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}upackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}(package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}vpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}vpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
})package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}{package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}hpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}vpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}=package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}vpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
};package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}}package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}/package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}*package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}*package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}*package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}fpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}*package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}*package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}@package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}upackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}opackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}fpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}*package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}/package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}@package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Mpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ppackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}upackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}<package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}>package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}(package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
})package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}{package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}upackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}npackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}rpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}vpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}ipackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}cpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}.package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}tpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}lpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}Bpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}apackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}dpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}gpackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}epackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}spackage com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}(package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
})package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
};package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
} package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}}package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}}package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for Badge entities.
 */
@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * Endpoint for getting all badges.
     *
     * @return list of all badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}