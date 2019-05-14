/*
 * Copyright 2015 Realm Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cbd.movies.models;

import java.util.Collection;
import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;

public class Movie extends RealmObject {

    private int tmdbid;
    private String title;
    private String overview;
    private String poster;
    private Date releaseDate;
    private int runtime;
    private String status;
    private Double rating;
    private RealmList<Genre> genres;
    private RealmList<CastMember> castMembers;
    private RealmList<CrewMember> crewMembers;

    public int getTmdbid() {
        return tmdbid;
    }

    public void setTmdbid(int tmdbid) {
        this.tmdbid = tmdbid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Collection<Genre> getGenres() {
        return genres;
    }

    public void setGenres(RealmList<Genre> genres) {
        this.genres = genres;
    }

    public Collection<CastMember> getCastMembers() {
        return castMembers;
    }

    public void setCastMembers(RealmList<CastMember> castMembers) {
        this.castMembers = castMembers;
    }

    public Collection<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(RealmList<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }
}
