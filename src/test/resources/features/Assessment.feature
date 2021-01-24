Feature: Assessment
  Scenario Outline: Ask a Doubt
    Given I am home page
    When Press Assessment navigation link
    Then User Should Navigate to Assessment page
    And Select Sem,Sub & Ass "<Sem>","<Sub>" and "<Ass>"
    Then Complete a Test
    Examples:
      | Sem | Sub | Ass |
      |ECE Semester 2|Electronics Devices and Circuits|Start Now|
      |ECE Semester 2|Semiconductor Physics|Start Now|
      |ECE Semester 3|Analog and Digital Communication|Start Now|
      |ECE Semester 3|Analog Communication|Start Now|
      |ECE Semester 3|Analog Electronic Circuits|Start Now|
      |ECE Semester 3|Analog Electronic Engineering|Start Now|
      |ECE Semester 3|Data Communications|Start Now|
      |ECE Semester 3|Digital Electronics|Start Now|
      |ECE Semester 3|Digital Principles and System Design|Start Now|
      |ECE Semester 3|Electronic Devices|Start Now|
      |ECE Semester 3|Measurements and Instruments|Start Now|
      |ECE Semester 3|Microprocessors|Start Now|
      |ECE Semester 3|Network Analysis and Synthesis|Start Now|
      |ECE Semester 3|Sensors and Transducers|Start Now|
      |ECE Semester 3|Signals and Systems|Start Now|
      |ECE Semester 3|Solid State Devices|Start Now|
      |ECE Semester 4|Communication Theory|Start Now|
      |ECE Semester 4|Electrical and Electronics Measurements|Start Now|
      |ECE Semester 4|Electromagnetic Field Theory|Start Now|
      |ECE Semester 4|Electronic Circuits|Start Now|
      |ECE Semester 4|Industrial Instrumentation|Start Now|
      |ECE Semester 4|Instrumentation and Process Control|Start Now|
      |ECE Semester 4|Laser Systems and Applications|Start Now|
      |ECE Semester 4|Linear Integrated Circuits|Start Now|
      |ECE Semester 4|Microprocessors and Microcontrollers|Start Now|
      |ECE Semester 5|Antenna and Wave Propagation|Start Now|
      |ECE Semester 5|Control Systems Engineering|Start Now|
      |ECE Semester 5|Digital Communication|Start Now|
      |ECE Semester 5|Electronic Measurement and Instrumentation|Start Now|
      |ECE Semester 5|Simulation and Modelling|Start Now|
      |ECE Semester 5|VLSI Technology|Start Now|
      |ECE Semester 7|Cellular and Mobile Communications|Start Now|
      |ECE Semester 7|Digital Image Processing|Start Now|
      |ECE Semester 7|Digital Signal Processing|Start Now|
      |ECE Semester 7|Embedded Systems Design|Start Now|
      |ECE Semester 7|Instrumentation and Control Systems|Start Now|
      |ECE Semester 7|Microwave Engineering|Start Now|






































