Feature: Contactus
  Scenario Outline: Check Contactus
    Given I am on Index Page
    When Press Contactus link in Headertab
    Then User Should Navigate to Contactus Page
    Then Enter First,Last,Email,Mob & Message "<first>","<last>","<Email>","<Mob>" and "<Message>"
    And Click Submit Button "<Type>"
    Examples:
      | first | last | Email | Mob | Message | Type |
      |       |      |       |     |         | Empty|
      |Uthar  | kumar|uk@m |8667651940|Test|Invalidemail|
      |Uthar  | kumar|uk@m.com |86676519|Test|InvalidMob|
      |Uthar  | kumar|uk@m.com |8667651940|Test|Invalidconcode|
      |Uthar  | kumar|uk@m.com |8667651940|Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus. Phasellus viverra nulla ut metus varius laoreet. Quisque rutrum. Aenean imperdiet. Etiam ultricies nisi vel augue. Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum. N|msg1000chars|
      |Uthar  | kumar|uk@m.com |8667651940|Test|Valid|
