# MovieSearch
Mobile App Challenge:
Please create a Android Native (if you are applying for Android developer) or iOS Native (if you are
applying for iOS developer) based mobile app that allows the user to search for any movie title, view the
list of search results and details of the selected movie. The app shall fetch the movies data from The
Open Movie Database (OMDb) REST API. You can use the API key b9bd48a6. The app shall contain
two screens with details below:
1. Movies List Screen:
a. The user should be able to enter the movie title to search for
b. The list needs to be scrollable and when the user reach the end of the screen, it should
fetch the next set of results if there is any.
c. Please refer to the attached wireframe for the UI.
d. The movie list can be fetched from the OMDb. For example, the following request will
fetch list of movies with title as “Marvel”
http://www.omdbapi.com/?apikey=b9bd48a6&s=Marvel&type=movie
e. Tapping on a movie should take the user to Movie Details screen
2. Movie Details Screen:
a. The movie details can be fetched from OMDb. For example, to get movie details
http://www.omdbapi.com/?apikey=b9bd48a6&i=tt4154664
b. The user should be able to navigate back to the Movies List screen
c. Please refer to the attached wireframe for the UI.

Screenshots:

![Image of Search Screen](https://github.com/sathish2a9/MovieSearch/blob/master/screenshots/search_screen.jpg)

![Image of Movie Details](https://github.com/sathish2a9/MovieSearch/blob/master/screenshots/movie_details.jpg)

![Image of Movie List](https://github.com/sathish2a9/MovieSearch/blob/master/screenshots/movies_list.jpg)
