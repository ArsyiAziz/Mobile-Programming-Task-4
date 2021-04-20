package com.arsyiaziz.task4;

import java.time.LocalDate;
import java.util.ArrayList;

public class ComputerDatabase {
    private static String[] computerNames = {
        "Apple I",
        "Coleco Adam",
        "Commodore 64",
        "IBM 5150",
        "IBM PCjr",
        "iMac G3",
        "Macintosh Portable",
        "Osborne 1",
        "Timex Sinclair",
        "TRS 80",
    };

    private static String[] computerSummaries= {
        "The Apple Computer 1, originally released as the Apple Computer and known later as the Apple I, or Apple-1, is a desktop computer released by the Apple Computer Company (now Apple Inc.) in 1976. It was designed and hand-built by Steve Wozniak. The idea of selling the computer came from Wozniak's friend Steve Jobs. The Apple I was Apple's first product, and to finance its creation, Jobs sold his only motorized means of transportation, a VW Microbus, for a few hundred dollars (Wozniak later said that Jobs planned instead to use his bicycle to get around), and Wozniak sold his HP-65 calculator for $500. Wozniak demonstrated the first prototype in July 1976 at the Homebrew Computer Club in Palo Alto, California.\n\n" +
                "Production was discontinued on September 30, 1977, after the June 10, 1977 introduction of its successor, the Apple II, which Byte magazine referred to as part of the \"1977 Trinity\" of personal computing (along with the PET 2001 from Commodore Business Machines and the TRS-80 Model I from Tandy Corporation)\n\n",
        "The Coleco Adam is a home computer and expansion device for the ColecoVision released in 1983 by American toy and video game manufacturer Coleco. It was an attempt to follow on the success of the company's ColecoVision video game console. The Adam was not very successful, partly because of early production problems, and was discontinued in early 1985",
        "The Commodore 64, also known as the C64 or the CBM 64, is an 8-bit home computer introduced in January 1982 by Commodore International (first shown at the Consumer Electronics Show, 7–10 January 1982, in Las Vegas). It has been listed in the Guinness World Records as the highest-selling single computer model of all time, with independent estimates placing the number sold between 12.5 and 17 million units. This claim is in spite of the Commodore 64 having three different Kernal ROM versions, two different SID sound chip versions, a few different motherboard versions and two different cases during its lifetime. Volume production started in early 1982, marketing in August for US$595 (equivalent to $1,576 in 2019).Preceded by the Commodore VIC-20 and Commodore PET, the C64 took its name from its 64 kibibytes (65,536 bytes) of RAM. With support for multicolor sprites and a custom chip for waveform generation, the C64 could create superior visuals and audio compared to systems without such custom hardware.",
        "The IBM Personal Computer (model 5150, commonly known as the IBM PC) is the first computer released in the IBM PC model line and the basis for the IBM PC compatible de facto standard. Released on August 12, 1981, it was created by a team of engineers and designers directed by Don Estridge in Boca Raton, Florida.\n\n" +
                "The machine was based on open architecture and a substantial market of third-party peripherals, expansion cards and software grew up rapidly to support it.\n\n" +
                "The PC had a substantial influence on the personal computer market. The specifications of the IBM PC became one of the most popular computer design standards in the world, and the only significant competition it faced from a non-compatible platform throughout the 1980s was from the Apple Macintosh product line. The majority of modern personal computers are distant descendants of the IBM PC.\n\n",
        "The IBM PCjr (pronounced \"PC junior\") is a home computer that was produced and marketed by IBM from March 1984 to May 1985, intended as a lower-cost variant of the IBM PC with hardware capabilities better suited for video games, in order to compete more directly with other home computers such as the Apple II and Commodore 64.\n\n" +
                "It retains the IBM PC's 8088 CPU and BIOS interface, but provides enhanced graphics and sound, ROM cartridge slots, built-in joystick ports, and an infrared wireless keyboard. The PCjr supports expansion via \"sidecar\" modules, which are attached to the side of the unit.\n\n" +
                "Despite widespread anticipation, the PCjr was ultimately unsuccessful in the market. It is only partially IBM compatible, limiting support for the IBM's vast software library, its chiclet keyboard was widely criticized for its poor quality, expandability is limited, and it was initially offered with a maximum of 128 kB of RAM, insufficient for many PC programs.\n\n",
        "The iMac G3, originally released as the iMac, was a series of Macintosh personal computers developed by Apple under the tenure of Apple's interim CEO and cofounder Steve Jobs after his return to the financially-troubled company.\n\n" +
                "\n\n" +
                "The iMac was a huge success for Apple, revitalizing the company and influencing competitors' product designs. It played a role in abandoning legacy technologies like the floppy disk, serial ports, and Apple Desktop Bus in favor of Universal Serial Bus. The product line was updated throughout 1998 until 2001 with new technology and colors, eventually being replaced by the iMac G4 and eMac.",
        "Macintosh Portable is a portable computer designed, manufactured, and sold by Apple Computer, Inc. from September 1989 to October 1991. It is the first battery-powered Macintosh, which garnered significant excitement from critics, but sales to customers were quite low. It featured a fast, sharp, and expensive black-and-white active matrix LCD screen in a hinged design that covered the keyboard when the machine was not in use. The Portable was one of the early consumer laptops to employ an active matrix panel—only the most expensive of the initial PowerBook line, the PowerBook 170, had such a panel—mainly due to the high cost. The machine was designed to deliver high performance, at the cost of increased price and weight. The Portable was discontinued in October 1991.",
        "The Osborne 1 is the first commercially successful portable microcomputer, released on April 3, 1981 by Osborne Computer Corporation. It weighs 10.7 kg (24.5 lb), cost US$1,795, and runs the CP/M 2.2 operating system. It is powered from a wall socket, as it has no on-board battery, but it is still classed as a portable device since it can be hand-carried when packed.\n\n" +
                "The computer shipped with a large bundle of software that was almost equivalent in value to the machine itself, a practice adopted by other CP/M computer vendors. Competitors quickly appeared, such as the Kaypro II.\n\n",
        "The Timex Sinclair 1000 (TS1000) was the first computer produced by Timex Sinclair, a joint venture between Timex Corporation and Sinclair Research. It was launched in July 1982, with a US sales price of US$99.95, making it the cheapest home computer at the time; it was advertised as \"the first computer under $100\". The computer was aimed at regular home users. Unlike earlier computers aimed at home users, the TS1000 was not a kit which had to be soldered and assembled. As purchased, the TS1000 was fully assembled and ready to be plugged into home televisions, which served as a video monitor. The TS1000 was a slightly modified version of the Sinclair ZX81 with an NTSC RF modulator, for use with North American TVs, instead of PAL for European TVs. The TS1000 doubled the onboard RAM from 1 KB to 2 KB. The TS1000's casing had slightly more internal shielding but remained the same as Sinclair's, including the membrane keyboard. It had black-and-white graphics and no sound. It was followed by an improved version, the Timex Sinclair 1500 which had substantially more RAM (16 KB) and a lower price (US$80). However, the TS1500 did not achieve market success, given that the marketplace was by this time dominated by Commodore, RadioShack, Atari and Apple.",
        "The TRS-80 Micro Computer System (TRS-80, later renamed the Model I to distinguish it from successors) is a desktop microcomputer launched in 1977 and sold by Tandy Corporation through their RadioShack stores. The name is an abbreviation of Tandy/RadioShack, Z80 microprocessor. It is one of the earliest mass-produced and mass-marketed retail home computers." +
                "\n\n" +
                "The TRS-80 has a full-stroke QWERTY keyboard, the Zilog Z80 processor, 4 KB DRAM standard memory (when many 8-bit computers shipped with only 1 KB RAM), small size and desk footprint, floating-point Level I BASIC language interpreter in ROM, 64-character per line video monitor, and a starting price of US$600 (equivalent to US$2,500 in 2020).",
    };
    private static LocalDate[] computerReleaseDates = {
        LocalDate.of(1976, 4, 11),
        LocalDate.of(1982, 8, 1),
        LocalDate.of(1982, 1, 7),
        LocalDate.of(1981, 8, 12),
        LocalDate.of(1984, 3, 1),
        LocalDate.of(1998, 8, 15),
        LocalDate.of(1989, 9, 20),
        LocalDate.of(1981, 4, 3),
        LocalDate.of(1982, 7, 1),
        LocalDate.of(1977, 8, 3),

    };

