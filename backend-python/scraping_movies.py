import os

import requests as r


def get_movies():
    request = r.request(
        "GET",
        url="https://api.themoviedb.org/3/movie/popular",
        params={"api_key": os.getenv("TMDB_API_KEY")},
    )

    return request.json()


get_movies()
