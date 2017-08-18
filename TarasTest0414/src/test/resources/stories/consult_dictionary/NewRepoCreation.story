Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: login in to github
Given the user is on the Hithub landing page
When the user inputs login 'taras.oleynik@gmail.com' and the pass 'qwerty123'
Then system redirects to Main page

Scenario: create hithub repo
Given the user is on the Hithub Main page login 'taras.oleynik@gmail.com' and the pass 'qwerty123'
When the user creates the New repo with a name 'JbehaveRepo'
Then system redirects to RepoCreated page

