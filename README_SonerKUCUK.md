
Titles and internal titles:

Introduction
Technical
Launch
How to run?

Introduction:
This project is about search box and Register a New Account module from given website.

Technical:

Used java as a language.
Used maven as a building management tool.
Created the project with page object model(POM).
Used Cucumber framework with gherkin language.
Used Selenium web driver for automation tool
Used Github for upload the project

Launch:

Base Page: There is page factory for initializing the elements.
Etherscan: There are locators for etherscan_step_Def.

Etherscan_step_Def: There are implementations for etherscan feature
Cukes Runner: For starting project you need to use cukes runner. 
In this class, there are:
Tags: For each step definitions they have their own tag name(@wip)
dryRun: For running the project dryRun needs to be false.

Configuration Properties: For choosing browser and url.
Configuration reader: For retrieving datas from configuration properties.
Hook class: It has before method for opening the browser and after method for closing 
            the browser also taking screenshot for failed scenarios.
Driver class: For using different browser type.

How to run?

Clone or fork the project and open it.
Make dryrun false 
For etherscan feature tags equals @wip
And run the cukes runner.

In case of any questions or any uncleared part, You can contact to me through the email.
