CREATE TABLE `visitor` (
  `id` bigint(100) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `contact_person_email` varchar(255) DEFAULT NULL,
  `contact_person_name` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
   `mobile_no` bigint(100) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `id_proof` varchar(255) DEFAULT NULL,
   `name` varchar(255) DEFAULT NULL,
    `reason_for_visit` varchar(255) DEFAULT NULL,
     `reference` varchar(255) DEFAULT NULL,
    `state` varchar(255) DEFAULT NULL,
     `status` int(11) NOT NULL,
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;



CREATE TABLE `ticket` (
  `ticket_id` int(11) NOT NULL AUTO_INCREMENT,
  `create_date_time` Date DEFAULT NULL,
  in_time  TIME DEFAULT NULL,
  out_time TIME DEFAULT NULL,

  PRIMARY KEY (`ticket_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;









