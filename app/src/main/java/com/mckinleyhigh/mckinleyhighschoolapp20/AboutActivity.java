package com.mckinleyhigh.mckinleyhighschoolapp20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AboutActivity extends AppCompatActivity {

    String vision = "VISION";
    String visionstring = "\"To graduate a successful person\"";

    String mission = "MISSION STATEMENT";
    String missionstring = "    The mission of President William McKinley High School is to provide a positive nurturing learning environment which will maximize the potential of each individual student to become a more responsible, caring, and contributing citizen of our society.";

    String history = "HISTORY";
    String historystring = "    McKinley High School was officially established in 1865, as the Fort Street English Day School by Maurice B. Beckwith. In November 1869, the English Day School moved from the basement of the old Fort Street Church to a new stone building on the corner of Fort and School Streets. The Fort Street School later moved to the Princess Ruth’s Palace in 1895 and was renamed the Honolulu High School.\n" +
            "    In 1907, Honolulu High School moved to the corner of Beretania and Victoria Streets. The school’s name was then changed to President William McKinley High School, after President William McKinley, whose influence helped to bring about the annexation of the Hawaiian Islands to the United States.\n" +
            "    A statue of President McKinley was commissioned for $8,000. Completed in New York, the bronze eight-ton statue was shipped to Honolulu and dedicated on February 23, 1911.\n" +
            "    With growing enrollment, a new and bigger school was necessary. In 1921, the present site on King Street was acquired through territorial condemnation. In 1923, the school was moved from the Beretania Victoria site to its present location. McKinley High School is proud to be listed on both State and National Register of Historical Places.\n" +
            "    At this time, McKinley had no auditorium, and through the efforts of the McKinley Parent and Teachers Association, a building drive was formulated.\n" +
            "    In 1927, the Marion McCarrell Scott Auditorium was dedicated. This new auditorium was then the largest theater in Hawai’i.\n" +
            "    In 1920, McKinley began the publication of the Daily Pinion. Fluency in written communication was developed in the publications classes that the Daily Pinion, a school newspaper published daily and made possible with the assistance of the McKinley print shop.\n" +
            "    The school’s swimming pool was the students’ pride of the 1920’s because they played an active part in its construction. Armed with picks, shovels, and determination, the students began the excavation for a pool in 1923. Construction was halted due to a lack of funds.\n" +
            "    Students solicited the funds from the Honolulu business community and collected the necessary $12,000 to complete the pool. The pool was completed in 1926 and named in honor of the late Honolulu Mayor Fred Wright.\n" +
            "    The appointment of Dr. Miles E. Carey in 1924 as principal opened a new era of leadership. In 1931, Dr. Carey introduced the “core” program, integrating English and social studies classes, to McKinley’s academic program. It was an immediate success and by 1933 the 3,000 students of McKinley were actively enrolled in the core program. The school cafeteria and road encircling the front mall are named after Dr. Miles E. Carey.\n" +
            "    The Second World War proved to be a challenge for the students of McKinley. They wanted to do their part in the nation’s war effort. A savings bond drive was conducted, and the students responded by buying over $200,000 in bonds and stamps.\n" +
            "    The overwhelming success of the bond drive, instigated a new project, purchasing a fighter bomber for the U.S. Air Force! Students again raised over $333,000 in war bonds to cover the cost of a Liberator bomber. In February 1944, the plane, christened “Madame Pele,” was presented to the U.S. Air Force.\n" +
            "    August 14, 1945--the war was won! Veterans’ School was begun on campus to help the McKinley young men who had left school for the war. One hundred and five veterans came back to McKinley and finished their education.\n" +
            "    The Korean War, begun in 1950, interrupted the peace. Again, McKinley boys volunteered their lives for their country. The 1950’s was also a period of readjustment. The core program ended and another chapter of the school’s history was brought to a close.\n" +
            "    In 1960’s, McKinley met the demands of a progressive society. Educators instituted new methods in teaching science, mathematics, and the foreign languages. With the addition of new and revitalized curriculum, the students had an opportunity to choose from a wider range of subjects in preparation for their post-high school education. McKinley continued to be a comprehensive public high school in Hawai’i.\n" +
            "    Just as McKinley’s curriculum expanded, the facilities also increased from the original four buildings. In 1959, the Social Studies building was added and named after Chief Justice Wilfred Tsukiyama.\n" +
            "    And, in 1961, the award winning design of the Miles E. Carey cafeteria was completed. With growing interest in the music program, the music building was added in 1962.\n" +
            "    In 1964, the students of McKinley petitioned and lobbied the State legislature for a gymnasium. Their efforts paid off as a gymnasium was built in 1964 and is aptly named the Student Council Gymnasium. In 1965, the football field was named the William Wise Field. William Wise coached the football team to the Interscholastic championship title of 1947.\n" +
            "    McKinley High School is proud of her long standing traditions. Over the years, they have been proudly and steadfastly maintained by students, teachers, administrators, and alumni of McKinley.\n" +
            "    The school colors, black and gold, were selected when McKinley High School was very young. Gold was chosen for McKinley’s close association with Hawaiian royalty. Not only was the school started during the reign of Kamehameha V, but also Honolulu High School, the predecessor of McKinley High School, used the palace of Princess Ruth for a school house.\n" +
            "    In searching for a color to compliment the gold, black was agreed upon. Part of the reason for the selection was that many McKinley graduates continued their education at Princeton University, whose colors are also black and gold. The nickname, “Tigers”, was possibly derived from the close association with Princeton.\n" +
            "    Other cherished aspects of McKinley’s history is the Code of Honor written in 1927 by student Mun Chee Chun. The code expressed the high standard of behavior which McKinley students tried to maintain. The original plaque of the code is proudly displayed in the main foyer of the Administration building.\n" +
            "    Commencement Exercises are traditionally held on campus. Beginning in the 1930’s, the growing enrollment in the student body made it increasingly difficult to hold an indoor graduation. For this reason, it was suggested by a faculty member that the ceremony be moved outdoors on the front of the Administration Building on the first Sunday in June. This tradition is still honored today.\n" +
            "    A tradition firmly upheld by all McKinley students is the respect given to the oval area surrounding President McKinley’s statue. No one is allowed to walk on the grassy oval. Only a graduating senior is allowed this privilege of crossing the oval on his or her Commencement Day.\n" +
            "    In 1923, a contest was held to choose a school song. Of the many excellent entries, the song written by Edward Himrod, then adviser of the Daily Pinion, was chosen. “Hail, McKinley, Hail” was chosen as the school alma mater and was set to music by Walter Maygrove, McKinley band director.\n" +
            "    Singing “Black and Gold” during the last three minutes of each football game began in the late 1950’s. Dr. Richard Lum, the band director of McKinley, used it to boost the pride in the team. Though the song had been sung since the 1920’s, establishing this tradition was especially loved by the students.\n" +
            "    This tradition continues and the “Black and Gold” is traditionally sung at all spirit rallies, athletic games, class reunions, and Commencement. “Black and Gold” is so well known that it is often mistaken as the school alma mater.\n" +
            "    Since its beginning, McKinley has always produced leaders and forerunners for Hawai’i. But she has also produced men and women who are not famous, yet who are a vital part of the life of these Islands. Prior to 1986, photographs of distinguished alumni were hung in the hallway of the Administration building in no formal or organized manner.\n" +
            "    In 1986, the faculty and alumni formalized and implemented the Hall of Honor recognition program. The Hall of Honor recognizes McKinley’s outstanding alumni who have brought honor to the school and community through their achievements and contributions. Today, this program continues as distinguished alumni are recognized with a formal induction assembly before faculty and students.\n" +
            "    Perhaps the most outstanding McKinley tradition is the school spirit and pride which has sparked campus life. We have a proud tradition...fund raising by students and teachers for a swimming pool, forming a human chain to pass rocks from the campus to Punchbowl to help build the lookout, collecting coconuts for trees to be planted at Ala Moana Park, and baking cookies for American soldiers during World War II.\n" +
            "    These traditions have made McKinley students and alumni proud to be Tigers. Though our school has been modified with the times, our spirit and pride remain constant.\n" +
            "    McKinley High School has contributed to the growth of our state and our nation. Our alumni have poured into the mainstream of American life in times of peace and stress.\n" +
            "    It was best put by Teichiro Hirata, principal of McKinley High School during its Centennial Celebration in 1965:\n" +
            "    “Yet, by far the greatest contribution McKinley has made and will continue to make is in her graduates, nameless in many instances, who served their respective communities in honest human endeavor. The day-to-day average citizen who provides goods and services, provides the best for their families with the sweat of their brow, who respects law and order, and who furnishes their sinew of war in times of international conflict. This is McKinley’s claim to greatness. Like Cornelia, mother of Roman Gracchi, McKinley echoes:\n" +
            "    “These are my jewels. I give them to my country.”\n" +
            "    McKinley continues to respect her past and build towards the future.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView title = (TextView) findViewById(R.id.titleAbout);

        TextView visiontitle = (TextView) findViewById(R.id.visionTitle);
        TextView visioncontent = (TextView) findViewById(R.id.visionContent);

        TextView missiontitle = (TextView) findViewById(R.id.missionTitle);
        TextView missioncontent = (TextView) findViewById(R.id.missionContent);

        TextView historytitle = (TextView) findViewById(R.id.historyTitle);
        TextView historycontent = (TextView) findViewById(R.id.historyContent);

        title.setText(R.string.titleAboutMcKinley);

        visiontitle.setText(vision);
        visioncontent.setText(visionstring);

        missiontitle.setText(mission);
        missioncontent.setText(missionstring);

        historytitle.setText(history);
        historycontent.setText(historystring);
    }
}
