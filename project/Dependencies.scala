/*
 * Copyright (c) 2012 SnowPlow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
import sbt._

object Dependencies {
  val resolutionRepos = Seq(
    ScalaToolsSnapshots,
    "Concurrent Maven Repo" at "http://conjars.org/repo"
  )

  object V {
    val scalding  = "0.7.3"
    // Add versions for your additional libraries here...
  }

  object Libraries {
    val scalding    = "com.twitter"                %  "scalding_2.9.2"       % V.scalding
    // Add additional libraries from mvnrepository.com (SBT syntax) here...
  }
}
