package com.logicalstatements;

import java.util.Scanner;

public class ResturantPoc {

	public static void main(String[] args) {
		System.out.println("***Welcome to VS Resturant***");
		double vegprice = 0;
		double nonvegprice = 0;
		Scanner sc = new Scanner(System.in);
		String yn = "";
		do {
			System.out.println("Select your menu: \n1.Veg \n2.Non-Veg");
			System.out.println("Enter your choice:");
			int categ = sc.nextInt();
			switch (categ) {
			case 1 -> {
				System.out.println("Select veg item:");
				String item = sc.next();
				switch (item) {
				case "soup" -> {
					System.out.println("Select a veg soup item:");
					String soup = sc.next();
					switch (soup) {
					case "tmt" -> {
						System.out.println("Tomato Soup - Rs.119");
						double tomatosoup = 119;
						vegprice += tomatosoup;
					}

					case "veg" -> {
						System.out.println("Mixed Vegetable Soup - Rs.149");
						double mixedVegetableSoup = 149;
						vegprice += mixedVegetableSoup;
					}

					case "crm" -> {
						System.out.println("Creamy Mushroom Soup - Rs.169");
						double mushroomSoup = 169;
						vegprice += mushroomSoup;
					}

					case "crn" -> {
						System.out.println("Sweet Corn Soup - Rs.139");
						double cornSoup = 139;
						vegprice += cornSoup;
					}

					case "bro" -> {
						System.out.println("Broccoli Soup - Rs.159");
						double broccoliSoup = 159;
						vegprice += broccoliSoup;
					}

					case "spn" -> {
						System.out.println("Spinach Soup - Rs.129");
						double spinachSoup = 129;
						vegprice += spinachSoup;
					}

					case "pmp" -> {
						System.out.println("Pumpkin Soup - Rs.149");
						double pumpkinSoup = 149;
						vegprice += pumpkinSoup;
					}

					case "len" -> {
						System.out.println("Lentil Soup - Rs.139");
						double lentilSoup = 139;
						vegprice += lentilSoup;
					}

					case "hot" -> {
						System.out.println("Hot & Sour Veg Soup - Rs.159");
						double hotvegSoup = 159;
						vegprice += hotvegSoup;
					}

					case "man" -> {
						System.out.println("Veg Manchow Soup - Rs.169");
						double machowSoup = 169;
						vegprice += machowSoup;
					}
					default -> System.out.println("invalid option");
					}
				}
				case "rotti" -> {
					System.out.println("select veg Rotti items:");
					String rotti = sc.next();
					switch (rotti) {
					case "pr" -> {
						System.out.println("Plain Roti - Rs.49");
						double plainRoti = 49;
						vegprice += plainRoti;
					}

					case "br" -> {
						System.out.println("Butter Roti - Rs.59");
						double butterRoti = 59;
						vegprice += butterRoti;
					}

					case "nr" -> {
						System.out.println("Naan Roti - Rs.79");
						double naanRoti = 79;
						vegprice += naanRoti;
					}

					case "bn" -> {
						System.out.println("Butter Naan - Rs.89");
						double butterNaan = 89;
						vegprice += butterNaan;
					}

					case "gn" -> {
						System.out.println("Garlic Naan - Rs.109");
						double garlicNaan = 109;
						vegprice += garlicNaan;
					}

					case "rn" -> {
						System.out.println("Rumali Roti - Rs.69");
						double rumaliRoti = 69;
						vegprice += rumaliRoti;
					}

					case "chp" -> {
						System.out.println("Chapati - Rs.39");
						double chapati = 39;
						vegprice += chapati;
					}

					case "prt" -> {
						System.out.println("Paratha - Rs.99");
						double paratha = 99;
						vegprice += paratha;
					}

					case "alpr" -> {
						System.out.println("Aloo Paratha - Rs.129");
						double alooParatha = 129;
						vegprice += alooParatha;
					}

					case "gpr" -> {
						System.out.println("Gobi Paratha - Rs.139");
						double gobiParatha = 139;
						vegprice += gobiParatha;
					}
					default -> System.out.println("Invalid option");
					}
				}
				case "starter" -> {
					System.out.println("Select a veg starter items:");
					String starter = sc.next();
					switch (starter) {
					case "pnr" -> {
						System.out.println("Paneer Tikka - Rs.249");
						double pannerT = 249;
						vegprice += pannerT;
					}

					case "gbi" -> {
						System.out.println("Gobi Manchurian - Rs.199");
						double gobimanchu = 199;
						vegprice += gobimanchu;
					}

					case "c65" -> {
						System.out.println("Mushroom 65 - Rs.219");
						double mushroom65 = 219;
						vegprice += mushroom65;
					}

					case "v65" -> {
						System.out.println("Veg 65 - Rs.189");
						double veg65 = 189;
						vegprice += veg65;
					}

					case "frn" -> {
						System.out.println("French Fries - Rs.149");
						double frenchFries = 149;
						vegprice += frenchFries;
					}

					case "spr" -> {
						System.out.println("Spring Rolls - Rs.199");
						double springRolls = 199;
						vegprice += springRolls;
					}

					case "crn" -> {
						System.out.println("Crispy Corn - Rs.189");
						double crispyCorn = 189;
						vegprice += crispyCorn;
					}

					case "hpb" -> {
						System.out.println("Hara Bhara Kabab - Rs.209");
						double haraBharaKabab = 209;
						vegprice += haraBharaKabab;
					}

					case "ccb" -> {
						System.out.println("Chilli Paneer - Rs.239");
						double chilliPaneer = 239;
						vegprice += chilliPaneer;
					}

					case "bbq" -> {
						System.out.println("Baby Corn Manchurian - Rs.199");
						double babyCornManchurian = 199;
						vegprice += babyCornManchurian;
					}

					case "msh" -> {
						System.out.println("Mushroom Manchurian - Rs.219");
						double mushroomManchurian = 219;
						vegprice += mushroomManchurian;
					}

					case "veg" -> {
						System.out.println("Veg Manchurian - Rs.199");
						double vegManchurian = 199;
						vegprice += vegManchurian;
					}
					default -> System.out.println("invalid option");
					}
				}
				case "curry" -> {
					System.out.println("Select veg-curries item:");
					String curry = sc.next();
					switch (curry) {
					case "ptb" -> {
						System.out.println("Paneer Butter Masala - Rs.289");
						double paneerButterMasala = 289;
						vegprice += paneerButterMasala;
					}

					case "kpn" -> {
						System.out.println("Kadai Paneer - Rs.279");
						double kadaiPaneer = 279;
						vegprice += kadaiPaneer;
					}

					case "shp" -> {
						System.out.println("Shahi Paneer - Rs.299");
						double shahiPaneer = 299;
						vegprice += shahiPaneer;
					}

					case "mpl" -> {
						System.out.println("Matar Paneer - Rs.269");
						double matarPaneer = 269;
						vegprice += matarPaneer;
					}

					case "pal" -> {
						System.out.println("Palak Paneer - Rs.279");
						double palakPaneer = 279;
						vegprice += palakPaneer;
					}

					case "vko" -> {
						System.out.println("Veg Kolhapuri - Rs.259");
						double vegKolhapuri = 259;
						vegprice += vegKolhapuri;
					}

					case "vja" -> {
						System.out.println("Veg Jalfrezi - Rs.249");
						double vegJalfrezi = 249;
						vegprice += vegJalfrezi;
					}

					case "mix" -> {
						System.out.println("Mixed Vegetable Curry - Rs.239");
						double mixedVegCurry = 239;
						vegprice += mixedVegCurry;
					}

					case "dfr" -> {
						System.out.println("Dal Fry - Rs.199");
						double dalFry = 199;
						vegprice += dalFry;
					}

					case "dtd" -> {
						System.out.println("Dal Tadka - Rs.209");
						double dalTadka = 209;
						vegprice += dalTadka;
					}

					case "cmb" -> {
						System.out.println("Chana Masala - Rs.219");
						double chanaMasala = 219;
						vegprice += chanaMasala;
					}

					case "alg" -> {
						System.out.println("Aloo Gobi - Rs.229");
						double alooGobi = 229;
						vegprice += alooGobi;
					}

					case "veg" -> {
						System.out.println("Veg Manchurian - Rs.199");
						double vegManchurian = 199;
						vegprice += vegManchurian;
					}
					default -> System.out.println("invalid option");
					}
				}
				case "briyani" -> {
					System.out.println("Select veg briyani item:");
					String briyani = sc.next();
					switch (briyani) {
					case "vbr" -> {
						System.out.println("Veg Biryani - Rs.249");
						double vegBiryani = 249;
						vegprice += vegBiryani;
					}

					case "pbr" -> {
						System.out.println("Paneer Biryani - Rs.299");
						double paneerBiryani = 299;
						vegprice += paneerBiryani;
					}

					case "mbr" -> {
						System.out.println("Mushroom Biryani - Rs.279");
						double mushroomBiryani = 279;
						vegprice += mushroomBiryani;
					}

					case "bcb" -> {
						System.out.println("Baby Corn Biryani - Rs.269");
						double babyCornBiryani = 269;
						vegprice += babyCornBiryani;
					}

					case "kbr" -> {
						System.out.println("Kaju Biryani - Rs.319");
						double kajuBiryani = 319;
						vegprice += kajuBiryani;
					}

					case "hbr" -> {
						System.out.println("Hyderabadi Veg Biryani - Rs.289");
						double hyderabadiVegBiryani = 289;
						vegprice += hyderabadiVegBiryani;
					}

					case "dbr" -> {
						System.out.println("Dum Veg Biryani - Rs.299");
						double dumVegBiryani = 299;
						vegprice += dumVegBiryani;
					}

					case "pul" -> {
						System.out.println("Vegetable Pulao - Rs.219");
						double vegetablePulao = 219;
						vegprice += vegetablePulao;
					}

					case "jrp" -> {
						System.out.println("Jeera Rice - Rs.169");
						double jeeraRice = 169;
						vegprice += jeeraRice;
					}

					case "gfr" -> {
						System.out.println("Ghee Rice - Rs.199");
						double gheeRice = 199;
						vegprice += gheeRice;
					}
					default -> System.out.println("invalid option");

					}
				}

				default -> System.out.println("invalid option");
				}

			}

			}

			switch (categ) {
			case 2 -> {
				System.out.println("Select Non-veg item:");
				String item = sc.next();
				switch (item) {
				case "soup" -> {
					System.out.println("Select non-veg soup items:");
					String soup = sc.next();
					switch (soup) {
					case "chk" -> {
						System.out.println("Chicken Soup - Rs.149");
						double chickenSoup = 149;
						nonvegprice += chickenSoup;
					}

					case "ccl" -> {
						System.out.println("Chicken Clear Soup - Rs.159");
						double chickenClearSoup = 159;
						nonvegprice += chickenClearSoup;
					}

					case "csw" -> {
						System.out.println("Chicken Sweet Corn Soup - Rs.169");
						double chickenSweetCornSoup = 169;
						nonvegprice += chickenSweetCornSoup;
					}

					case "chs" -> {
						System.out.println("Chicken Hot & Sour Soup - Rs.179");
						double chickenHotSourSoup = 179;
						nonvegprice += chickenHotSourSoup;
					}

					case "mtn" -> {
						System.out.println("Mutton Soup - Rs.199");
						double muttonSoup = 199;
						nonvegprice += muttonSoup;
					}

					case "mcl" -> {
						System.out.println("Mutton Clear Soup - Rs.209");
						double muttonClearSoup = 209;
						nonvegprice += muttonClearSoup;
					}

					case "sea" -> {
						System.out.println("Seafood Soup - Rs.229");
						double seafoodSoup = 229;
						nonvegprice += seafoodSoup;
					}

					case "pwn" -> {
						System.out.println("Prawn Soup - Rs.239");
						double prawnSoup = 239;
						nonvegprice += prawnSoup;
					}

					case "crb" -> {
						System.out.println("Crab Soup - Rs.249");
						double crabSoup = 249;
						nonvegprice += crabSoup;
					}

					case "fsh" -> {
						System.out.println("Fish Soup - Rs.219");
						double fishSoup = 219;
						nonvegprice += fishSoup;
					}
					default -> System.out.println("invalid option");
					}
				}
				case "starter" -> {
					System.out.println("Select non-veg starter items:");
					String starter = sc.next();
					switch (starter) {
					case "c65" -> {
						System.out.println("Chicken 65 - Rs.249");
						double chicken65 = 249;
						nonvegprice += chicken65;
					}

					case "ctk" -> {
						System.out.println("Chicken Tikka - Rs.289");
						double chickenTikka = 289;
						nonvegprice += chickenTikka;
					}

					case "cfy" -> {
						System.out.println("Chicken Fry - Rs.269");
						double chickenFry = 269;
						nonvegprice += chickenFry;
					}

					case "clp" -> {
						System.out.println("Chilli Chicken - Rs.279");
						double chilliChicken = 279;
						nonvegprice += chilliChicken;
					}

					case "cmn" -> {
						System.out.println("Chicken Manchurian - Rs.289");
						double chickenManchurian = 289;
						nonvegprice += chickenManchurian;
					}

					case "lcp" -> {
						System.out.println("Chicken Lollipop - Rs.319");
						double chickenLollipop = 319;
						nonvegprice += chickenLollipop;
					}

					case "m65" -> {
						System.out.println("Mutton 65 - Rs.349");
						double mutton65 = 349;
						nonvegprice += mutton65;
					}

					case "mfr" -> {
						System.out.println("Mutton Fry - Rs.369");
						double muttonFry = 369;
						nonvegprice += muttonFry;
					}

					case "ffy" -> {
						System.out.println("Fish Fry - Rs.329");
						double fishFry = 329;
						nonvegprice += fishFry;
					}

					case "ftk" -> {
						System.out.println("Fish Tikka - Rs.349");
						double fishTikka = 349;
						nonvegprice += fishTikka;
					}

					case "pfy" -> {
						System.out.println("Prawn Fry - Rs.389");
						double prawnFry = 389;
						nonvegprice += prawnFry;
					}

					case "pch" -> {
						System.out.println("Chilli Prawns - Rs.409");
						double chilliPrawns = 409;
						nonvegprice += chilliPrawns;
					}
					default -> System.out.println("invalid option");
					}
				}
				case "curries" -> {
					System.out.println("Select Non-veg Curries items:");
					String curry = sc.next();
					switch (curry) {
					case "cbm" -> {
						System.out.println("Chicken Butter Masala - Rs.329");
						double chickenButterMasala = 329;
						nonvegprice += chickenButterMasala;
					}

					case "ckt" -> {
						System.out.println("Chicken Kadai - Rs.319");
						double chickenKadai = 319;
						nonvegprice += chickenKadai;
					}

					case "ccr" -> {
						System.out.println("Chicken Curry - Rs.299");
						double chickenCurry = 299;
						nonvegprice += chickenCurry;
					}

					case "cch" -> {
						System.out.println("Chicken Chettinad - Rs.339");
						double chickenChettinad = 339;
						nonvegprice += chickenChettinad;
					}

					case "cdh" -> {
						System.out.println("Chicken Do Pyaza - Rs.329");
						double chickenDoPyaza = 329;
						nonvegprice += chickenDoPyaza;
					}

					case "mcr" -> {
						System.out.println("Mutton Curry - Rs.389");
						double muttonCurry = 389;
						nonvegprice += muttonCurry;
					}

					case "mrk" -> {
						System.out.println("Mutton Rogan Josh - Rs.419");
						double muttonRoganJosh = 419;
						nonvegprice += muttonRoganJosh;
					}

					case "mkh" -> {
						System.out.println("Mutton Keema Masala - Rs.399");
						double muttonKeemaMasala = 399;
						nonvegprice += muttonKeemaMasala;
					}

					case "fcr" -> {
						System.out.println("Fish Curry - Rs.349");
						double fishCurry = 349;
						nonvegprice += fishCurry;
					}

					case "pcr" -> {
						System.out.println("Prawn Curry - Rs.429");
						double prawnCurry = 429;
						nonvegprice += prawnCurry;
					}

					case "ecy" -> {
						System.out.println("Egg Curry - Rs.229");
						double eggCurry = 229;
						nonvegprice += eggCurry;
					}

					case "ebm" -> {
						System.out.println("Egg Butter Masala - Rs.249");
						double eggButterMasala = 249;
						nonvegprice += eggButterMasala;
					}
					default -> System.out.println("invalid option");
					}
				}
				case "rotti" -> {
					System.out.println("Select non-veg Rotti item: ");
					String rotti = sc.next();
					switch (rotti) {
					case "tnd" -> {
						System.out.println("Tandoori Roti - Rs.59");
						double tandooriRoti = 59;
						nonvegprice += tandooriRoti;
					}

					case "btr" -> {
						System.out.println("Butter Roti - Rs.69");
						double butterRoti = 69;
						nonvegprice += butterRoti;
					}

					case "bnn" -> {
						System.out.println("Butter Naan - Rs.89");
						double butterNaan = 89;
						nonvegprice += butterNaan;
					}

					case "gnn" -> {
						System.out.println("Garlic Naan - Rs.109");
						double garlicNaan = 109;
						nonvegprice += garlicNaan;
					}

					case "kln" -> {
						System.out.println("Keema Naan - Rs.149");
						double keemaNaan = 149;
						nonvegprice += keemaNaan;
					}

					case "chp" -> {
						System.out.println("Chicken Paratha - Rs.179");
						double chickenParatha = 179;
						nonvegprice += chickenParatha;
					}

					case "mpr" -> {
						System.out.println("Mutton Paratha - Rs.219");
						double muttonParatha = 219;
						nonvegprice += muttonParatha;
					}

					case "rml" -> {
						System.out.println("Rumali Roti - Rs.79");
						double rumaliRoti = 79;
						nonvegprice += rumaliRoti;
					}

					case "lch" -> {
						System.out.println("Laccha Paratha - Rs.119");
						double lacchaParatha = 119;
						nonvegprice += lacchaParatha;
					}

					case "nch" -> {
						System.out.println("Chicken Naan - Rs.189");
						double chickenNaan = 189;
						nonvegprice += chickenNaan;
					}
					default -> System.out.println("Invalid option");
					}
				}
				case "briyani" -> {
					System.out.println("Select non-veg Briyani items:");
					String briyani = sc.next();
					switch (briyani) {
					case "cbr" -> {
						System.out.println("Chicken Biryani - Rs.299");
						double chickenBiryani = 299;
						nonvegprice += chickenBiryani;
					}

					case "hcb" -> {
						System.out.println("Hyderabadi Chicken Biryani - Rs.329");
						double hyderabadiChickenBiryani = 329;
						nonvegprice += hyderabadiChickenBiryani;
					}

					case "dcb" -> {
						System.out.println("Chicken Dum Biryani - Rs.339");
						double chickenDumBiryani = 339;
						nonvegprice += chickenDumBiryani;
					}

					case "mbr" -> {
						System.out.println("Mutton Biryani - Rs.399");
						double muttonBiryani = 399;
						nonvegprice += muttonBiryani;
					}

					case "hmb" -> {
						System.out.println("Hyderabadi Mutton Biryani - Rs.429");
						double hyderabadiMuttonBiryani = 429;
						nonvegprice += hyderabadiMuttonBiryani;
					}

					case "dmb" -> {
						System.out.println("Mutton Dum Biryani - Rs.439");
						double muttonDumBiryani = 439;
						nonvegprice += muttonDumBiryani;
					}

					case "fbr" -> {
						System.out.println("Fish Biryani - Rs.349");
						double fishBiryani = 349;
						nonvegprice += fishBiryani;
					}

					case "pbr" -> {
						System.out.println("Prawn Biryani - Rs.429");
						double prawnBiryani = 429;
						nonvegprice += prawnBiryani;
					}

					case "ebr" -> {
						System.out.println("Egg Biryani - Rs.239");
						double eggBiryani = 239;
						nonvegprice += eggBiryani;
					}

					case "kcb" -> {
						System.out.println("Keema Biryani - Rs.389");
						double keemaBiryani = 389;
						nonvegprice += keemaBiryani;
					}

					case "mix" -> {
						System.out.println("Mixed Non-Veg Biryani - Rs.499");
						double mixedNonVegBiryani = 499;
						nonvegprice += mixedNonVegBiryani;
					}

					case "spl" -> {
						System.out.println("Special Family Biryani - Rs.799");
						double specialFamilyBiryani = 799;
						nonvegprice += specialFamilyBiryani;
					}
					default -> System.out.println("invalid option");
					}
				}
				default -> System.out.println("invalid option");

				}

			}
			}

			System.out.println("Do you want to COntinue ..? Click Y for Yes N for No");
			yn = sc.next();
			System.out.println("Total Bill for Veg:" + vegprice);
			System.out.println("Total Bill for Non-Veg:" + nonvegprice);
		} while (yn.equalsIgnoreCase("Y"));

		System.out.println("EXIT !!");
	}
}
