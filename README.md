# VVCabOnlinespringproject

## Project Description:  

VV Cab Booking Online Is Spring Boot Project That Main Goal Of Project Is Online Cab Booking 
It Has The Three Module  Customer  ,Admin, Driver, Customer Can Book The Cab By Giving Pick Up Location And Drop Location 
Customer  Can Rise A Request To Driver ,It Will Update The Request Table By Using JPA Repository 
From That Request Table Driver Can View The No Of Request Raised By Customer He Will 
Decide The Action Accept Or Reject By Clicking On The Buttons Displayed In The Web Page .
After Driver Accepting The Order That Will Show In Customer Page By Clicking Recent Booking Button . He Can Check The Request Status .The booking has confirmed 
Admin has the entire access admin can view the list of bookings ,  add customer, add cabdriver, list of customer ,list of cabs .

## Technologies used: 

- HTM, CSS 
- Bootstrap 4
- JSP 
- JPA Repository
- Spring Boot
- Hibernate 5.3
- Log4J
- Junit
- MySql


- **Back-end part**
  - Installing STS
      - The easiest way to install STS is right from within Eclipse. Just select Help > Eclipse Marketplace… from the main menu and type “STS” in the search bar of the Eclipse Marketplace dialog.
  - Creating a New Project
      - STS includes its own starter project to get you started. It is accessible from the New Project Wizard. Navigate to File > New > Other… 
  - Project Settingd
      - On the New Spring Starter Project dialog, you’ll have to choose a name for your project. Let’s call it “HelloWorld”. Select Maven as the build tool, and JAR packaging and your Java version. Assign a Group of “com.developer” for the package name. Artifact is the name of the JAR file you are going to build
  - Project Dependencies
      - In the New Spring Starter Project Dependencies window, use the search field and type “web” into it, we can choose the dependencies we want in out project

- **Push Project to Github**
  - Initialize the local directory as a Git repository.
    - git init
  - Use git status to know the status of your application
    - git status 
  - Add the files in your new local repository. This stages them for the first commit.
    - git add .
  - Commit the files that you've staged in your local repository.
    - git commit -m "First commit"
  - In the Command prompt, add the URL for the remote repository where your local repository will be pushed.
    - git remote add origin  <REMOTE_URL>
    - git remote -verify
  - Switch between branches if required
    - git checkout -b <new_branch>
  - Push the changes in your local repository to GitHub.
    - git push origin `<selected branch>`
  - use git clone to clone your repository to local machine
    - git clone https://github.com/venkateshpro/VVCabOnlinespringproject.git

## Usage
  - open website and login based on role
  - Customer can login and Choose the pick up and drop location,Rise the Request.
  - Admin can login to his account, can (Add, Edit, Delete) CabDriver, Customer, List of Bookings.
  - Driver can login to his account, he will check for the request and he will accept or reject the request.
  -

