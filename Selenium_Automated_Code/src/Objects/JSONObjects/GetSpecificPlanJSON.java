package Objects.JSONObjects;

public class GetSpecificPlanJSON {
    private String billing_frequency;
    private String billing_frequency_notes;
    private String company_id;
    private String display_name;
    private String end_day;
    private String frequency;
    private String frequency_notes;
    private int id;
    private Boolean include_services_on_sidebar;
    private String kind;
    private String measurement_unit;
    private String name;
    private String pricing_rule;
    private String quotable_only;
    private String start_day;
    private String recurring_charges_count;
    private planJSON[] add_ons;
    private planJSON[] available_add_ons;
    private planJSON[] available_plans;
//    private [] covered_property_types;
//    private [] options;
//    private [] plans;
//    private [] pricing_tiers;
    

//    {
//        String billing_frequency;
//        private String billing_frequency_notes;
//
//        "plan": {
//
//        "billing_frequency": "per_service",
//                "billing_frequency_notes": "",
//                "company_id": 961,
//                "display_name": "Carpenter Bees Addon",
//                "end_day": "0000-12-31",
//                "frequency": "one_time",
//                "frequency_notes": "",
//                "id": 571,
//                "include_services_on_sidebar": true,
//                "kind": "add_on",
//                "measurement_unit": "Default",
//                "name": "Carpenter Bees Addon",
//                "pricing_rule": "always_apply",
//                "quotable_only": false,
//                "start_day": "0000-01-01",
//                "recurring_charges_count": null,
//                "add_ons": [],
//        "available_add_ons": [
//        {
//            "id": 571,
//                "name": "Carpenter Bees Addon",
//                "kind": "add_on",
//                "frequency": "one_time",
//                "service_maps_count": 0,
//                "pricing_tiers_count": 0,
//                "pricing_tier_min_price": 0,
//                "pricing_tier_max_price": 0,
//                "services_count": 81
//        }
//        ],
//        "available_plans": [
//        {
//            "id": 572,
//                "name": "Carpenter Bees Standalone One Time",
//                "kind": "plan",
//                "frequency": "one_time",
//                "service_maps_count": 0,
//                "pricing_tiers_count": 2,
//                "pricing_tier_min_price": 1000,
//                "pricing_tier_max_price": 3000,
//                "services_count": 81
//        },
//        {
//            "id": 570,
//                "name": "Lawn Care",
//                "kind": "plan",
//                "frequency": "monthly",
//                "service_maps_count": 2,
//                "pricing_tiers_count": 13,
//                "pricing_tier_min_price": 3000,
//                "pricing_tier_max_price": 25000,
//                "services_count": 15
//        },
//        {
//            "id": 568,
//                "name": "One-Time",
//                "kind": "plan",
//                "frequency": "one_time",
//                "service_maps_count": 3,
//                "pricing_tiers_count": 2,
//                "pricing_tier_min_price": 0,
//                "pricing_tier_max_price": 30000,
//                "services_count": 48
//        },
//        {
//            "id": 567,
//                "name": "Quarterly (4 Total Services)",
//                "kind": "plan",
//                "frequency": "quarterly",
//                "service_maps_count": 3,
//                "pricing_tiers_count": 5,
//                "pricing_tier_min_price": 3500,
//                "pricing_tier_max_price": 15000,
//                "services_count": 48
//        }
//        ],
//        "covered_property_types": [],
//        "options": [],
//        "plans": [],
//        "pricing_tiers": [],
//        "service_maps": [],
//        "services": [
//        {
//            "id": 1,
//                "name": "American Roaches",
//                "guaranteed": null
//        },
//        {
//            "id": 2,
//                "name": "Ants Common",
//                "guaranteed": null
//        },
//        {
//            "id": 3,
//                "name": "Aphids",
//                "guaranteed": null
//        },
//        {
//            "id": 4,
//                "name": "Argentine Ants",
//                "guaranteed": null
//        },
//        {
//            "id": 5,
//                "name": "Armadillos",
//                "guaranteed": null
//        },
//        {
//            "id": 10,
//                "name": "Bed Bugs",
//                "guaranteed": null
//        },
//        {
//            "id": 11,
//                "name": "Beetles Unidentified",
//                "guaranteed": null
//        },
//        {
//            "id": 13,
//                "name": "Billbugs",
//                "guaranteed": null
//        },
//        {
//            "id": 16,
//                "name": "Black Widow Spiders",
//                "guaranteed": null
//        },
//        {
//            "id": 17,
//                "name": "Boxelder Bugs",
//                "guaranteed": null
//        },
//        {
//            "id": 18,
//                "name": "Brown Recluse Spiders",
//                "guaranteed": null
//        },
//        {
//            "id": 21,
//                "name": "Carpenter Ants",
//                "guaranteed": null
//        },
//        {
//            "id": 22,
//                "name": "Carpenter Bees",
//                "guaranteed": null
//        },
//        {
//            "id": 23,
//                "name": "Carpet Beetles",
//                "guaranteed": null
//        },
//        {
//            "id": 24,
//                "name": "Centipedes",
//                "guaranteed": null
//        },
//        {
//            "id": 25,
//                "name": "Chiggers",
//                "guaranteed": null
//        },
//        {
//            "id": 27,
//                "name": "Cicada Killers",
//                "guaranteed": null
//        },
//        {
//            "id": 29,
//                "name": "Cloth Moths",
//                "guaranteed": null
//        },
//        {
//            "id": 30,
//                "name": "Clover Mites",
//                "guaranteed": null
//        },
//        {
//            "id": 32,
//                "name": "Crazy Ants",
//                "guaranteed": null
//        },
//        {
//            "id": 33,
//                "name": "Crickets Common",
//                "guaranteed": null
//        },
//        {
//            "id": 35,
//                "name": "Drain Flies",
//                "guaranteed": null
//        },
//        {
//            "id": 36,
//                "name": "Earwigs",
//                "guaranteed": null
//        },
//        {
//            "id": 37,
//                "name": "Elm Seed Bugs",
//                "guaranteed": null
//        },
//        {
//            "id": 38,
//                "name": "Fire Ants",
//                "guaranteed": null
//        },
//        {
//            "id": 40,
//                "name": "Fleas",
//                "guaranteed": null
//        },
//        {
//            "id": 41,
//                "name": "Flies Common",
//                "guaranteed": null
//        },
//        {
//            "id": 43,
//                "name": "Fruit Flies",
//                "guaranteed": null
//        },
//        {
//            "id": 44,
//                "name": "German Roaches",
//                "guaranteed": null
//        },
//        {
//            "id": 46,
//                "name": "Gnats",
//                "guaranteed": null
//        },
//        {
//            "id": 48,
//                "name": "Grain Beetles",
//                "guaranteed": null
//        },
//        {
//            "id": 50,
//                "name": "Ground Beetles",
//                "guaranteed": null
//        },
//        {
//            "id": 52,
//                "name": "Grubs",
//                "guaranteed": null
//        },
//        {
//            "id": 53,
//                "name": "Honey Bees",
//                "guaranteed": null
//        },
//        {
//            "id": 54,
//                "name": "Hornets",
//                "guaranteed": null
//        },
//        {
//            "id": 55,
//                "name": "House Flies",
//                "guaranteed": null
//        },
//        {
//            "id": 56,
//                "name": "Japanese Beetles",
//                "guaranteed": null
//        },
//        {
//            "id": 58,
//                "name": "Lady Bugs",
//                "guaranteed": null
//        },
//        {
//            "id": 59,
//                "name": "Lawn Service",
//                "guaranteed": null
//        },
//        {
//            "id": 62,
//                "name": "Mice",
//                "guaranteed": null
//        },
//        {
//            "id": 63,
//                "name": "Millipedes",
//                "guaranteed": null
//        },
//        {
//            "id": 65,
//                "name": "Moles",
//                "guaranteed": null
//        },
//        {
//            "id": 66,
//                "name": "Mosquitoes",
//                "guaranteed": null
//        },
//        {
//            "id": 67,
//                "name": "Moths",
//                "guaranteed": null
//        },
//        {
//            "id": 68,
//                "name": "Mud Daubers",
//                "guaranteed": null
//        },
//        {
//            "id": 69,
//                "name": "Non-German Roaches",
//                "guaranteed": null
//        },
//        {
//            "id": 71,
//                "name": "Odorous House Ants",
//                "guaranteed": null
//        },
//        {
//            "id": 72,
//                "name": "Oriental Roaches",
//                "guaranteed": null
//        },
//        {
//            "id": 73,
//                "name": "Palmetto Bugs",
//                "guaranteed": null
//        },
//        {
//            "id": 74,
//                "name": "Pantry / Indian Meal Moths",
//                "guaranteed": null
//        },
//        {
//            "id": 75,
//                "name": "Pantry Weevils",
//                "guaranteed": null
//        },
//        {
//            "id": 76,
//                "name": "Paper Wasps",
//                "guaranteed": null
//        },
//        {
//            "id": 79,
//                "name": "Pill Bugs",
//                "guaranteed": null
//        },
//        {
//            "id": 80,
//                "name": "Possums / Opossums",
//                "guaranteed": null
//        },
//        {
//            "id": 81,
//                "name": "Powderpost Beetles",
//                "guaranteed": null
//        },
//        {
//            "id": 83,
//                "name": "Raccoons",
//                "guaranteed": null
//        },
//        {
//            "id": 87,
//                "name": "Scorpions",
//                "guaranteed": null
//        },
//        {
//            "id": 88,
//                "name": "Silverfish",
//                "guaranteed": null
//        },
//        {
//            "id": 90,
//                "name": "Slugs",
//                "guaranteed": null
//        },
//        {
//            "id": 91,
//                "name": "Snails",
//                "guaranteed": null
//        },
//        {
//            "id": 94,
//                "name": "Spider Mites",
//                "guaranteed": null
//        },
//        {
//            "id": 95,
//                "name": "Spiders Common",
//                "guaranteed": null
//        },
//        {
//            "id": 96,
//                "name": "Springtails",
//                "guaranteed": null
//        },
//        {
//            "id": 97,
//                "name": "Squirrels",
//                "guaranteed": null
//        },
//        {
//            "id": 98,
//                "name": "Stink Bugs",
//                "guaranteed": null
//        },
//        {
//            "id": 99,
//                "name": "Sugar Ants",
//                "guaranteed": null
//        },
//        {
//            "id": 101,
//                "name": "Termite Monitoring",
//                "guaranteed": null
//        },
//        {
//            "id": 102,
//                "name": "Termite Pre-treatment",
//                "guaranteed": null
//        },
//        {
//            "id": 103,
//                "name": "Termites",
//                "guaranteed": null
//        },
//        {
//            "id": 104,
//                "name": "Ticks",
//                "guaranteed": null
//        },
//        {
//            "id": 105,
//                "name": "Voles",
//                "guaranteed": null
//        },
//        {
//            "id": 106,
//                "name": "Wasps",
//                "guaranteed": null
//        },
//        {
//            "id": 107,
//                "name": "Waterbugs",
//                "guaranteed": null
//        },
//        {
//            "id": 108,
//                "name": "WDI Report (W.D.I.R.)",
//                "guaranteed": null
//        },
//        {
//            "id": 110,
//                "name": "Weevils",
//                "guaranteed": null
//        },
//        {
//            "id": 114,
//                "name": "Wolf Spiders",
//                "guaranteed": null
//        },
//        {
//            "id": 115,
//                "name": "Wood Boring Beetles",
//                "guaranteed": null
//        },
//        {
//            "id": 117,
//                "name": "Yellow Jackets",
//                "guaranteed": null
//        },
//        {
//            "id": 126,
//                "name": "None",
//                "guaranteed": null
//        },
//        {
//            "id": 143,
//                "name": "Cluster Flies",
//                "guaranteed": null
//        },
//        {
//            "id": 163,
//                "name": "Asian Roaches",
//                "guaranteed": null
//        }
//        ]
//    },
//        "billing_frequencies": [
//        "custom_billing",
//                "per_month",
//                "per_service",
//                "per_year"
//    ],
//        "frequencies": [
//        "bi_annual",
//                "bi_annual_b2b",
//                "bi_monthly",
//                "bi_monthly_b2b",
//                "custom",
//                "monthly",
//                "one_time",
//                "quarterly",
//                "quarterly_b2b",
//                "tri_annual",
//                "tri_annual_b2b",
//                "yearly"
//    ],
//        "service_maps": [
//        {
//            "id": 2642,
//                "name": "Jacksonville"
//        },
//        {
//            "id": 2643,
//                "name": "Tallahassee - Lawncare Offered"
//        },
//        {
//            "id": 2641,
//                "name": "Tallahassee - Lawncare Not Offered"
//        }
//    ],
//        "options": [],
//        "pricing_rules": [
//        "always_apply",
//                "minimum_must_be",
//                "use_highest"
//    ],
//        "property_types": [
//        {
//            "id": 1,
//                "name": "Single-Family Home"
//        },
//        {
//            "id": 2,
//                "name": "Townhouse"
//        },
//        {
//            "id": 3,
//                "name": "Condo"
//        },
//        {
//            "id": 4,
//                "name": "Apartment"
//        },
//        {
//            "id": 5,
//                "name": "Mobile Home"
//        },
//        {
//            "id": 6,
//                "name": "Commercial Property"
//        },
//        {
//            "id": 7,
//                "name": "Multi-Unit Residence"
//        }
//    ],
//        "services": [
//        {
//            "id": 1,
//                "name": "American Roaches"
//        },
//        {
//            "id": 2,
//                "name": "Ants Common"
//        },
//        {
//            "id": 3,
//                "name": "Aphids"
//        },
//        {
//            "id": 4,
//                "name": "Argentine Ants"
//        },
//        {
//            "id": 5,
//                "name": "Armadillos"
//        },
//        {
//            "id": 10,
//                "name": "Bed Bugs"
//        },
//        {
//            "id": 11,
//                "name": "Beetles Unidentified"
//        },
//        {
//            "id": 13,
//                "name": "Billbugs"
//        },
//        {
//            "id": 16,
//                "name": "Black Widow Spiders"
//        },
//        {
//            "id": 17,
//                "name": "Boxelder Bugs"
//        },
//        {
//            "id": 18,
//                "name": "Brown Recluse Spiders"
//        },
//        {
//            "id": 21,
//                "name": "Carpenter Ants"
//        },
//        {
//            "id": 22,
//                "name": "Carpenter Bees"
//        },
//        {
//            "id": 23,
//                "name": "Carpet Beetles"
//        },
//        {
//            "id": 24,
//                "name": "Centipedes"
//        },
//        {
//            "id": 25,
//                "name": "Chiggers"
//        },
//        {
//            "id": 27,
//                "name": "Cicada Killers"
//        },
//        {
//            "id": 29,
//                "name": "Cloth Moths"
//        },
//        {
//            "id": 30,
//                "name": "Clover Mites"
//        },
//        {
//            "id": 32,
//                "name": "Crazy Ants"
//        },
//        {
//            "id": 33,
//                "name": "Crickets Common"
//        },
//        {
//            "id": 35,
//                "name": "Drain Flies"
//        },
//        {
//            "id": 36,
//                "name": "Earwigs"
//        },
//        {
//            "id": 37,
//                "name": "Elm Seed Bugs"
//        },
//        {
//            "id": 38,
//                "name": "Fire Ants"
//        },
//        {
//            "id": 40,
//                "name": "Fleas"
//        },
//        {
//            "id": 41,
//                "name": "Flies Common"
//        },
//        {
//            "id": 43,
//                "name": "Fruit Flies"
//        },
//        {
//            "id": 44,
//                "name": "German Roaches"
//        },
//        {
//            "id": 46,
//                "name": "Gnats"
//        },
//        {
//            "id": 48,
//                "name": "Grain Beetles"
//        },
//        {
//            "id": 50,
//                "name": "Ground Beetles"
//        },
//        {
//            "id": 52,
//                "name": "Grubs"
//        },
//        {
//            "id": 53,
//                "name": "Honey Bees"
//        },
//        {
//            "id": 54,
//                "name": "Hornets"
//        },
//        {
//            "id": 55,
//                "name": "House Flies"
//        },
//        {
//            "id": 56,
//                "name": "Japanese Beetles"
//        },
//        {
//            "id": 58,
//                "name": "Lady Bugs"
//        },
//        {
//            "id": 59,
//                "name": "Lawn Service"
//        },
//        {
//            "id": 62,
//                "name": "Mice"
//        },
//        {
//            "id": 63,
//                "name": "Millipedes"
//        },
//        {
//            "id": 65,
//                "name": "Moles"
//        },
//        {
//            "id": 66,
//                "name": "Mosquitoes"
//        },
//        {
//            "id": 67,
//                "name": "Moths"
//        },
//        {
//            "id": 68,
//                "name": "Mud Daubers"
//        },
//        {
//            "id": 69,
//                "name": "Non-German Roaches"
//        },
//        {
//            "id": 71,
//                "name": "Odorous House Ants"
//        },
//        {
//            "id": 72,
//                "name": "Oriental Roaches"
//        },
//        {
//            "id": 73,
//                "name": "Palmetto Bugs"
//        },
//        {
//            "id": 74,
//                "name": "Pantry / Indian Meal Moths"
//        },
//        {
//            "id": 75,
//                "name": "Pantry Weevils"
//        },
//        {
//            "id": 76,
//                "name": "Paper Wasps"
//        },
//        {
//            "id": 79,
//                "name": "Pill Bugs"
//        },
//        {
//            "id": 80,
//                "name": "Possums / Opossums"
//        },
//        {
//            "id": 81,
//                "name": "Powderpost Beetles"
//        },
//        {
//            "id": 83,
//                "name": "Raccoons"
//        },
//        {
//            "id": 87,
//                "name": "Scorpions"
//        },
//        {
//            "id": 88,
//                "name": "Silverfish"
//        },
//        {
//            "id": 90,
//                "name": "Slugs"
//        },
//        {
//            "id": 91,
//                "name": "Snails"
//        },
//        {
//            "id": 94,
//                "name": "Spider Mites"
//        },
//        {
//            "id": 95,
//                "name": "Spiders Common"
//        },
//        {
//            "id": 96,
//                "name": "Springtails"
//        },
//        {
//            "id": 97,
//                "name": "Squirrels"
//        },
//        {
//            "id": 98,
//                "name": "Stink Bugs"
//        },
//        {
//            "id": 99,
//                "name": "Sugar Ants"
//        },
//        {
//            "id": 101,
//                "name": "Termite Monitoring"
//        },
//        {
//            "id": 102,
//                "name": "Termite Pre-treatment"
//        },
//        {
//            "id": 103,
//                "name": "Termites"
//        },
//        {
//            "id": 104,
//                "name": "Ticks"
//        },
//        {
//            "id": 105,
//                "name": "Voles"
//        },
//        {
//            "id": 106,
//                "name": "Wasps"
//        },
//        {
//            "id": 107,
//                "name": "Waterbugs"
//        },
//        {
//            "id": 108,
//                "name": "WDI Report (W.D.I.R.)"
//        },
//        {
//            "id": 110,
//                "name": "Weevils"
//        },
//        {
//            "id": 114,
//                "name": "Wolf Spiders"
//        },
//        {
//            "id": 115,
//                "name": "Wood Boring Beetles"
//        },
//        {
//            "id": 117,
//                "name": "Yellow Jackets"
//        },
//        {
//            "id": 126,
//                "name": "None"
//        },
//        {
//            "id": 143,
//                "name": "Cluster Flies"
//        },
//        {
//            "id": 163,
//                "name": "Asian Roaches"
//        }
//    ]
//    }
}
