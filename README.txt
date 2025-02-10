***DemopWorkShop- Ecommerce project***
 
 
# Project Overview
This project automates core e-commerce functionalities using Katalon Studio. It covers user registration, product search, adding items to the cart dynamically, and completing the checkout process, including assertions and PDF verification.
 
 
# Tech Stack
- Tool: Katalon Studio
- Language: Groovy (for custom keywords)
- Framework: Keyword-Driven with Object Repository
- Assertions: Built-in Katalon verification methods
 
 
# Folder Structure
1. Object Repository (Page-wise structure)
Cart/ → All cart-related elements
Checkout/ → Checkout page elements
Products/ → Search and product selection elements
Registration/ → User registration fields
Login/ → Login and Logout elements
 
2. Custom Keywords (Reusable functions)
Registration.groovy → User registration methods
Category_and_Product.groovy → Dynamic product search, Add to Cart, product selection,etc
CartKeywords.groovy → manage cart
CheckoutKeywords.groovy → Checkout process and assertions
Login_Logout.groovy → Login and Logout function
 
3. Test Cases
Utils->TC_01...Login->Contain test for login & logout
Sanity->TC_02...Registration -> Registers a new user
Sanity->TC_03...E2E_Checkout -> End-to-end scenario covering login, search, add to cart, checkout
 
 
# Key Features 
✔ Dynamic Object Handling → Product selection and cart addition are fully dynamic. Used Dynamic wait instead of static waits.
✔ Reusable Custom Keywords → Improves maintainability and efficiency.
✔ Assertions for Validation → Ensuring accuracy at checkout and success pages.
✔ PDF Verification → Validates downloaded & takes screenshot of the pdf.
 
 
# Setup & Execution 
1. Clone the Repository
git clone <repo-link>
 
2. Open in Katalon Studio
Load the project and configure the test data if needed.
 
3. Run the Tests
Execute individual test cases or the E2E_TestSuite for full coverage.
 
 
# Reporting & Logs 
Katalon’s built-in reports will generate test execution logs.
Screenshots and error logs are captured bcz of the exception handling used for failed cases.


# Future Enhancements
🔹 CI/CD Integration – Automate test execution by integrating with Jenkins/GitHub Actions.
🔹 Parallel Execution – Run tests across multiple devices/browsers using TestNG or Katalon capabilities.


# Author: Sundransh Dutta