    private static double[] computerIntroductoryPrice = {
        666.66,
        725,
        595,
        1565,
        1269,
        1299,
        7300,
        1795,
        99.95,
        3450,
    };

    private static String[] computerDeveloper = {
            "Steve Wozniak & Steve Jobs",
            "Coleco",
            "Commodore Business Machines",
            "IBM",
            "IBM",
            "Apple Inc.",
            "Apple Inc.",
            "Adam Osborne",
            "Sinclair Research & Timex Corporation",
            "Tandy Corporation",
    };

    private static int[] computerPhotos = {
        R.drawable.apple_1,
        R.drawable.coleco_adam,
        R.drawable.commodore_64,
        R.drawable.ibm_5150,
        R.drawable.ibm_pcjr,
        R.drawable.imac_g3,
        R.drawable.macintosh_portable,
        R.drawable.osborne_1,
        R.drawable.timex_sinclair_1000,
        R.drawable.trs_80,
    };


    static ArrayList<ComputerModel> getListData() {
        ArrayList<ComputerModel> list = new ArrayList<>();
        for (int i = 0; i < computerNames.length; i++) {
            ComputerModel computer = new ComputerModel();
            computer.setName(computerNames[i]);
            computer.setPhoto(computerPhotos[i]);
            computer.setReleaseDate(computerReleaseDates[i]);
            computer.setSummary(computerSummaries[i]);
            computer.setDeveloper(computerDeveloper[i]);
            computer.setIntroductoryPrice(computerIntroductoryPrice[i]);
            list.add(computer);
        }
        return list;
    }
}
