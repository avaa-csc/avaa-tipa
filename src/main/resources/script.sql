-- noinspection SqlDialectInspectionForFile

/*
Selite-taulu
INSERT INTO infra.selite VALUES(SELITE_ID,NIMI,NAME,KUVAUS,DESCRIPTION);  -- comment
selite_id - TINYINT(4): 0 - 255 (selitetekstien id-numerot on ryhmitelty selkeyden vuoksi, jättää varaa myös muuttujien määrän kasvulle)
nimi & name - VARCHAR(80): max 80 merkkiä
kuvaus & description - VARCHAR(300): max 300 merkkiä
classificator - VARCHAR(200): classifies the contents of the row (location type, service type etc.)
Nyt kielinä suomi ja englanti. Jos palveluun tarvitaan lisää kieliä, tulee tätä taulua muuttaa lisäämällä uuden kielen mukainen lyhyt nimi ja pidempi kuvaus.

*/
INSERT INTO infra.selite VALUES(1,'aineisto','resource','Aineistointensiiviset tutkimusinfrastruktuurit tarjoavat tietovarantoja ja tietopalveluja sekä auttavat tutkijoita löytämään ja pääsemään käsiksi tutkimusaineistoihin. Enenevässä määrin aineistot ovat sähköisessä muodossa ja käytettävissä tutkijan fyysisestä sijainnista riippumattomasti.','Resource intensive research infrastructures offer data resources and information services and help researchers find and access research data. The resources are increasinly in electronic format and accessible independently of physical location.', 'SERVICETYPE');  -- palvelutyyppi
INSERT INTO infra.selite VALUES(2,'palvelu','service','Palveluintensiiviset tutkimusinfrastruktuurit tarjoavat esimerkiksi mittaus-, analyysi-, prosessointi-, laskenta-, asiantuntija-, tuki- ja koulutuspalveluita. Palvelut voivat olla tietoteknisiä ja automatisoituja tai henkilötyöhön painottuvia.','Service intensive research infrastructures offer measurement, analysis, processing, computing, expert, support and training services. Services can be virtual and automated or manual and require expert knowledge.', 'SERVICETYPE');  -- palvelutyyppi
INSERT INTO infra.selite VALUES(3,'laitteisto','equipment','Laitteistointensiiviset tutkimusinfrastruktuurit tarjoavat erityyppisiä tieteellisiä mittauslaitteita ja -asemia, laboratorioita, koneita ja muita fyysiseen paikkaan sidottuja, hajautettuja tai siirreltäviä välineitä.','Equipment intensive research infrastructures offer scientific measuring devices and stations, laboratories, machines and other equipment, which are portable, distributed or single-sited.', 'SERVICETYPE');  -- palvelutyyppi

INSERT INTO infra.selite VALUES(11,'virtuaalinen','virtual','Palvelu on käytettävissä internetin välityksellä.','Service is available through the internet.', 'LOCATIONTYPE');  -- paikkatyyppi
INSERT INTO infra.selite VALUES(12,'hajautettu','distributed','Palvelu tai sen osia tuotetaan tai on käytettävissä useassa maantieteellisessä sijainnissa.','Service, or parts of it, are produced or made available in multiple physical locations.', 'LOCATIONTYPE');  -- paikkatyyppi
INSERT INTO infra.selite VALUES(13,'paikkasidonnainen','single-sited','Palvelu on käytettävissä vain yhdessä maantieteellisessä sijainnissa.','The service is available only in a single physical location.', 'LOCATIONTYPE');  -- paikkatyyppi

INSERT INTO infra.selite VALUES(21,'hakuprosessin kautta saavutettavissa','accessible through application','Vain hakuprosessin tai kelpoisuusehdot läpäisseen saavutettavissa oleva palvelu.','Accessible only through a application process.','TERMS');  -- kayttoehto - saavutettavuus
INSERT INTO infra.selite VALUES(22,'tunnistautuneiden saavutettavissa','accessible through identification','Tunnistautumisen kautta avoimesti saavutettavissa oleva palvelu.','Accessible only through identification and authentication.','TERMS');  -- kayttoehto - saavutettavuus
INSERT INTO infra.selite VALUES(23,'kaikille avoimesti saavutettavissa','openly accessible','Kaikille avoin palvelu.','Openly accessible for all.','TERMS');  -- kayttoehto - saavutettavuus

INSERT INTO infra.selite VALUES(31,'käyttö kirjautuneena','use through login','Käyttö edellyttää kirjautumista.','Use of service requires authentication.','TERMS');  -- kayttoehto - anonymiteetti
INSERT INTO infra.selite VALUES(32,'käyttö anonyymi, julkaisu kirjautuneena','use anonymous, publication through login','Palvelun käyttö anonyymiä, tulosten julkaisu vaatii kirjautumisen.','Use of service is anonymous, publishing results requires authentication.','TERMS');  -- kayttoehto - anonymiteetti
INSERT INTO infra.selite VALUES(33,'käyttö täysin anonyymiä','use completely anonymous','Palvelun käyttö on täysin anonyymiä.','Use of service is completely anonymous.','TERMS');  -- kayttoehto - anonymiteetti

INSERT INTO infra.selite VALUES(41,'kaikille maksullinen','chargeable','Palvelun käyttö on kaikille maksullista.','Use of service is chargeable for everyone.','TERMS');  -- kayttoehto - maksullisuus
INSERT INTO infra.selite VALUES(42,'osittain maksullinen','partly chargeable','Palvelun käyttö on osittain maksullista.','Use of service is partly chargeable.','TERMS');  -- kayttoehto - maksullisuus
INSERT INTO infra.selite VALUES(43,'kaikille maksuton','free of charge','Palvelun käyttö on kaikille maksutonta.','Use of service is free of charge for all.','TERMS');  -- kayttoehto - maksullisuus

INSERT INTO infra.selite VALUES(51,'ei julkaisuvelvoitetta','no publication requirement','Ei velvoitetta julkaista tutkimustuloksia.','No requirement to publish research results.','TERMS');  -- kayttoehto - tulosten julkaisuvelvoite
INSERT INTO infra.selite VALUES(52,'julkaisuvelvoite','publication requirement','Velvoite julkaista tutkimustulokset.','Requirement to publish research results.','TERMS');  -- kayttoehto - tulosten julkaisuvelvoite
INSERT INTO infra.selite VALUES(53,'avoin julkaisuvelvoite','open publication requirement','Velvoite julkaista tutkimustulokset avoimesti.','Requirement to openly publish research results.','TERMS');  -- kayttoehto - tulosten julkaisuvelvoite

INSERT INTO infra.selite VALUES(61,'tuotokset ei saatavilla','output not available','Tutkimuksen tuotoksia, kuten dataa ja julkaisuja, ei saatavilla.','Research output, e.g. data and publications, not available.','TERMS');  -- kayttoehto - tuotoksien julkaisuvelvoite
INSERT INTO infra.selite VALUES(62,'osa tuotoksista saatavilla','output partly available','Osa tutkimuksen tuotoksista, kuten dataa ja julkaisuja, arkistoidaan ja on saatavilla.','Research output, e.g. data and publications, are partly archived and available.','TERMS');  -- kayttoehto - tuotoksien julkaisuvelvoite
INSERT INTO infra.selite VALUES(63,'tuotokset avoimesti saatavilla','output openly available','Tutkimukset tuotokset, kuten data ja julkaisut, arkistoidaan avoimesti saataville koneluettavassa muodossa.','Research output, e.g. data and publications, are archived in machine-readable form and openly available.','TERMS');  -- kayttoehto - tuotoksien julkaisuvelvoite

INSERT INTO infra.selite VALUES(71,'ei osaajarekisteriä tai koulutusta','no expert list or training','Palvelun käyttöön ei tarjota koulutusta, eikä osaajarekisteriä ole.','A list of experts doesn''t exist and no training is offered for the use of services.','TERMS');  -- kayttoehto - osaamisen avoimuus
INSERT INTO infra.selite VALUES(72,'osittainen osaajarekisteri ja opastus','partial expert list and training','Osaajat osittain kerrottu. Jonkin verran ohjeistusta ja koulutusta.','Experts partially documented. Some training is offered.','TERMS');  -- kayttoehto - osaamisen avoimuus
INSERT INTO infra.selite VALUES(73,'avoin osaajarekisteri ja koulutus','open expert list and training','Osaajarekisteri on avoin. Koulutusta ja opastusta olemassa.','An open expert register exists. Training is offered.','TERMS');  -- kayttoehto - osaamisen avoimuus

INSERT INTO infra.selite VALUES(81,'käyttöä ei seurata','no use tracking','Tuloksien ja tuotoksien käyttöä ei seurata.','Use of research results and outputs are not tracked.','TERMS');  -- kayttoehto - seurantatyökalut
INSERT INTO infra.selite VALUES(82,'käyttöä seurataan osin','partial use tracking','Tuloksien ja tuotoksien käyttöä seurataan osin.','Use of research results and outputs are partially tracked.','TERMS');  -- kayttoehto - seurantatyökalut
INSERT INTO infra.selite VALUES(83,'käytön seuranta avointa','open use tracking','Tuloksien ja tuotoksien käyttöä seurataan ja siitä kerrotaan avoimesti.','Use of research results and outputs are tracked and openly reported.','TERMS');  -- kayttoehto - seurantatyökalut

INSERT INTO infra.selite VALUES(91,'ei lisensointia','no licencing','Tutkimuksen tuloksia ei lisensoida.','Research results are not licenced.','TERMS');  -- kayttoehto - tulosten lisensointi
INSERT INTO infra.selite VALUES(92,'osittain lisensointua','partially licenced','Tutkimuksen tulokset on osittain lisensoitu.','Research results are partially licenced.','TERMS');  -- kayttoehto - tulosten lisensointi
INSERT INTO infra.selite VALUES(93,'avoin lisensointi','open licencing','Tutkimustuloksilta edellytetään avointa lisensointia. Esim. CCS4.0BY.','Research results are required to be openly licenced. E.g. CCS4.0BY.','TERMS');  -- kayttoehto - tulosten lisensointi


/*
table_data_avainsana.sql

AVAINSANA-TAULU: lista kaikista avainsanoista
INSERT INTO infra.avainsana VALUES(AVAINSANA_ID, AVAINSANA, KEYWORD);  -- comment
AVAINSANA_ID - INT(4): juokseva numero, kannan sisäinen, uniikki, identifioi avainsanan
AVAINSANA - VARCHAR(50): avainsana suomenkielellä
KEYWORD - VARCHAR(50): avainsana englanninkielellä
*/

INSERT INTO infra.avainsana VALUES(1, 'tutkimusaineistot', 'research data');  -- ATT & KDK-PAS
INSERT INTO infra.avainsana VALUES(2, 'avoin data', 'open data');  -- ATT & KDK-PAS
INSERT INTO infra.avainsana VALUES(3, 'kulttuuriperintöaineistot', 'cultural heritage data');  -- ATT & KDK-PAS
-- INSERT INTO infra.avainsana VALUES(3, 'data', 'data');  -- comment
-- INSERT INTO infra.avainsana VALUES(4, 'tieto', 'knowledge');  -- comment
-- INSERT INTO infra.avainsana VALUES(5, 'datapolitiikka', 'data policy');  -- comment

INSERT INTO infra.avainsana VALUES(6, 'digitaaliset ihmistieteet', 'digital humanities');  -- FIN-CLARIN
INSERT INTO infra.avainsana VALUES(7, 'infrastruktuuri', 'infrastructure');  -- FIN-CLARIN
INSERT INTO infra.avainsana VALUES(8, 'kielivarat', 'language resources');  -- FIN-CLARIN
INSERT INTO infra.avainsana VALUES(9, 'aineistot', 'data sets');  -- FIN-CLARIN
INSERT INTO infra.avainsana VALUES(10, 'tools', 'tools');  -- FIN-CLARIN

INSERT INTO infra.avainsana VALUES(11, 'sähköiset julkaisut', 'electronic publications');  -- FinElib
INSERT INTO infra.avainsana VALUES(12, 'lisensiointi', 'licensing');  -- FinElib
INSERT INTO infra.avainsana VALUES(13, 'sähköinen julkaiseminen', 'electronic publishing');  -- FinElib
INSERT INTO infra.avainsana VALUES(14, 'verkkoaineistot', 'online resources');  -- FinElib

INSERT INTO infra.avainsana VALUES(15, 'tiedonhakujärjestelmät', 'information retrieval systems');  -- Finna, http://www.yso.fi/onto/yso/p3926
INSERT INTO infra.avainsana VALUES(16, 'avoin lähdekoodi', 'open source');  -- Finna, http://www.yso.fi/onto/yso/p17089

INSERT INTO infra.avainsana VALUES(17, 'rekisteri', 'register');  -- FMAS
INSERT INTO infra.avainsana VALUES(18, 'mikroaineisto', 'microdata');  -- FMAS
INSERT INTO infra.avainsana VALUES(19, 'rekisteritutkimus', 'register-based research');  -- FMAS
INSERT INTO infra.avainsana VALUES(20, 'poikkitieteellisyys', 'interdisciplinary research');  -- FMAS
INSERT INTO infra.avainsana VALUES(21, 'tutkimusinfrastruktuuri', 'research infrastructure');  -- FMAS

INSERT INTO infra.avainsana VALUES(22, 'hila- ja pilvilaskenta', 'grid and cloud computing');  -- FGCI
INSERT INTO infra.avainsana VALUES(23, 'hila- ja pilvilaskentainfrastruktuuri', 'grid and cloud infrastructure');  -- FGCI

INSERT INTO infra.avainsana VALUES(24, 'EPOS', 'EPOS');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(25, 'tietokanta', 'database');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(26, 'mittaukset', 'measurements');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(27, 'observatorio', 'observatory');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(28, 'laboratorio', 'laboratory');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(29, 'aikasarjat', 'time series');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(30, 'geofysiikka', 'geophysics');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(31, 'geologia', 'geology');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(32, 'seismologia', 'seismology');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(33, 'geodesia', 'geodesy');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(34, 'geomagnetismi', 'geomagnetism');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(35, 'geosähköinen', 'geoelectromagnetics');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(36, 'petrofysiikka', 'petrophysics');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(37, 'hajautettu', 'distributed');  -- FIN-EPOS
INSERT INTO infra.avainsana VALUES(38, 'datanhallintajärjestelmä', 'data management system');  -- FIN-EPOS

INSERT INTO infra.avainsana VALUES(39, 'ilmakehän fysiikka', 'atmospheric physics');  -- INAR RI
INSERT INTO infra.avainsana VALUES(40, 'aerosolit', 'aerosols');  -- INAR RI
INSERT INTO infra.avainsana VALUES(41, 'klusterit', 'clusters');  -- INAR RI
INSERT INTO infra.avainsana VALUES(42, 'pilvet', 'clouds');  -- INAR RI
INSERT INTO infra.avainsana VALUES(43, 'ekosysteemi-ilmakehä vuorovaikutukset', 'ecosystem-atmosphere interactions');  -- INAR RI
INSERT INTO infra.avainsana VALUES(44, 'biogeokemialliset kierrot', 'biogeochemical cycles');  -- INAR RI
INSERT INTO infra.avainsana VALUES(45, 'ilmastonmuutos', 'global climate change');  -- INAR RI
INSERT INTO infra.avainsana VALUES(46, 'kasvihuonekaasut', 'GHCs');  -- INAR RI
INSERT INTO infra.avainsana VALUES(47, 'jatkuvat mittaukset', 'long-term measurements');  -- INAR RI
INSERT INTO infra.avainsana VALUES(48, 'satelliittiaineistot', 'satellite data');  -- INAR RI
INSERT INTO infra.avainsana VALUES(49, 'SMEAR asemat', 'SMEAR stations');  -- INAR RI
INSERT INTO infra.avainsana VALUES(50, 'prosessi- ja ilmastomallit', 'multi-scale models and observations');  -- INAR RI

INSERT INTO infra.avainsana VALUES(51, 'hiirimallit', 'mouse models');  -- INFRAFRONTIER
INSERT INTO infra.avainsana VALUES(52, 'hiirimutantit', 'mouse archive');  -- INFRAFRONTIER
INSERT INTO infra.avainsana VALUES(53, 'fenotyypin analysointi', 'phenotyping');  -- INFRAFRONTIER
INSERT INTO infra.avainsana VALUES(54, 'hiiripankki', 'mouse bank');  -- INFRAFRONTIER
INSERT INTO infra.avainsana VALUES(55, 'hiiriklinikka', 'mouse clinic');  -- INFRAFRONTIER
-- lopussa iddlä: 98

INSERT INTO infra.avainsana VALUES(56, 'Instruct', 'Instruct');  -- Instruct
INSERT INTO infra.avainsana VALUES(57, 'ICVIR', 'ICVIR');  -- Instruct
INSERT INTO infra.avainsana VALUES(58, 'rakennesolubiologia', 'structural cell biology');  -- Instruct
INSERT INTO infra.avainsana VALUES(59, 'menetelmäkehitys', 'methods development');  -- Instruct
INSERT INTO infra.avainsana VALUES(60, 'näytteiden valmistaminen', 'sample preparation');  -- Instruct
INSERT INTO infra.avainsana VALUES(61, 'virusten puhdistaminen', 'virus purification');  -- Instruct
INSERT INTO infra.avainsana VALUES(62, 'Instruct-keskukset', 'Intruct Centres');  -- Instruct

INSERT INTO infra.avainsana VALUES(63, 'kasvihuonekaasu', 'greenhouse gas');  -- comment
INSERT INTO infra.avainsana VALUES(64, 'ilmakehä', 'atmosphere');  -- comment
INSERT INTO infra.avainsana VALUES(65, 'metsä', 'forest');  -- comment
INSERT INTO infra.avainsana VALUES(66, 'järvi', 'lake');  -- comment
INSERT INTO infra.avainsana VALUES(67, 'suo', 'wetland');  -- comment
INSERT INTO infra.avainsana VALUES(68, 'ekosysteemi', 'ecosystem');  -- comment
INSERT INTO infra.avainsana VALUES(69, 'vuorovaikutus', 'interaction');  -- comment
INSERT INTO infra.avainsana VALUES(70, 'hiilidioksidi', 'carbon dioxide');  -- comment
INSERT INTO infra.avainsana VALUES(71, 'metaani', 'methane');  -- comment
INSERT INTO infra.avainsana VALUES(72, 'ilmasto', 'climate');  -- comment

INSERT INTO infra.avainsana VALUES(73, 'hyvin korkeaenerginen hiukkasfysiikka', 'very high energy astrophysics');  -- CTA
INSERT INTO infra.avainsana VALUES(74, 'avaruushiukkasfysiikka', 'astroparticle physics');  -- CTA

INSERT INTO infra.avainsana VALUES(75, 'kiihdytinpohjainen fysiikka', 'accelerator based research');  -- JYFLACCLAB
INSERT INTO infra.avainsana VALUES(76, 'ionisuihkusovellukset', 'ion-beam applications');  -- JYFLACCLAB
INSERT INTO infra.avainsana VALUES(77, 'säteilynilmaisimet', 'radiation detectors');  -- JYFLACCLAB
INSERT INTO infra.avainsana VALUES(78, 'ydinfysiikka', 'nuclear physics');  -- JYFLACCLAB

INSERT INTO infra.avainsana VALUES(79, 'e-infrastruktuuri', 'e-infrastructure');  -- CSC RI
INSERT INTO infra.avainsana VALUES(80, 'datakeskus', 'datacenter');  -- CSC RI
INSERT INTO infra.avainsana VALUES(81, 'pilvilaskenta', 'cloud computing');  -- CSC RI
INSERT INTO infra.avainsana VALUES(82, 'tietoverkko', 'network');  -- CSC RI
INSERT INTO infra.avainsana VALUES(83, 'suurteholaskenta', 'HPC');  -- CSC RI

INSERT INTO infra.avainsana VALUES(84, NULL, 'IaaS');  -- ELIXIR

INSERT INTO infra.avainsana VALUES(85, 'kuvantaminen', 'imaging');  -- EuBI

INSERT INTO infra.avainsana VALUES(86, 'Euclid', 'Euclid');  -- euclid
INSERT INTO infra.avainsana VALUES(87, 'kosmologia', 'cosmology');  -- euclid
INSERT INTO infra.avainsana VALUES(88, 'pimeä energia', 'dark energy');  -- euclid
INSERT INTO infra.avainsana VALUES(89, 'pimeä aine', 'dark matter');  -- euclid

INSERT INTO infra.avainsana VALUES(90, 'geeniterapia', 'gene therapy');  -- NVVL
INSERT INTO infra.avainsana VALUES(91, 'geenilääkkeet', 'gene drugs');  -- NVVL
INSERT INTO infra.avainsana VALUES(92, 'GMP tuotanto', 'GMP manufacturing');  -- NVVL

INSERT INTO infra.avainsana VALUES(93, 'XFEL', 'XFEL');  -- XBI&XFEL
INSERT INTO infra.avainsana VALUES(94, 'biokuvantaminen', 'bioimaging');  -- XBI&XFEL
INSERT INTO infra.avainsana VALUES(95, 'nanokristallografia', 'nanocrystallography');  -- XBI&XFEL
INSERT INTO infra.avainsana VALUES(96, 'yksittäispartikkeli', 'single particle');  -- XBI&XFEL
INSERT INTO infra.avainsana VALUES(97, 'näytteenvalmistus', 'sample preparation');  -- XBI&XFEL

INSERT INTO infra.avainsana VALUES(98, 'kylmäsäilytys', 'cryopreservation');  -- INFRAFRONTIER

INSERT INTO infra.avainsana VALUES(99, NULL, 'biomass');  -- BIOECONOMY infra
INSERT INTO infra.avainsana VALUES(100, NULL, 'biorefinery');  -- BIOECONOMY infra
INSERT INTO infra.avainsana VALUES(101, NULL, 'process technology');  -- BIOECONOMY infra
INSERT INTO infra.avainsana VALUES(102, NULL, 'industrial biotechnology');  -- BIOECONOMY infra
INSERT INTO infra.avainsana VALUES(103, NULL, 'synthetic biology');  -- BIOECONOMY infra
INSERT INTO infra.avainsana VALUES(104, NULL, 'materials science');  -- BIOECONOMY infra
INSERT INTO infra.avainsana VALUES(105, NULL, 'bio-based materials');  -- BIOECONOMY infra
INSERT INTO infra.avainsana VALUES(106, NULL, 'scale-up');  -- BIOECONOMY infra
INSERT INTO infra.avainsana VALUES(107, NULL, 'pilot plant');  -- BIOECONOMY infra

INSERT INTO infra.avainsana VALUES(108, 'teknologiapalvelut', 'technology platform services');  -- biokeskus suomi
INSERT INTO infra.avainsana VALUES(109, 'kansallinen infrastruktuuri', 'nation-wide infrastructure');  -- biokeskus suomi

INSERT INTO infra.avainsana VALUES(110, 'geoinformatiiikka', 'geoinformatics');  -- oGIIR
INSERT INTO infra.avainsana VALUES(111, 'paikkatietoinfrastruktuuri', 'geospatial information infrastructure');  -- oGIIR
INSERT INTO infra.avainsana VALUES(112, NULL, 'spatial data infrastructure');  -- oGIIR
INSERT INTO infra.avainsana VALUES(113, 'tietopalvelu', NULL);  -- oGIIR
INSERT INTO infra.avainsana VALUES(114, 'ympäristötutkimus', NULL);  -- oGIIR
INSERT INTO infra.avainsana VALUES(115, 'luonnonvaratutkimus', NULL);  -- oGIIR
INSERT INTO infra.avainsana VALUES(116, 'avoin tiede', 'open science');  -- oGIIR
INSERT INTO infra.avainsana VALUES(117, 'avoin tutkimus', 'open research');  -- oGIIR
INSERT INTO infra.avainsana VALUES(118, 'tutkimuksen tietoaineistot', 'research data');  -- oGIIR
INSERT INTO infra.avainsana VALUES(119, 'paikkatiedon teholaskenta', 'high performance geocomputing');  -- oGIIR

INSERT INTO infra.avainsana VALUES(120, 'biopankki', 'biobank');  -- BBMRI
INSERT INTO infra.avainsana VALUES(121, 'kliininen biopankki', 'clinical biobank');  -- BBMRI


INSERT INTO infra.avainsana VALUES(122, 'väestoaineistojen biopankki', 'population biobank');  -- BBMRI
INSERT INTO infra.avainsana VALUES(123, 'IT-infrastruktuuri', 'IT infrastructure');  -- BBMRI

INSERT INTO infra.avainsana VALUES(124, 'synkrotroni', 'synchrotron'); -- ESRF
INSERT INTO infra.avainsana VALUES(125, 'röntgensäteet', 'x-rays'); -- ESRF
INSERT INTO infra.avainsana VALUES(126, 'säteily', 'radiation'); -- ESRF
INSERT INTO infra.avainsana VALUES(127, 'säteilylinja', 'beamline'); -- ESRF
INSERT INTO infra.avainsana VALUES(128, 'rakennetutkimus', 'structural research'); -- ESRF

INSERT INTO infra.avainsana VALUES(129, NULL, 'IODP'); -- IODP
INSERT INTO infra.avainsana VALUES(130, NULL, 'ocean'); -- IODP
INSERT INTO infra.avainsana VALUES(131, NULL, 'research'); -- IODP
INSERT INTO infra.avainsana VALUES(132, NULL, 'earth'); -- IODP
-- INSERT INTO infra.avainsana VALUES(72, NULL, 'climate'); -- IODP
INSERT INTO infra.avainsana VALUES(133, NULL, 'deep life'); -- IODP
INSERT INTO infra.avainsana VALUES(134, NULL, 'geodynamics'); -- IODP
INSERT INTO infra.avainsana VALUES(135, NULL, 'geohazards'); -- IODP
INSERT INTO infra.avainsana VALUES(136, NULL, 'research vessel'); -- IODP

INSERT INTO infra.avainsana VALUES(137, 'eliölaji', 'fauna'); -- FinBIF
INSERT INTO infra.avainsana VALUES(138, 'laji', 'flora'); -- FinBIF
INSERT INTO infra.avainsana VALUES(139, 'lajisto', 'species'); -- FinBIF
INSERT INTO infra.avainsana VALUES(140, 'systematiikka', 'taxonomy'); -- FinBIF
INSERT INTO infra.avainsana VALUES(141, 'lajien tieteellinen luokittelu', 'systematics'); -- FinBIF
INSERT INTO infra.avainsana VALUES(142, 'lajitieto', 'species information'); -- FinBIF
-- INSERT INTO infra.avainsana VALUES(116, 'avoin tiede', 'open science'); -- FinBIF
-- INSERT INTO infra.avainsana VALUES(2, 'avoin data', 'open data'); -- FinBIF
INSERT INTO infra.avainsana VALUES(143, 'luonnon monimuotoisuus', NULL); -- FinBIF
INSERT INTO infra.avainsana VALUES(144, 'biodiversiteetti', 'biodiversity'); -- FinBIF
INSERT INTO infra.avainsana VALUES(145, 'biodiversiteetti-informatiikka', 'biodiversity informatics'); -- FinBIF
INSERT INTO infra.avainsana VALUES(146, 'biologia', 'biology'); -- FinBIF
INSERT INTO infra.avainsana VALUES(147, 'kansalaistiede', 'citizen science'); -- FinBIF
INSERT INTO infra.avainsana VALUES(148, 'kansalaishavainnot', 'observation'); -- FinBIF
INSERT INTO infra.avainsana VALUES(149, 'esiintyminen', 'occurence'); -- FinBIF
INSERT INTO infra.avainsana VALUES(150, 'luonnontieteellinen kokoelma', 'collection'); -- FinBIF
INSERT INTO infra.avainsana VALUES(151, 'digitointi', 'digitisation'); -- FinBIF

INSERT INTO infra.avainsana VALUES(152, 'eliölaji', 'fauna'); -- GBIF
INSERT INTO infra.avainsana VALUES(153, 'laji', 'flora'); -- GBIF
INSERT INTO infra.avainsana VALUES(154, 'lajisto', 'species'); -- GBIF
INSERT INTO infra.avainsana VALUES(155, 'systematiikka', 'taxonomy'); -- GBIF
INSERT INTO infra.avainsana VALUES(156, 'lajien tieteellinen luokittelu', 'systematics'); -- GBIF
INSERT INTO infra.avainsana VALUES(157, 'lajitieto', 'species information'); -- GBIF
INSERT INTO infra.avainsana VALUES(158, 'avoin tiede', 'open science'); -- GBIF
INSERT INTO infra.avainsana VALUES(159, 'avoin data', 'open data'); -- GBIF
INSERT INTO infra.avainsana VALUES(160, 'luonnon monimuotoisuus', NULL); -- GBIF
INSERT INTO infra.avainsana VALUES(161, 'biodiversiteetti', 'biodiversity'); -- GBIF
INSERT INTO infra.avainsana VALUES(162, 'biodiversiteetti-informatiikka', 'biodiversity informatics'); -- GBIF
-- INSERT INTO infra.avainsana VALUES(146, 'biologia', 'biology'); -- GBIF
INSERT INTO infra.avainsana VALUES(164, 'kansalaistiede', 'citizen science'); -- GBIF
INSERT INTO infra.avainsana VALUES(165, 'kansalaishavainnot', 'observation'); -- GBIF
INSERT INTO infra.avainsana VALUES(166, 'esiintyminen', 'occurence'); -- GBIF
INSERT INTO infra.avainsana VALUES(167, 'luonnontieteellinen kokoelma', 'collection'); -- GBIF
INSERT INTO infra.avainsana VALUES(168, 'digitointi', 'digitisation'); -- GBIF

INSERT INTO infra.avainsana VALUES(169, 'life sciences', 'life sciences'); -- EMBL
INSERT INTO infra.avainsana VALUES(170, 'molekyylibiologia', 'molecular biology'); -- EMBL
INSERT INTO infra.avainsana VALUES(171, 'bioinformatiikka', 'bioinformatics'); -- EMBL
INSERT INTO infra.avainsana VALUES(172, 'rakennebiologia', 'structural biology'); -- EMBL
INSERT INTO infra.avainsana VALUES(173, 'valomikroskopia', 'light microscopy'); -- EMBL
INSERT INTO infra.avainsana VALUES(174, 'kemiallinen biologia', 'chemical biology'); -- EMBL
INSERT INTO infra.avainsana VALUES(175, 'elektronimikroskopia', 'electron microscopy'); -- EMBL
INSERT INTO infra.avainsana VALUES(176, 'virtaussytometria', 'flow cytometry'); -- EMBL
INSERT INTO infra.avainsana VALUES(177, 'genomiikka', 'genomics'); -- EMBL
INSERT INTO infra.avainsana VALUES(178, 'metabolomiikka', 'metabolomics'); -- EMBL
INSERT INTO infra.avainsana VALUES(179, 'proteiinien ilmentäminen', 'protein expression and purification'); -- EMBL
INSERT INTO infra.avainsana VALUES(180, 'proteomiikka', 'proteomics'); -- EMBL
INSERT INTO infra.avainsana VALUES(181, 'tutkijankoulutus', 'researcher training'); -- EMBL

INSERT INTO infra.avainsana VALUES(182, NULL, 'single cells'); -- SC-infra
INSERT INTO infra.avainsana VALUES(183, NULL, 'national infrastructure'); -- SC-infra
INSERT INTO infra.avainsana VALUES(184, NULL, 'core facility'); -- SC-infra
INSERT INTO infra.avainsana VALUES(185, NULL, 'next generation sequencing'); -- SC-infra
INSERT INTO infra.avainsana VALUES(186, NULL, 'transcriptomics'); -- SC-infra
INSERT INTO infra.avainsana VALUES(187, NULL, 'epigenomics'); -- SC-infra
INSERT INTO infra.avainsana VALUES(188, NULL, 'genotyping'); -- SC-infra
INSERT INTO infra.avainsana VALUES(189, NULL, 'RNA'); -- SC-infra
INSERT INTO infra.avainsana VALUES(190, NULL, 'DNA'); -- SC-infra
INSERT INTO infra.avainsana VALUES(191, NULL, 'NGS'); -- SC-infra

INSERT INTO infra.avainsana VALUES(192, 'Infrastruktuuri', 'Infrastructure'); -- RAMI
INSERT INTO infra.avainsana VALUES(193, 'Materiaaliominaisuuksien karakterisointi', 'Material-property characterization'); -- RAMI
INSERT INTO infra.avainsana VALUES(194, 'Kiertotalous', 'Circular economy'); -- RAMI
INSERT INTO infra.avainsana VALUES(195, 'Luonnon raakamateriaalit', 'Natural raw materials'); -- RAMI
INSERT INTO infra.avainsana VALUES(196, 'Uudet synteettiset materiaalit', 'New synthetic materials'); -- RAMI
INSERT INTO infra.avainsana VALUES(197, 'Toiminnalliset materiaalit', 'Functional materials'); -- RAMI
INSERT INTO infra.avainsana VALUES(198, 'Epäorgaaniset materiaalit', 'Inorganic materials'); -- RAMI
INSERT INTO infra.avainsana VALUES(199, 'Komposiittimateriaalit', 'Composite materials'); -- RAMI
INSERT INTO infra.avainsana VALUES(200, 'Hybridimateriaalit', 'Hybrid materials'); -- RAMI
-- INSERT INTO infra.avainsana VALUES(85, 'kuvantaminen', 'imaging'); -- HIM
INSERT INTO infra.avainsana VALUES(201, 'He-ionit', 'He ions'); -- HIM
INSERT INTO infra.avainsana VALUES(225, 'fokusoitu ionisuihku', 'focused ion beam'); -- HIM
INSERT INTO infra.avainsana VALUES(202, 'korkea resoluutio', 'high-resolution'); -- HIM
INSERT INTO infra.avainsana VALUES(163, 'materiaalitutkimus', 'materials research'); -- HIM
-- INSERT INTO infra.avainsana VALUES(146, 'biologia', 'biology'); -- HIM
INSERT INTO infra.avainsana VALUES(203, 'ESO', 'ESO'); -- ESO
INSERT INTO infra.avainsana VALUES(204, 'tähtitiede', 'astronomy'); -- ESO
INSERT INTO infra.avainsana VALUES(205, NULL, 'nuclear reactor safety'); -- NextGenTH
INSERT INTO infra.avainsana VALUES(206, NULL, 'nuclear thermal hydraulics'); -- NextGenTH
INSERT INTO infra.avainsana VALUES(207, NULL, 'two-phase flow'); -- NextGenTH
INSERT INTO infra.avainsana VALUES(208, NULL, 'modular heat transfer systems'); -- NextGenTH
INSERT INTO infra.avainsana VALUES(210, NULL, 'heat transfer and fluid flow'); -- NextGenTH
INSERT INTO infra.avainsana VALUES(211, NULL, 'multidimensional flow measurement'); -- NextGenTH
INSERT INTO infra.avainsana VALUES(212, 'hiukkasfysiikka', 'particle physics'); -- CERN
INSERT INTO infra.avainsana VALUES(213, 'suurenergiafysiikka', 'high energy physics'); -- CERN
INSERT INTO infra.avainsana VALUES(214, 'hiukkaskiihdytin', 'accelerator'); -- CERN
INSERT INTO infra.avainsana VALUES(215, 'hiukkastörmäytin', 'collider'); -- CERN
INSERT INTO infra.avainsana VALUES(216, 'LHC', 'LHC'); -- CERN
INSERT INTO infra.avainsana VALUES(217, 'Higgs', 'Higgs'); -- CERN
INSERT INTO infra.avainsana VALUES(218, 'grid', 'grid'); -- CERN
INSERT INTO infra.avainsana VALUES(227, 'ioni', 'ion'); -- FAIR
INSERT INTO infra.avainsana VALUES(228, 'antiprotoni', 'antiproton'); -- FAIR
-- INSERT INTO infra.avainsana VALUES(213, 'suurenergiafysiikka', 'high energy'); -- FAIR
-- INSERT INTO infra.avainsana VALUES(214, 'kiihdytin', 'accelerator'); -- FAIR
-- INSERT INTO infra.avainsana VALUES(215, 'aineen rakenne', 'structure of matter'); -- FAIR
INSERT INTO infra.avainsana VALUES(229, 'plasmafysiikka', 'plasma physics'); -- FAIR
INSERT INTO infra.avainsana VALUES(230, 'ydin', 'nuclear'); -- FAIR
INSERT INTO infra.avainsana VALUES(231, 'hadroni', 'hadron'); -- FAIR
INSERT INTO infra.avainsana VALUES(219, 'baryoninen', 'baryonic'); -- FAIR

INSERT INTO infra.avainsana VALUES(220, 'fysiikka', 'physics'); -- FAIR
INSERT INTO infra.avainsana VALUES(221, 'atomi', 'atomic'); -- FAIR
INSERT INTO infra.avainsana VALUES(222, 'teleskooppi', 'telescope'); -- NOT
INSERT INTO infra.avainsana VALUES(223, 'optinen', 'optical'); -- NOT
INSERT INTO infra.avainsana VALUES(224, 'yhteispohjoismainen', 'nordic'); -- NOT
-- INSERT INTO infra.avainsana VALUES(79, 'e-infrastruktuuri', 'e-infrastructure'); -- NeIC", 'Huom! 225 käytetty ylempänä!
INSERT INTO infra.avainsana VALUES(226, 'yhteistyö', 'collaboration'); -- NeIC
INSERT INTO infra.avainsana VALUES(232, 'FINCA', 'FINCA'); -- ESO
INSERT INTO infra.avainsana VALUES(233, 'aineen rakenne', 'structure of matter'); -- FAIR

/*
table_data_infra.sql
INSERT INTO infra.infra VALUES(INFRA_ID,ISNI,AKTIIVINEN,VALMISTELU_ALOITUSVUOSI,RAKENNUS_ALOITUSVUOSI,TOIMINTA_ALOITUSVUOSI,TOIMINTA_LOPETUSVUOSI,NIMI,NAME,LYHENNE,ACRONYM,EDELLINEN_INFRA, KUVAUS, DESCRIPTION, LOGO_URL, IMAGE_URL, '2016-07-25');  -- comment

INFRA_ID - BIGINT(20): juokseva numero, kannan sisäinen, uniikki
ISNI - VARCHAR(150): pysyvä tunniste (PID) tutkimusinfroille. Näitä ei vielä olemassa, vaan pelkkä placeholder. ISNI:t 16 merkin numerosarjoja (+lukemista helpottavat välilyönnit, jossei haluta hoitaa niitä ohjelmallisesti).
AKTIIVINEN TINYTINT(4): [0,1] = boolean-arvo sille on infra aktiivinen ja palvelut käytettävissä tällä hetkellä.
VALMISTELU_ALOITUSVUOSI - INT(11): vuosiluku.
RAKENNUS_ALOITUSVUOSI - INT(11): vuosiluku.
TOIMINTA_ALOITUSVUOSI - INT(11): vuosiluku.
TOIMINTA_LOPETUSVUOSI - INT(11): vuosiluku.
NIMI - VARCHAR(100): suomenkielinen nimi infralle
NAME - VARCHAR(100): englanninkielinen nimi infralle
LYHENNE - VARCHAR(30): suomenkielinen lyhenne infralle
ACRONYM - VARCHAR(30): englanninkielinen lyhenne infralle
EDELLINEN_INFRA - BIGINT(20): linkki toiseen infraan, jos se on ollut tämän edeltäjä
KUVAUS - VARCHAR(300): infran suomenkielinen yleiskuvaus
DESCRIPTION - VARCHAR(300): infran englanninkielinen yleiskuvaus
LOGO_URL - VARCHAR(300): url-osoite infran logon sisältävään kuvatiedostoon
IMAGE_URL - VARCHAR(300): url-osoite infran kuvituskuvan  sisältävään kuvatiedostoon
API_DATA - DATE: date used as a source to create permanent URNs
*/

INSERT INTO infra.infra VALUES(1,NULL,1,NULL,NULL,NULL,NULL,'Eurooppalainen sosiaalitutkimus','European Social Survey','ESS (Suomi)','ESS (Finland)',NULL, 'European Social Survey (ESS) on tieteellisistä lähtökohdista toteutettava vertaileva kyselytutkimus, jossa kartoitetaan ja selitetään eurooppalaisten muuttuvien instituutioiden ja kansalaisten asenteiden, uskomusten ja käyttäytymisen välisiä suhteita. ESS noudattaa erittäin korkeita menetelmällisiä vaatimuksia aina kyselylomakkeen suunnittelusta ja otannasta kenttätyömenetelmiin ja aineiston arkistointiin. Tutkimusaineisto on tutkijoiden vapaasti käytettävissä. ESS on toteutettu yli 30:ssa maassa vuodesta 2002.', 'The European Social Survey (ESS) is an academically driven cross-national survey that charts and explains the relationships between the attitudes, beliefs and behaviour patterns of Europe''s institutions and peoples as the latter change. The ESS applies extremely high standards of methodological rigour across the board from questionnaire design and sampling, to fieldwork methodologies and the archiving of material. The data are freely available for all researchers. The ESS has been conducted in more than 30 countries since 2002.', 'http://avaa.tdata.fi/documents/10197/76259/ESS_Logo.jpg/66f080d1-24c8-4bf2-bbee-64c00550a553', NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(2,NULL,1,2007,2012,2009,NULL,'Yhteinen kieliaineistojen ja -teknologian infrastruktuuri','Common Language Resource and Technology Infrastructure','FIN-CLARIN','FIN-CLARIN',NULL, 'CLARIN-ERIC on eurooppalainen tutkimusinfrastruktuurikonsortio, joka on sitoutunut luomaan yhteiskäyttöisen ja yhteensopivan tutkimusinfrastruktuurin kielivaroille ja kieliteknologialle. Tarkoitus on lieventää nykyistä toiminnan pirstoutuneisuutta tarjoamalla vakaa, pysyvä, helppokäyttöinen ja laajennettava tutkimusinfrastruktuuri, jossa tutkijat voivat työskennellä omilla työasemillaan. Suomen kansallinen tutkimusinfrastruktuuri FIN-CLARIN perustettiin vuonna 2007 ja se oli jo vuoden 2009 kansallisella tutkimusinfrastruktuurien tiekartalla. FIN-CLARIN on valmistautunut Suomen liittymiseen CLARIN-ERIC:iin kehittämällä Kielipankkia yhteisenä keskitettynä palveluna, jossa on otettu käyttöön kansainvälisesti yhteensopivia järjestelmiä.', 'CLARIN is a European research infrastructure consortium, dedicated to creating a generally available and interoperable research infrastructure for language resources and language technology. The intention is to alleviate the fragmented nature of current research activities by providing a stable, permanent, intuitive and scalable research infrastructure, in which researchers can work at their own workstations. FIN-CLARIN, Finland’s national research infrastructure, was founded in 2007 and was included on the national research infrastructure roadmap for 2009. Preparations for Finland''s accession to CLARIN-ERIC have included the development of FIN-CLARIN''s Language Bank as a common centralised service making use of internationally compatible systems.', 'http://avaa.tdata.fi/documents/10197/76259/FIN-CLARIN_logo.gif/fc3f6fc1-b390-484c-b3ae-428907985b9f', NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(3,NULL,1,NULL,1997,2000,NULL,'Kansallinen elektroninen kirjasto','National Electronic Library','FinElib','FinElib',NULL, 'Kansallinen elektroninen kirjasto, FinELib, on suomalaisten yliopistojen, ammattikorkeakoulujen, tutkimuslaitosten, erikoiskirjastojen ja yleisten kirjastojen muodostama konsortio. FinELib hankkii kansainvälisiä ja kotimaisia elektronisia aineistoja kilpailukykyisesti, varmistaa laadukkaiden ja monipuolisten elektronisten aineistojen saannin sekä edistää niiden käyttöä tutkimuksessa, opetuksessa, oppimisessa ja yleisessä tiedon saannissa.', 'The Finnish National Electronic Library, FinELib, is a consortium of Finnish universities, polytechnics, research institutes and specialist and public libraries. FinELib acquires both Finnish and international e-resources competitively, ensures the availability of diverse, high-quality electronic material and promotes the use of such material in research, teaching, learning and in the general acquisition of information-', NULL, NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(4,NULL,1,2008,2012,2013,NULL,'Kansallisen Digitaalisen Kirjaston asiakasliittymä','National Digital Library public interface','Finna','Finna',NULL, 'Kansallisen digitaalisen kirjaston asiakasliittymä Finna on kansallinen verkkopalvelu ja tutkimusinfrastruktuuri, joka avaa pääsyn kulttuurin ja tieteen aineistoihin ja palveluihin, tuo uusia mahdollisuuksia tutkimukselle sekä muulle luovalle toiminnalle.', 'Finna, the user interface of the Finnish National Digital Library, is a national web service and research infrastructure under constant development. It provides access to cultural and scholarly resources and services via a single service, and provides new possibilities for research and other creative activities.', 'http://avaa.tdata.fi/documents/10197/76259/FNA_tunnus_vaaka_WEB_turk.png/397bd022-3bb5-48a7-8570-909f8610034c', NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(5,NULL,0,2013,2015,NULL,NULL,'Kansallinen rekisteri- ja mikroaineistojen tutkijapalvelu','Finnish Microdata Access Services','FMAS','FMAS',NULL, 'Kansallinen rekisteri- ja mikroaineistojen tutkijapalvelu  on suunniteltu helpottamaan rekisteritietojen ja tilastoaineistojen tutkimuskäyttöä tutkimusprosessin kaikissa vaiheissa.  Tutkijapalvelu koostuu neljästä keskenään yhteen toimivasta palvelusta, jotka yhdessä tarjoavat yksikanavaisen väylän tutkimuksen suunnittelusta aineiston analysointiin: (1) aineistokatalogi, (2) käyttölupien sähköinen hakupalvelu, (3) etätyöpöytä ja (4) informaatio- ja tukipalvelu.', 'The Finnish Microdata Access Services, FMAS, has been designed to facilitate the use of register and statistical data at all phases of the research process. The FMAS will consist of four services: the data catalogue, the digital permit service, the remote access system, and the information and support service.', NULL, NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(6,NULL,1,NULL,1999,1999,NULL,'Yhteiskuntatieteellinen tietoarkisto ja Euroopan tietoarkistojen konsortio','Finnish Social Science Data Archive and Consortium of European Social Science Data Archives',NULL,'FSD, CESSDA',NULL, 'CESSDA on eurooppalaisten yhteiskuntatieteellisten tietoaineistoarkistojen hajautettu tutkimusinfrastruktuuri, jonka toiminta perustuu aktiivisiin kansallisiin palveluntuottajiin. Uusi CESSDA rakentaa kattavan eurooppalaisen verkkotietovarannon ja tietopalveluita, joiden avulla tutkijat voivat paikallistaa ja saada helposti käyttöönsä tutkimukselleen merkityksellisiä tutkimusaineistoja. CESSDA tarjoaa tieteelliselle tutkimukselle ja yhteiskunnalliselle päätöksenteolle keskeisen tietopohjan eurooppalaisten yhteiskuntien ja globaalien haasteiden seurantaan ja ongelmanratkaisuun. Yhteiskuntatieteellinen tietoarkisto on tutkimuksen ja opetuksen valtakunnallinen palveluyksikkö. Sen tehtävänä on arkistoida ja välittää koti- ja ulkomaisia sähköisiä tutkimusaineistoja tutkimukseen, opetukseen ja opiskeluun ja tarjota alan tietopalvelua. Yhteiskuntatieteellinen tietoarkisto on toiminut uuden CESSDAn Suomen palveluntuottajana vuodesta 2013 alkaen. Lisäksi Tietoarkisto vastaa Suomen kansallisesta jäsenyydestä useissa alansa kansainvälisissä datapalveluissa tai kansainvälisesti vertailevissa kyselytutkimuksissa. Nämä palvelut tai kyselytutkimukset ovat: LIS Cross-national Data Center Luxemburgissa, ICPSR Yhdysvalloissa, International Social Survey Programme-, European Value Study- ja Comparative Study of Electoral Systems -tutkimukset.', 'CESSDA is a pan-European distributed research infrastructure whose operations are largely based on national service providers that is, social science data archives. The new CESSDA is building a comprehensive online European data repository and information services, which researchers can use to locate and easily access research data significant to their work. CESSDA provides relevant data for academic research and societal decision-making, enabling monitoring and problemsolving related to the challenges facing European countries and the global community. The Finnish Social Science Data Archive (FSD) is a national resource centre for research and teaching. It archives and disseminates Finnish and international electronic research data for research, teaching and study purposes, and provides information services on data-related issues. The FSD is also responsible for Finnish national membership in several internationally comparative data services or survey programmes. These services and data are free of charge either to all users or to customers coming from member organisations, depending on the conditions. These services or surveys are: LIS Cross-national Data Center in Luxembourg, ICPSR in the USA, International Social Survey Programme, European Value Study, and Comparative Study of Electoral Systems.', NULL, NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(7,NULL,1,2005,2009,2013,NULL,'Kansalliset tietoinfrastruktuuripalvelut ATT ja KDK-PAS','National information infrastructure by Open Science and Research Initiative and National Digital Library','ATT, KDK-PAS',NULL,NULL, 'Kansalliset tutkimusinfrastruktuurit  ATT ja KDK-PAS ovat kansallinen tutkimusinfrastruktuuri, jonka taustalla ovat opetus- ja kulttuuriministeriön käynnistämät hankkeet Avoin tiede ja tutkimus (ATT) ja Kansallinen digitaalinen kirjasto (KDK). Hankkeet kehittävät yhteistyössä pysyvää, koordinoitua tutkimusinfrastruktuuria Suomen tutkimusjärjestelmän kaikkien tieteenalojen aineistojen hallinnan tueksi. Infrastruktuuri palvelee hajautetusti  digitaalisen aineiston jakamisessa, tallennuksessa ja pitkäaikaissäilytyksessä (PAS) mukaan lukien metatietopalvelut ja aineistojen avaamisen ja hyödyntämisen palvelut.\n
Avoimuuden linjaukset:\n
Perustavoite\n
Tutkimusdata ja -julkaisut ovat avoimesti saatavilla ja hyödynnettävissä tietoverkoissa avoimen rajapinnan
kautta seuraavin tarkennuksin:\n
Tarkennukset\n
A. Suomalaisen tutkimusjärjestelmän kaikki toimijat jakavat tuottamansa tieteelliset julkaisut ja tutkimusdatan avoimesti tietoverkossa. Avoimuusperiaate koskee myös tutkimusmenetelmiä ja tutkimustulosten tuottamiseen tarvittavia työkaluja, kuten tietokonemalleja.\n
B. Avoimuus toteutetaan tutkimuseettisiä periaatteita noudattaen ja oikeudellista toimintaympäristöä kunnioittaen. Tutkimusdata avoimuuteen pyritään aina, kun se on lainsäädännön ja sopimusten puolesta mahdollista. Tekijänoikeuslainsäädäntöä uudistetaan tutkimuspoikkeuksen suuntaan tämän varmistamiseksi.\n
C. Tutkimusdatan ja -julkaisujen jatkokäyttöä ei rajoiteta tarpeettomasti ja niiden käyttöehdot tuodaan selkeästi esille. Noudatetaan yleisiä, standardimuotoisia lisenssejä (suositus CC BY 4.0. ), jotka ovat koneluettavia. Metatiedot julkaistaan CC0 –lisenssillä.\n
D. Tutkimusta koskevat sopimukset ja rahoituspäätökset tukevat julkaisujen ja tutkimusdatan avointa saatavuutta.\n
E. Tutkijalla on mahdollisuus avoimeen julkaisemiseen tieteenalasta tai rahoitustilanteesta riippumatta.\n
F. Tutkimusorganisaation ja tutkijoiden on huolehdittava siitä, että tutkimusjulkaisu tulee avoimesti saataville. Valinta kultaisen ja vihreän OA:n välillä on tapauskohtaista ja riippuu siitä, missä tulokset julkaistaan. Primaarisen julkaisukanavan valinnan tärkein kriteeri on varmistaa tutkimuksen mahdollisimman suuri vaikuttavuus. Koska OA:n tiedetään omalta osaltaan lisäävän vaikuttavuutta, tulee ei-avointa julkaisukanavaa käytettäessä huolehtia rinnakkaisesta saatavuudesta avointen julkaisuarkistojen välityksellä. Tutkijoita tuetaan avoimuuden varmistamisessa siten, että saatavuuden edistämiseen liittyvät prosessit ovat yksinkertaisia ja saatavuutta tukevat palvelut helppokäyttöisiä.\n
G. Tutkimusjulkaisujen sisällöt ja niiden metatiedot ovat tietoverkossa avoimesti saatavilla välittömästi tai mahdollisimman pian niiden ilmestyttyä. EU:n komissio suosittaa avoimuutta viimeistään kuusi kuukautta tai 12 kuukautta (humanistiset ja yhteiskuntatieteet) julkaisun ilmestymisen jälkeen. (Commission recommendation of 17.7.2012 on access to and preservation of scientific information (http://ec.europa.eu/research/sciencesociety/document_library/pdf_06/recommendation-access-andpreservation-scientific-information_en.pdf.)\n
H. Tutkimusdatan ja -julkaisujen tallentamisessa ja levityksessä hyödynnetään sellaisia infrastruktuureja, jotka mahdollistavat aineistojen pitkäaikaissäilytyksen ja avoimen saatavuuden.\n
I. Tutkimusdata, tutkimusmenetelmät, tutkimusinfrastruktuurit ja -julkaisut kuvaillaan ja dokumentoidaan riittävällä tarkkuudella ja nämä tiedot ovat avoimesti verkossa saatavissa koneluettavassa muodossa.\n
Palveluperiaatteet:\n
Palveluperiaatteet ovat suosituksia avointa tiedettä ja tutkimusta tukeville
palveluille. Periaatteiden toteutuksessa huomioidaan palvelukohtaiset
erityispiirteet. Periaatteita käytetään ATT-palveluiden kehittämiseen. Periaatteiden
lisäksi huomioidaan OKM:n toimialan kokonaisarkkitehtuurinmukaisuus.\n
1.  Palvelut tukevat tutkimusta sekä tutkimusprosessin avoimuutta. Palveluissa
huomioidaan tutkimuksen ja sen tuottaman tiedon koko elinkaari.\n
2. Palveluilla tuetaan parhaita avoimen tieteen käytäntöjä. Palveluilla
edistetään yhteentoimivuutta sekä tutkimustuotosten avoimuutta ja
jatkokäyttöä. Tämän tulee toteutua myös silloin, kun kaikkia
tutkimustuotoksia ei voida avata vapaasti käytettäviksi.\n
3. Palvelut ovat mahdollisimman avoimesti suomalaisen tutkimusyhteisön
käytettävissä. Palvelut voidaan rahoittaa käyttäjämaksuin. Tällöin
hinnaston tulee olla avoimesti saatavilla.\n
4. Palvelut ovat jatkuvia. Palveluntarjoajan on laadittava palvelulle
jatkuvuussuunnitelmat. Mikäli vastoin odotuksia palvelu aiotaan sulkea,
palveluntarjoajan on avustettava korvaavan palvelun löytämisessä
edistääkseen tietojen säilyvyyttä.\n
5. Palveluiden teknologiavalinnat ja tietoturva ovat
tarkoituksenmukaiset. Yleisperiaatteena palveluiden teknologiavalinnoissa
on yhteentoimivuuden edistäminen. Palveluille luodaan mahdollisuuksien
mukaan avoimet rajapinnat ja näille julkinen rajapintadokumentaatio.\n
6. Palveluita kehitetään jatkuvasti ja käyttäjälähtöisesti sekä hyödyntäen
mahdollisuuksien mukaan avoimen lähdekoodin ratkaisuja.\n
7. Palveluiden käyttöehdot edistävät avoimuutta. Palveluihin liittyvät ja niihin
kertyvät kuvailutiedot luovutetaan mahdollisimman avoimesti.
Palvelukehityksen tulokset on lähtökohtaisesti lisensoitu avoimesti.\n
8. Palveluille määritellään laadulliset ja määrälliset mittarit, joiden avulla
palveluiden käyttöä ja käytettävyyttä voidaan seurata ja kehittää.\n
9. Palveluiden palvelulupaukset, vastuutahot ja palveludokumentaatio ovat
saatavilla. Palveluntarjoajan tulee huolehtia tarvittavan tukipalvelun
tuottamisesta.', 'The national infrastructure – the Open science and research iniatiative (ATT) and KDK-PAS (The National Digital Library’s digital preservation system) – form a national research infrastructure. Most of the services provided by ATT are in operation, and the preservation services are in a piloting phase. KDK-PAS is currently in operation. The infrastructure is based on the ATT and National Digital Library (KDK) initiatives by the Ministry of Education, Science and Culture. These collaborative initiativess are creating a permanent, coordinated data infrastructure for supporting and managing research data within the Finnish research community across all disciplines. This  infrastructure covers services for the dissemination, storage and long-term preservation of digital data (known by the Finnish acronym PAS), including metadata management and catalogue and open data access platforms and tools.', 'http://avaa.tdata.fi/documents/10197/76259/avoin-tiede-ja-tutkimus-logo.png/76641baa-9c49-4cce-9c73-681324f49fe1', NULL, '2016-07-25');  -- kaksi yhteennivottua hanketta/lyhennettä: antaa olla, infran oma asia päättää nimestään

INSERT INTO infra.infra VALUES(8,NULL,0,2010,2016,2018,NULL,'EISCAT_3D Suomi ja ISR-tutkajärjestelmä',NULL,'EISCAT_3D Suomi','EISCAT_3D Finland',NULL, 'EISCAT ja EISCAT_3D -sirontatutkat mittaavat geoavaruusympäristön kytkeytymistä Maan ilmakehään revontulivyöhykkeellä ja polaarivorteksin reunalla. Huippuvuorille, Norjaan, Ruotsiin ja Suomeen sijoitetulla laitteistolla tutkitaan avaruus- ja plasmafysiikkaa, luonnollista ja ihmisen aiheuttamaa ilmakehän muutosta sekä avaruussään vaikutusta navigaatioon, kommunikaatioon ja teknologisiin järjestelmiin arktisella alueella. Tutkia voidaan käyttää myös avaruusromun, satelliittien rataparametrien, kuun pinnan ja asteroidien muodon kartoitukseen sekä uusien tutkamodulaatioiden ja analyysin kehittämiseen.', 'The EISCAT and EISCAT_3D incoherent scatter radars measure the coupling between the space environment and atmosphere in the auroral oval and at the southern edge of the polar vortex. Located in Svalbard, Norway, Sweden and Finland, this facility is used for research INTO infra.space and plasma physics, atmospheric change due to human activities and natural causes, and the effect of space weather on navigation, communications and technological systems in the Arctic region. The radar can also be used to investigate space debris and the orbital elements of satellites, to map the lunar surface and the shape of asteroids, and to develop new radar modulations and analysis.', NULL, NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(9,NULL,0,2008,2015,2019,2060,'Euroopan geotieteiden infrastruktuuri','Finnish national initiative of the European Plate Observing System','FIN-EPOS','FIN-EPOS',NULL, 'EPOS on hajautettu eurooppalainen geotieteellinen tutkimusinfrastruktuuri, joka muodostuu kansallisista mittausasemista, dataverkoista, kansainvälisistä tietokeskuksista ja tietovarastoja sekä toimintaa koordinoivasta italialaisesta päämajasta. Havaintoasemien hajautetun verkoston tavoitteena on kerätä tietoa ja ymmärrystä Euroopan mannerlaatan liikkeistä ja käynnissä olevista geologis-geofysikaalisista prosesseista sekä niihin liittyvistä luonnonkatastrofeista ja muista sosioekonomisista vaikutuksista.\n
Suomen kansallinen FIN-EPOS-konsortio on suomalaisten yliopistojen (HY, OY) ja tutkimuslaitosten (GTK, MML, IL, VTT, CSC) yhteisö, joka ylläpitää kiinteän maan observatorioita ja laboratorioita. Havaintoaineisto toimitetaan kansainvälisiin tietokeskuksiin ja edelleen EPOS-tietokeskukseen. FIN-EPOS-portaalin ja verkkosivujen kautta suomalaiset tutkijat, opiskelijat, viranomaiset ja kansalaiset voivat hakeutua EPOS-sivustoille, josta he saavat käyttöönsä laajoja monitieteellisiä tutkimusaineistoja. EPOS-aineistot ovat pääsääntöisesti kaikille avoimia ja maksuttomia. FIN-EPOS ensimmäinen tavoite on muokata kansalliset aineistot EPOS-yhteensopiviksi  sekä kehittää yhdessä CSC:n ja EUDAT-hankkeen kanssa suomenkieliset kirjautumissivustot, jossa käyttäjät tunnistetaan ja heidän EPOS-aineistojen käyttöoikeutensa määritellään.', 'EPOS is a distributed geosciences research infrastructure, formed from national measuring stations, data networks, international data centres and European headquarters engaged in the coordination of various activities. The aim of these distributed observatories is to gather information on and develop our understanding of tectonic movement and geological-geophysical processes in Europe, as well as the related natural catastrophes and other socio-economic effects. Nine partners are involved in Finland''s EPOS activities. The main objective of the FIN-EPOS research infrastructure is standardize and harmonize the Finnish national data set so that they will be interoperable with the EPOS Thematic Core Services/ Thematic data centers. The second objective is develop a Finnish-language login page on which users are identified and their user rights for EPOS resources are defined.', 'http://avaa.tdata.fi/documents/10197/76259/EPOS_logo_small_591.jpg/b80e6349-3119-43ae-9b11-49949759dabb', NULL, '2016-07-25');  -- comment

-- INSERT INTO infra.infra VALUES(34,NULL,0,NULL,NULL,2014,NULL,'Suomen merentutkimuksen infrastruktuuri','Finnish Marine Research Infrastructure',NULL,'EURO-ARGO',NULL, KUVAUS, DESCRIPTION, NULL, NULL, '2016-07-25', '2016-07-25');  -- kts. FINMARI, toimintavaihe: 2015-FINMARI, 2016-EMBRC, 2014-EURO-ARGO, testataan viitteitä edeltäviin infroihin
INSERT INTO infra.infra VALUES(10,NULL,1,NULL,NULL,2015,NULL,'Suomen merentutkimuksen infrastruktuuri','Finnish Marine Research Infrastructure',NULL,'FINMARI',NULL, 'Suomen merentutkimuksen infrastruktuuri FINMARI kokoaa kansallisen merentutkimuksen infrastruktuurin yhtenäiseksi kokonaisuudeksi. Tähän kuuluvat suomalaiset tutkimusalukset ja automaattiset havaintoalustat sekä yliopistojen ja tutkimuslaitosten kokeelliset laboratoriot ja kenttäasemat. FINMARI vastaa uusiin tieteellisiin ja yhteiskunnallisiin haasteisiin luomalla yhteisen tutkimuksellisen viitekehyksen merentutkimukselle ja siihen liittyvälle infrastruktuurille sekä täsmentämällä keskeisten kansallisten toimijoiden synergisiä rooleja tutkimusinfrastruktuurin kehittämisessä. FINMARI-tutkimusinfrastruktuuri on kansallisesti ja kansainvälisesti avoin suomalaisen merentutkimuksen ja tutkijakoulutuksen perusta, ja se kattaa kaikki keskeiset tieteenalat: biologian, geologian, kalantutkimuksen, ekologian, merikemian ja -fysiikan, maantieteen, kaukokartoituksen sekä niiden monitieteisen soveltamisen meriympäristön seurannan ja suojelun kehittämiseksi.', 'The Finnish Marine Research Infrastructure FINMARI combines the national marine research infrastructure INTO infra.a unified whole. This includes Finnish research vessels and automated offshore observation platforms, as well as universities, and experimental laboratories and field stations run by research institutes. FINMARI meets the latest scientific and social challenges by creating a common research framework for marine research and the related infrastructure, as well as specifying the synergetic roles of key national actors in the development of the research infrastructure. The FINMARI research infrastructure is a nationally and internationally open platform for Finnish marine research and researcher training. As such, it covers all of the key disciplines: biology, geology, fishery research, ecology, marine chemistry and physics, geography, remote sensing and their multidisciplinary application in developing the monitoring and protection of the marine environment.', NULL, NULL, '2016-07-25');  -- toimintavaihe: 2015-FINMARI, 2016-EMBRC, 2014-EURO-ARGO, testataan viitteitä edeltäviin infroihin
-- INSERT INTO infra.infra VALUES(35,NULL,0,NULL,NULL,2016,NULL,'Suomen merentutkimuksen infrastruktuuri','Finnish Marine Research Infrastructure',NULL,'EMBRC',10, KUVAUS, DESCRIPTION, NULL, NULL, '2016-07-25');  -- kts. FINMARI, toimintavaihe: 2015-FINMARI, 2016-EMBRC, 2014-EURO-ARGO, testataan viitteitä edeltäviin infroihin

INSERT INTO infra.infra VALUES(11,NULL,1,2008,2012,2015,NULL,'Integroitu kasvihuonekaasujen havainnointijärjestelmä','Integrated Carbon Observation System','ICOS Suomi','ICOS Finland',NULL, 'ICOS on hajautettu eurooppalainen tutkimusinfrastruktuuri, joka muodostuu kansallisista mittausasemista ja toimintaa koordinoivasta eurooppalaisesta päämajasta. Hajautettu mittausasemaverkosto käsittää yli 100 ilmakehä-, ekosysteemi- ja merihavaintoasemaa ympäri Eurooppaa. ICOS Suomen yli 10 mittausaseman ansiosta pohjoiset alueet ovat hyvin edustettuina ICOS-verkostossa. Mittausasemilla mitataan sekä ilmakehän kasvihuonekaasujen, hiilidioksidin, metaanin ja ilokaasun pitoisuuksia että ekosysteemien hiilen ja typen kiertoa ja vaihtoa ilmakehän kanssa. ICOS tuottaa pitkäaikaista, yhdenmukaista ja tarkkaa kasvihuonekaasujen havaintosarjaa tutkimuksen, päästöjen hillinnän ja seurannan tarpeisiin. Asemat jakautuvat kolmeen luokkaan: 1. ja 2. luokan sekä avustavat asemat. Kaikkien asemien data on laatuvalvottua hyvin tarkoin kriteerein. 1. luokan asemat mittaavat kaikkein eniten muuttujia. Data ja karttapalvelut ovat ilmaiseksi kaikkien käytettävissä nettipalvelussamme Carbon Portalissa.', 'ICOS is a distributed European research infrastructure consisting of national measurement stations and a European top-level organisation coordinating its activities. This distributed network of measurement stations includes more than 100 atmospheric, ecosystem and marine observatories around Europe. The measurement stations measure levels of atmospheric greenhouse gases, carbon dioxide, methane and nitrous oxide, as well as the carbon and nitrogen cycle within ecosystems and ocean-atmosphere coupling. ICOS-Finland’s national operations include the maintenance of the Finnish station network and greenhouse gas measurements. Finland’s observatory network includes boreal and sub-arctic measurement stations. ICOS provides long-term, harmonized and precise greenhouse gas data for science and monitoring of GHG emissions. The stations are divided INTO infra.three classes, Class 1, Class 2, and Associate sites. The data from all these stations are quality-controlled with the same very strict criteria. Class I stations measure the most parameters. Data and map services are distributed freely from our web service Carbon Portal.', 'http://avaa.tdata.fi/documents/10197/76259/Icos_Logo_RGB_Regular_2_0.png/ab9cbd5b-5176-409e-ac11-9f3637493cb2', NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(12,NULL,1,1995,1995,1996,2050,'Ilmakehä- ja ympäristötutkimuksen tutkimusinfrastruktuuri','Integrated atmoshperic and earth system science research infrastructure','INAR RI','INAR RI',NULL, 'Ilmakehä- ja ympäristötutkimuksen tutkimusinfrastruktuuri INAR RI (Integrated Atmospheric and Earth System Science Research Infrastructure) tuottaa monitieteistä ja yksityiskohtaista tietoa aineiden ja energian kierrosta ekosysteemeissä ja ilmakehässä. INAR-tutkimusinfrastruktuurissa tarkastellaan erityisesti ilmastonmuutoksen biologisia ja fysikaalisia perusteita ja ekosysteemien ja ilmakehän vuorovaikutuksia. Tuotettuja aineistoja käytetään boreaalisten ekosysteemien ja ilmakehän prosessien ja niiden takaisinkytkentöjen tarkasteluun, menetelmien ja mittalaitteiden kehittelyyn sekä ilmastomallinnukseen. INAR-tutkimusinfrastruktuuriin kuuluu joukko hyvin varusteltuja jatkuvatoimisia mittausasemia eri puolilla Suomea, kokeellisia ilmakehä- ja ekologisia laboratorioita sekä erilaisia mallinnusalustoja ja laajoja tutkimusaineistoja ja –portaaleja. INAR RI linkittyy myös ICOS (Integrated Carbon Observation System) ja ACTRIS (Aerosols, Clouds and Trace gases Research InfraStructure) tutkimusinfrastruktuureihin.', 'The Integrated Atmospheric and Earth System Science Research Infrastructure (INAR RI) produces multidisciplinary, detailed data on material and energy flows within ecosystems and the atmosphere. Within INAR RI, special attention is paid to study ecosystem-atmosphere interactions, a key element being aerosols. The data generated are used to investigate ecosystem and atmospheric processes and their feedback mechanisms, the development of methodologies and measurement instrumentation, and climate modelling. INAR RI includes a number of well-equipped, continuously functioning field measurement stations around Finland, and experimental atmosphere and ecological laboratories. The distribution and access to the unique datasets is provided via a tailored database and data portal. INAR RI is linked to ICOS (Integrated Carbon Observation System) and ACTRIS (Aerosols, Clouds and Trace gases Research InfraStructure) research infrastructures.', 'http://avaa.tdata.fi/documents/10197/76259/VIRALLINEN_INAR.png/62d08cac-784b-4cc7-b8f0-a40379aec871', NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(13,NULL,0,2013,2016,2016,NULL,'Avoin paikkatiedon tutkimusinfrastruktuuri','Open Geospatial Information Infrastructure for Research','oGIIR','oGIIR',NULL, 'Avoimen paikkatiedon tutkimusinfrastruktuurin oGIIRin tavoitteena on luoda käyttäjän tarpeiden mukainen ja avoin rakenne tukemaan Suomen tiedeyhteisöä kaikilla tieteenaloilla paikkatiedon tieto- ja analysointipalveluilla sekä näihin liittyvillä tukipalveluilla. Kehitäminen sisältää seuraavat osatavoitteet:\n
1. Avoimien paikkatiedon tietopalveluiden kehittäminen, sisältäen ydinpaikkatietojen laadun ja käyttöarvon parantaminen tieteellistä tutkimusta varten.\n
2. Paikkatiedon laskenta ja analyysipalveluiden kehittäminen.\n
3. Tukipalveluiden kehittäminen niin, että suomalaiset tutkijat ottavat kehitetyt paikkatietopalvelut tehokkaaseen käyttöön. Tutkimusinfrastruktuuri luodaan yliopistojen, tutkimuslaitosten ja CSC:n yhteisenä hankkeena. Tutkimusinfrastruktuuri tulee olemaan vahva yhteistyö- ja tietämysverkosto, joka tuottaa huippuluokkaista paikkatietoja hyödyntävää tutkimusta.', 'The main objective of the oGIIR infrastructure is to establish user oriented and open-access structure to support the entire Finnish scientific research community with spatial data and analysis services and facilitating their research use in all disciplines. The development consists of the following sub-objectives:\n
1. Development of open-access geospatial data services including the quality improvement of  core geospatial data sets and their use value in scientific research.\n
2. Establishment of geocomputation and geospatial analysis services.\n
3. Creating facilitation mechanisms, which lead INTO infra.effective use of the established geospatial services by Finnish researchers. The research infrastructure will be developed as a joint effort by the universities, research institutes and CSC. It will be a strong cooperation and knowledge based network which produces top-quality scientific research with geospatial information.', NULL, NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(14,NULL,1,2008,2011,2014,NULL,'Biopankki-infrastruktuuri','Biobanking and biomolecular resources research infrastructure','BBMRI.fi','BBMRI.fi',NULL, 'Biopankkitoiminnalla tarkoitetaan ihmisistä peräisin olevien ammattimaista ja yhdenmukaista keräämistä, säilyttämistä ja luovuttamista lääketieteellisen tutkimuksen käyttöön. Biopankkitoiminnan päämääränä on kehittää lääketieteellistä tutkimusta, edistää terveyttä ja hoitokäytäntöjä sekä tuottaa uusia terveysalan innovaatioita. BBMRI.fi on eurooppalaisen BBMRI-ERICin suomalaisten biopankkien muodostama katto-organisaatio Suomessa. BBMRI.fi -biopankki-infrastruktuuri valittiin Suomen Akatemian tiekartalle vuonna 2014. BBMRI.fi:n tavoitteena on luoda kansainvälisesti johtava biopankki-infrastruktuuri, joka tarjoaa strategista tukea biolääketieteelliseen tutkimukseen, terveydenhuoltoon sekä sairaanhoidon lääke- ja tuotekehitykseen.', 'Biobanks are considered to be essential facilitators of top-level research and health related innovations resulting new strategies for medical practice and public health, including new tools for diagnostics, treatment and intervention. BBMRI.fi is a National Node of BBMRI-ERIC operating with collaboration between the national biobanks, and was nominated to the Academy of Finland 2014 infrastructure roadmap.  BBMRI.fi organizes an interface with national Network of Biobanks and Biological resources and coordinates their activities with those of BBMRI-ERIC. Overall, BBMRI.fi aims to create an internationally leading biobank infrastructure providing strategic support to biomedical research, healthcare and biomedical industry.', 'http://avaa.tdata.fi/documents/10197/76259/bbmri_logo.png/8a44ca20-d178-4b9f-8727-06c2577df8d0', NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(15,NULL,1,2006,2007,2007,NULL,'Biokeskus Suomi','Biocenter Finland','BF','BF',NULL, 'Biokeskus Suomi on verkostomallinen kansallinen tutkimuksen infrastruktuuri. Biokeskus Suomen muodostavat kuuden isäntäyliopiston seitsemän biokeskusta, jotka ovat yhdistäneet voimavaransa biotieteen teknologiapalveluiden tuottamiseksi koordinoidusti kansallisella tasolla seuraavilla alueilla: bioinformatiikka, biologinen kuvantaminen, genominlaajuiset menetelmät, malliorganismit, proteomiikka ja metabolomiikka, kantasolut ja biomateriaalit, rakennebiologia, translationaalisen tutkimuksen teknologiat sekä virusperäiset geeninsiirrot ja soluhoidot.', 'Biocenter Finland (BF) is a distributed national research infrastructure. BF comprises seven biocenters based at six host universities. These biocenters have combined and coordinated their resources and efforts, in order to provide life sciences technology services at national level in the following areas: bioinformatics; biological imaging; genome-wide methods; model organisms; proteomics and metabolomics; stem cells and biomaterials; structural biology; translational research technologies; and viral gene transfer and cell therapy.', NULL, NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(16,NULL,1,NULL,NULL,NULL,NULL,'Euroopan translationaalinen tutkimuksen infrastruktuuri','European infrastructure for translational medicine','EATRIS (Suomi)','EATRIS (Finland)',NULL, 'Kansainvälinen EATRIS-tutkimusinfrastruktuuri yhdistää eurooppalaiset translationaalisen lääketieteen toimijat verkostoksi, joka tarjoaa tutkijoiden käyttöön viimeisintä teknologiaa edustavan infrastruktuurin tutkimustulosten viemiseksi kohti terveydenhuollon sovelluksia. Samalla EATRIS tarjoaa asiantuntijapalveluita sekä tehostaa tutkijoiden ja lääkäreiden välistä kommunikaatiota. EATRIS-toiminta jakautuu viiteen kokonaisuuteen, joista Suomi osallistuu kolmeen. Suomen erityisosaamista ovat biomarkkerit, solu- ja geeniterapiat sekä radioaktiiviset merkkiaineet ja kuvantaminen.', 'This European research infrastructure assists researchers and organisations, by expediting expensive and difficult translational medicine processes. As an international organisation, the EATRIS research infrastructure combines European actors in translational medicine INTO infra.a network which makes its research outcomes, representing the latest technology, available to researchers, who then transform those outcomes INTO infra.healthcare applications. EATRIS also provides expert services and enhances communication between researchers and physicians. National coordination of EATRIS is the responsibility of the Institute for Molecular Medicine Finland within the University of Helsinki, which is also in charge of the Biomarker network.', NULL, NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(17,NULL,1,2010,2014,2016,NULL,'Euroopan luonnontieteiden infrastruktuuri biologiselle tieteelle','European distributed infrastructure for life-science information','ELIXIR (Suomi)','ELIXIR (Finland)',NULL, 'ELIXIR on Euroopan hajautettu ja koordinoitu bioinformatiikan tutkimusinfrastruktuuri. Se kerää, ylläpitää, yhdistää ja jakaa biotieteen tutkimuksen tuottaman tiedon liittyen niin geenien ja proteiinien kuin populaatioiden rakenteisiin ja toimintaan. ELIXIR:in ydin ovat arvokkaat tietoaineistot, niiden yhdistely ja aineistojen käyttö tutkimuksen ja bioteknologian innovaatiotoiminnassa ja edistämisessä. Suomi on ELIXIR jäsen (Valtiosopimus 7/2015, Finlex). CSC:llä sijaitseva ELIXIR Suomen keskus on erikoistunut kehittämään, hallinnoimaan ja tarjoamaan pilvipalveluresursseja biotieteellisten organisaatioiden, terveys- ja hyvinvointidatan ja biopankkien datan käyttöönotolle ja sovelluksille ja tarjoamaan bioinformatiikan työkalujen koulutusta. Noodin palvelut ovat tuotannossa ja niitä käytetään aktiivisesti eurooppalaisessa ja kansallisessa yhteistyössä molekyylilääketieteen instituutin, THL:n ja Biokeskus Suomen kanssa.', 'The goal of ELIXIR is to orchestrate the collection, quality control and archiving of large amounts of biological data produced by life science experiments. Some of these datasets are highly specialised and would previously only have been available to researchers within the country in which they were generated.\n
For the first time, ELIXIR is creating an infrastructure – a kind of highway system – that integrates research data from all corners of Europe and ensures a seamless service provision that is easily accessible to all. In this way, open access to these rapidly expanding and critical datasets will facilitate discoveries that benefit humankind.\n
Science and technology change very quickly, and exploiting these advances can be a challenge. ELIXIR partners are building an intelligent, responsive and sustainable system that will deliver the fruits of these advances to the scientists upon whom so many hopes are pinned, and whose curiosity is the very cornerstone of progress.\n
Finland is an ELIXIR member (State agreement 2015/7, Finlex) and CSC hosts the ELIXIR Finland node. National collaboration between CSC and Finnish stakeholders is covered by the Biomedinfra consortium agreement between ELIXIR, BBMRI and EATRIS and the ELIXIR Finland’s membership in the Biocenter Finland bioinformatics network consisting of all major biocenters in Finland. ELIXIR Finland, hosted at CSC, specializes in the European collaboration, provides services in cloud infrastructure, authentication and authorization targeted for biomedical organizations, and resources for training. Node services are currently in production, and actively used in European infrastructure collaborations as well as by the Biomedinfra consortium organisations FIMM and THL (e.g. BBMRI.fi), and Biocenter Finland infrastructure.', 'http://avaa.tdata.fi/documents/10197/76259/header_elixir_logo_fi.png/9491601a-1243-41a0-9e73-1dfdb71affb4', NULL, '2016-07-25');  -- ELIXIR

INSERT INTO infra.infra VALUES(18,NULL,0,2010,2013,2017,NULL,NULL,'European Research Infrastructure for Biomedical Imaging (Euro-BioImaging)','EuBI (Suomi)','EuBI (Finland)',NULL, 'EuBI on eurooppalainen biologisen, molekylaarisen ja lääketieteen kuvantamisteknologioiden tutkimusinfrastruktuuri. Sen tehtävänä on koordinoida biolääketieteellistä kuvantamista Euroopassa, jotta Euroopan johtava asema ja kilpailukyky globaalissa tutkimusympäristössä säilyvät. EuBI:n tärkeä tehtävä on myös luoda koko Euroopan kattava kuvantamisyksiköiden verkosto, jossa erilaiset kuvantamisteknologiat ovat avoimesti kaikkien eurooppalaisten tutkijoiden käytettävissä. EuBI:n kuvantamislaitokset tarjoavat täydellisen valikoiman avoimeen saatavuuteen perustuvia huipputason kuvantamisen tekniikoita, koulutusta ja jatkuvaa teknologiakehitystä. Suomessa EuBI on jakautunut kolmeen teknologia-alaan, jotka ovat nykyaikainen valomikroskopian huipputeknologiat, melokylaarisen kuvantamisen teknologiat ja lääketieteellisen kuvantamisen teknologiat. EuBI:n teknologia-alat tukevat ja mahdollistavat sekä monipuolisen perustutkimuksen että prekliinisen ja kokeellisen kliinisen tutkimuksen sovelluksia molekyylien, solujen, solurakenteiden, koe-eläinten ja ihmisten kuvantamiseksi ja analysoimiseksi. Suomen ensimmäinen EuBI Node on valomikroskopia huipputeknologian Node, joka aloittaa toimintansa vuodesta 2016 alkaen. Suomen EuBI-noden erikoisvalttina on palveluiden tarjoaminen kokonaisina kolmiulotteisina paketteina, joihin sisältyy sekä kuvantaminen kolmiulotteisesti erilaisilla tekniikoilla, että tulosten kvantitatiivinen analysointi. Tällaiset palvelut ovat toistaiseksi harvinaisia Euroopassa.', 'EuBI is a pan-European biological and medical imaging technology research infrastructure. It is tasked with coordinating the use of biomedical imaging in Europe, with the aim of maintaining Europe''s leading position and competitiveness within the global research environment. EuBI''s imaging facilities will provide a full selection of high-end imaging technology, training and continuous technology development based on open access. The strong imaging networks of Biocenter Finland and the Finnish Bioimaging Network (FiBI) form the basis of Finland EuBI. EuBI-Finland is divided INTO infra.three technology sectors: modern high-end microscope technologies, multimodal imaging technologies and medical imaging technologies. Advanced Light Microscopy Node (ALM Node) will be the first Finnish EuBI Node and it will start its Interim operation in 2016. Finnish node will offer all its services as full three-dimensional (3D) packages that cover also the production of quantitative analysis and processing results. These are aspects not widely covered by other EuBI nodes in other countries.', 'http://avaa.tdata.fi/documents/10197/76259/euro-bioimaging_logo_corrected_150312.jpg/a258b3b3-df28-4b30-8cda-28f4e15de348', NULL, '2016-07-25');  -- EuBI

INSERT INTO infra.infra VALUES(19,NULL,0,2010,2015,2016,NULL,NULL,'European Infrastructure of Open Screening Platforms for Chemical Biology','EU-OPENSCREEN (Suomi)','EU-OPENSCREEN (Finland)',NULL, 'EU-OPENSCREEN, Euroopan strateginen tutkimusinfrastruktuurialoite, tarjoaa tutkijoille avoimen huipputason infrastruktuurin, teknologian ja erityisosaamisen, uusien bioaktiivisten pienimolekyylisten yhdisteiden kehitystä varten. Huipputason tutkimusinfrastruktuurin ja teknologioiden lisäksi EUOPENSCREEN tarjoaa käyttäjilleen ainutlaatuisen, jaetun 200 000 yhdisteen molekyylikirjaston ja siihen liittyvän tietokannan. EU-OPENSREENIN avulla saadut tulokset julkaistaan kaikkien tutkijoiden käytettäviksi ja löydetyt bioaktiiviset ”työkaluyhdisteet”, tool compoundit, toimivat lähtökohtina esimerkiksi lääkkeiden tai muiden yhteiskunnallisesti ja kaupallisesti merkittävien bioaktiivisten aineiden kehityksessä.  Suomen kansallisena koordinoivana organisaationa on Helsingin yliopiston alaisuudessa toimiva Suomen molekyylilääketieteen instituutti FIMM, joka tulee olemaan toimintavaiheen aikana yksi EU-OPENSCREEN:in kahdeksasta keskuksesta. EU-OPENSCREEN tuo Suomalaisten tutkijoiden ulottuville ainutlaatuisen kemikaalikirjaston ja pääsyn käyttämään tekniikoita joita ei tällä hetkellä ole Suomessa tarjolla. Tämä mahdollistaa myös uusien yhteistyöhankkeiden syntymistä, tuomalla Eurooppalaisia huippuluokan projekteja Suomeen.', 'EU-OPENSCREEN is an ESFRI initiative bringing together the top European chemical compound screening sites to establish a distributed and complementary European infrastructure for chemical screening and chemical tool development. In addition, EU-OPENSCREEN will construct a unique, shared European compound collection and generate an open-access chemical bioactivity database allowing the scientific community to fully explore information generated for maximal impact of research investments. The essential added value of EU-OPENSCREEN is that novel tool compounds will be developed cost-effectively, and the tools will be made publicly available to the scientific community, benefiting both biological/chemical research and the strategic development of novel commercially valuable bioactive small molecules. Active Finnish participation in EU-OPENSCREEN will bring domestic scientists outstanding opportunities for high quality research breakthroughs, innovation, access to the unique European chemical library and technologies and services not currently available in Finland, as well as collaboration opportunities through influx of top-quality European scientific projects.', 'http://avaa.tdata.fi/documents/10197/76259/logo_openscreen.jpg/8a295ea3-f1b2-4d33-abdd-0db0725270b3', NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(20,NULL,1,2008,2010,2013,NULL,'Euroopan hiirimallien analysoinnin, säilyttämisen ja jakelun tutkimusinfrastruktuuri','INFRAFRONTIER Research Infrastructure','INFRAFRONTIER (Suomi)','INFRAFRONTIER (Finland)',NULL, 'INFRAFRONTIER tarjoaa ’hiiripankin’ (EMMA, European Mouse Mutant Archive), jossa hiirikannat säilytetään syväjäädytettyinä alkioina tai sukusoluina ja josta niitä toimitetaan tutkijoille, sekä ’hiiriklinikat’, joissa tehdään laajamittaisia ominaisuuksien perusanalyysejä. INFRAFRONTIER-hiiriklinikoita on Englannissa, Ranskassa ja Saksassa, ja uusia on rakenteilla Italiaan ja Tsekin tasavaltaan. EMMA-yksiköitä on eri puolilla Eurooppaa yhteensä 10. Kaikissa INFRAFRONTIER-yksiköissä noudatetaan samoja laatustandardeja ja koulutettu henkilökunta vastaa palveluista, mikä takaa eläinten hyvinvoinnin. Tiedot kootaan yhteiseen, avoimeen tietokantaan. INFRAFRONTIER tarjoaa myös alaan liittyvää koulutusta. Tarkoituksena on tehostaa hiirimallien käyttöä biolääketieteellisessä tutkimuksessa ja saattaa tieteellisesti arvokkaat mallit tutkijoiden käyttöön vaivattomasti ja kohtuullisin kustannuksin.\n
INFRAFRONTIER GmbH koordinoi Euroopan laajuista toimintaa. Suomessa toiminta keskittyy EMMA-palveluihin, joista vastaa Biocenter Oulun transgeenipalvelulaboratorio. Kansallisena isäntäorganisaationa on Oulun yliopisto, ja yhteistyökumppanina Biokeskus Suomen FinnMouse-teknologiaplatformi (Biocentrum Helsinki, Biocenter Kuopio, Turun tautimallinnuskeskus).', 'The INFRAFRONTIER Research Infrastructure provides access to first-class tools and data for biomedical research, and thereby contributes to improving the understanding of gene function in human health and disease using the mouse model.\n
The core services of INFRAFRONTIER comprise the systemic phenotyping of mouse mutants in the participating mouse clinics, and the archiving and distribution of mouse mutant lines by the European Mouse Mutant Archive (EMMA). In addition, INFRAFRONTIER provides specialized services such as the generation of germ-free mice (axenic service) and training in state of the art cryopreservation and phenotyping technologies.\n
The INFRAFRONTIER GmbH coordinates the transnational activities of the national partners that together form the European INFRAFRONTIER Research Infrastructure. In Finland, EMMA services are provided by the Biocenter Oulu Transgenic core facility at University of Oulu, whereas systemic phenotyping is available in facilities elsewhere in Europe. Biocenter Finland, particularly the partners of its FinnMouse technology platform – Biocentrum Helsinki, Biocenter Kuopio, and the Turku Center for Disease Modeling are involved in general INFRAFRONTIER activities.', 'http://avaa.tdata.fi/documents/10197/76259/infrafrontier_logo_slogan_4c_rgb.png/f582d7a6-ed19-4145-9241-8c633ea6ba0f', NULL, '2016-07-25');  -- INFRAFRONTIER

INSERT INTO infra.infra VALUES(21,NULL,1,2007,2008,2011,NULL,'Integroidun rakennebiologian tutkimusinfrastruktuuri','Integrated Structural Biology Research Infrastructure','Instruct','Instruct',NULL, 'Instruct on hajautettu tutkimusinfrastruktuuri, joka rakentuu jo olemassa olevista valituista eurooppalaisista tieteen huippuyksiköistä (Instruct-keskukset). Instruct-keskuksia johtavat tutkijat, jotka edustavat oman alansa parhaimmistoa. Instructia koordinoidaan Oxfordin yliopistosta käsin (Instruct Hub). Instruct on ESFRI (European Strategy Forum on Research Infrastructure)-tiekartalla oleva tutkimusinfrastruktuuri, jonka Euroopan komissio on luokitellut menestystarinaksi. Se mahdollistaa jäsenmaidensa tutkijoiden pääsyn käyttämään merkittäviä rakennebiologian tutkimuslaitteistoja ja tarjoaa laaja-alisesti erilaisia näytteiden valmistamistekniikoita. Se myös nopeuttaa integroidun rakennebiologian kehittymistä ja lisää molekulaarista ja atomitason tarkkuutta olevaa tietoa solutason tapahtumista. Instruct kehittää teknologioita ja menetelmiä sekä tarjoaa asiantuntijuutta ja osaamista monimutkaisten rakennebiologisten ongelmien selvittämiseen. Instruct on jo toiminnassa oleva kansainvälinen tutkimusinfrastruktuuri, jossa Helsingin yliopiston Virusten ja Makromolekyylikompleksien Tuotantokeskus ICVIR (Instruct Centre for Virus and Macromolecular Complex Production) on yksi toimivista Instruct-keskuksista. ICVIR-keskuksen koordinaatiosta vastaa Helsingin yliopisto. Instruct on parhaillaan siirtymässä pitkäaikaisen toiminnan mahdollistavaan ERIC (European Research Infrastructure Consortium) -lainsäädäntökehykseen.', 'Instruct is a distributed research infrastructure built around pre-selected scientific centres of excellence in Europe (Instruct Centres), and led by scientists of exceptional skill, and coordinated by the Instruct Hub at University of Oxford. Instruct is included on the ESFRI (European Strategy Forum on Research Infrastructure) roadmap as a success story by European Commission. It makes major structural biology research facilities available to all researchers belonging to Instruct member countries and provides a variety of different sample preparation techiques. It also expedites the development of integrated structural cell biology and increases the amount of molecular and atomic-level information available on cellular-level events. Instruct develops technologies and methodologies and provides expertise for scientific discoveries in the field of structural cell biology. Instruct already functions as an international research infrastructure, within which the ICVIR (Instruct Centre for Virus and Macromolecular Complex Production) at the University of Helsinki is one of the operational Instruct Centres. The University of Helsinki is responsible for the coordination of the ICVIR Centre in Finland. Instruct is currently moving to the long-term stability of ERIC (European Research Infrastructure Consortium) legal framework.', 'http://avaa.tdata.fi/documents/10197/76259/logo.png/85b1f5d7-541b-4740-9787-572bda0019c9', NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(22,NULL,0,2014,2016,2018,NULL,'Kansallinen kasvien fenotyyppaus -infrastruktuuri',NULL,'NaPPI',NULL,NULL, 'Kansallinen kasvien fenotyyppaus -infrastruktuuri NaPPI koostuu korkean läpivirtauksen kasvien fenotyyppausyksiköstä, kuvantamislaitteistoista, tiedonhallinnasta, kasvihuone- ja kasvatuskammiotiloista (Helsingin yliopisto) sekä spektrikuvantamislaboratoriosta (Itä-Suomen yliopisto). Toiminta keskittyy perus- ja translationaaliseen kasvitutkimukseen, kasvinjalostukseen ja -tuotantoon. Infrastruktuuri mahdollistaa muun muassa elävän kasvimateriaalin analysoimisen korkean läpivirtauksen menetelmällä, tiedonkeruun kasvien kasvusta, kehityksestä, biomassasta, bioenergiasta ja ympäristövasteista. NaPPI yhdistää genomiikan ja molekyylibiologian uusimmat saavutukset translationaaliseen kasvitutkimukseen.', 'NaPPI, a national plant phenotyping infrastructure, comprises a high-throughput plant phenotyping unit, imaging equipment, data management, greenhouse facilities and growth chambers (University of Helsinki) and a spectral imaging laboratory (University of Eastern Finland). It focuses on basic and translational plant research, plant breeding and plant production. Among other activities, the infrastructure enables the analysis of live plant material using high-throughput methods, data collection on plant growth, development, biomass, bioenergy and environmental responses. NaPPI combines the latest advances in plant genomics and molecular biology in translational research on plants.', NULL, NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(23,NULL,1,2000,2001,2003,NULL,'Kansallinen virusvektorilaboratorio','National Virus Vector Laboratory','NVVL','NVVL',NULL, 'Kansallinen virusvektorilaboratorio NVVL on kansainvälisesti tunnustettu tutkimuskeskus, joka muodostaa keskitetyn kansallisen tutkimusinfrastruktuurin. Virusvektorilaboratorio tuottaa korkealaatuisia geeninsiirtovektoreita prekliinisiin, toksikologisiin ja kliinisiin tutkimuksiin.', 'The National Virus Vector Laboratory (NVVL) is an internationally recognised research centre, which forms a national centralised research infrastructure. NVVL produces high-quality gene transfer vectors for preclinical, toxicological and clinical research.', NULL, 'http://avaa.tdata.fi/documents/10197/76259/infra_genetransfer1.jpg/3e54ffa3-fa01-494a-a50a-555a873ff11d', '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(24,NULL,0,NULL,2011,2016,2041,'MAX IV Laboratorio - Synkrotonisäteilylaitos','MAX IV Laboratory',NULL,'MAX IV',NULL, 'MAX IV on uuden sukupolven synkrotronisäteilylähde, joka rakennetaan Ruotsin Lundiin. Kansainvälisessä MAX IV -laboratoriossa tullaan tekemään laaja-alaista fysiikan, kemian, materiaali-, ympäristö-, bio- ja lääketieteen tutkimusta. Laboratorio korvaa nykyiset MAX-II ja MAX-III -laboratoriot uusilla ja innovatiivisilla ratkaisuilla laajentaen käytettävissä olevan säteilyspektrin ultraviolettialueelta aina suurtehoisiin röntgensäteisiin saakka. Toimintavaiheen alkaessa vuonna 2016 MAX IV tulee olemaan maailman kirkkain synkrotronisäteilylähde aina 30 keV säteilyenergiaan saakka. Yhteiseurooppalaisen ESRF-laboratorion rinnalla se tarjoaa uusia ainutlaatuisia mahdollisuuksia monitieteelliselle suomalaiselle tutkijakunnalle.', 'MAX IV is a new generation synchrotron radiation source under construction in Lund, Sweden. The international MAX IV laboratory will be the home of broadbased research in physics, chemistry, materials science, environmental sciences, bioscience and medicine. The laboratory will replace the current MAX-II and MAXIII laboratories in providing new and innovative solutions, extending the current use of the electromagnetic radiation spectrum from the ultraviolet spectrum to high-energy X-rays. When the operation phase begins in 2016, MAX IV will be the world’s brightest synchrotron radiation source, up to 30 keV energies. Alongside the joint European ESRF laboratory, the facility will provide new, unique possibilities for the multidisciplinary Finnish research community.', NULL, NULL, '2016-07-25');  -- rakennusvaihe: 2011-2020, toimintavaihe: 2016-2041 - jos on palveluita olemassa = tuotannossa, ei mallinneta päällekkäisyyksiä

INSERT INTO infra.infra VALUES(25,NULL,1,NULL,NULL,NULL,NULL,'Otaniemen mikro- ja nanoteknologioiden tutkimusinfrastruktuuri','Otaniemi Research Infrastructure for Micro and Nanotechnologies','OtaNano','OtaNano',NULL, 'Otaniemen mikro- ja nanoteknologian tutkimusinfrastruktuuri keskittyy kilpailukykyiseen nanotieteiden ja -teknologian ja kvanttitekniikoiden tutkimukseen. Tutkimusinfrastruktuuri tarjoaa laajan valikoiman mikro- ja nanorakenteiden valmistusprosesseja ja -laitteita. Siihen kuuluu kattava kuvantamis- ja karakterisointilaitteisto, mukaan lukien elektronimikroskopia-, nanomikroskopia- ja röntgensirontalaitteistot. Ultramatalan lämpötilan johtavuus- ja korkeataajuusmittaukset kuuluvat keskeisesti tutkimusinfrastruktuurin toimintaan. OtaNano on nuorten tutkijoiden korkeatasoinen oppimisympäristö ja toimii tieteellisen tutkimuksen kansainvälisenä keskuksena. Infrastruktuuri on Aalto yliopiston ja VTT:n yhteinen.', 'The Otaniemi micro- and nanotechnology research infrastructure focuses on competitive research in the nanosciences and technology, and in quantum techniques. This research infrastructure offers a wide selection of production processes and equipment for micro and nanostructures. Encompassed is a comprehensive range of imaging and characterisation equipment, including electron microscopy, nanomicroscopy and x-ray scattering apparatus. Key activities within the research infrastructure include ultra-low-temperature conductivity and high-frequency measurements. OtaNano is a top-level learning environment for young researchers, which functions as an international center for scientific research. OtaNano is a joint-infrastructure between Aalto University and VTT.', NULL, NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(26,'0000 0004 0590 2900',0,NULL,2009,2017,NULL,'Eurooppalainen röntgen-vapaaelektronilaser ja biologinen infrastruktuuri','X-ray free-electron laser (XFEL) Biological Infrastructure','XBI (Suomi)','XBI (Finland)',NULL, 'Eurooppalainen X-ray Free Electron Laser, XFEL, on 12 Euroopan maan yhteisyritys, jonka yhteyteen rakennetaan biologinen tutkimusinfrastruktuuri XFEL-based Integrated Biology Infrastructure, XBI. XFEL tuottaa ultralyhyitä röntgenpulsseja femtosekuntiaikarakenteella ja kirkkaudella, joka ylittää miljardikertaisesti nykyiset röntgenlähteet. Nämä ainutlaatuiset ominaisuudet tarjoavat täysin uusia mahdollisuuksia fysiikan, materiaalitieteiden, biotieteiden ja lääketieteen alojen käyttäjille niin tutkimuksen kuin teollisuudenkin parissa. XFEL tarjoaa instrumentit nanotason materiaalien kuvantamiseen, ultranopeiden prosessien aikaerotteiseen tutkimiseen ja pienten kvanttisysteemien tutkimiseen. XFEL:in spektroskopian ja röntgensironnan avulla voidaan tutkia erilaisten molekyylien atomi- ja elektronirakennetta sekä dynamiikkaa, ja korkean energiatiheyden olosuhteissa voidaan kuvantaa biomolekyylejä ja klustereita yksittäisinä partikkeleina.', 'The European X-ray Free Electron Laser, XFEL, is a joint venture by twelve European countries, involving the construction of the XFEL-based Integrated Biology Infrastructure, the XBI. The XFEL will generate ultrashort X-ray pulses based on a femtosecond construction and with a brilliance over one billion times that of modern x-ray sources. These unique features provide completely new opportunities for both research and industrial users in the fields of physics, the material sciences, the biosciences and medicine. The XFEL provides instrumentation for the imaging of nano-level materials, temporal differentiation studies of ultrafast processes and the study of small quantum systems.', NULL, NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(27,NULL,1,2013,2014,2019,NULL,'Huippuallianssi kestävään biomassan jalostukseen','Bioeconomy Infrastructure','BIOECONOMY Infra','BIOECONOMY Infra',NULL, 'BIOECONOMY -infrastruktuuri yhdistää Aalto-yliopiston ja VTT:n tieteelliset infrastruktuurit mahdollistaen uudet läpimurrot biotalouden teknologoihin. BIOECONOMY-infrastruktuuri on tehokas yhteistyöväline tutkimuskohteiden koordinoinnissa, uusissa investoinneissa, työskentelyn käytännöissä ja infrastruktuuriin liittyvässä opetuksessa.', 'Transformation from fossil-based economy to sustainable bioeconomy is often hindered by a lack of enabling technologies. This technology development has been recognised to be of high importance in Europe and Finland. In combining the scientific infrastructures of Aalto University and VTT Technical Research Centre of Finland, the BIOECONOMY infrastructure will enable new breakthroughs in bioeconomy technologies.', NULL, NULL, '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(28,NULL,0,2006,2015,2019,2049,'Cherenkov teleskooppijärjestelmä','Cherenkov Telescope Array','CTA (Suomi)','CTA (Finland)',NULL, 'Merkittävimmät Cherenkov-teleskoopit ovat olleet eurooppalaisten johtamat MAGIC ja HESS sekä yhdysvaltalainen VERITAS. Nyt nämä kolme suurinta teleskooppijärjestelmää ovat päättäneet yhdistää voimansa ja rakentaa uuden sukupolven Cherenkovteleskooppijärjestelmän (CTA). Tavoitteena on rakentaa kaksi järjestelmää, jotka kattavat koko taivaan, toinen eteläisen taivaanpuoliskon ja toinen pohjoisen. Molempiin kuuluu noin sata teleskooppia, joiden havainnot voidaan yhdistää. Näin saavutetaan vähintään kertalukua parempi herkkyys kuin nykyisillä laitteilla. CTA:n avulla tutkitaan maailmankaikkeuden korkean energian gammasäteilyä ja luodaan kuvaa kosmisista prosesseista. Tämän lisäksi CTA:lla on potentiaalia tehdä uusia löytöjä tähtitieteen, astrofysiikan ja fysiikan alojen tutkimuksessa.', 'Cherenkov telescopes have revolutionised high-energy astronomy over the last ten years. During this period, the number of objects detected through gamma-ray astronomy, based on photons in the TeV range, has risen from six to more than 160 and new objects are continuously being discovered. The most important Cherenkov telescopes have been the European managed MAGIC and HESS telescopes and the USA''s VERITAS. These three largest telescope arrays have now decided to join forces and build a new-generation Cherenkov telescope array (CTA). The aim is to build two systems covering the entire sky, one for the southern hemisphere and the other for the northern hemisphere. Both together will include around a hundred telescopes, whose observations can be combined. Various research communities in Finland have been strongly involved in the CTA.', 'http://avaa.tdata.fi/documents/10197/76259/Cherenkov_Telescope_Array_logo.jpg/8a2c974c-1810-4f8a-8e4f-951ff8a96f4a', 'http://avaa.tdata.fi/documents/10197/76259/CTA_array_sm.jpg/6bc467d4-3181-43b3-97bf-7fea66e7c161', '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(29,NULL,0,2012,2014,2020,2030,'Euclid-kosmologiamissio','Euclid cosmology mission','Euclid','Euclid',NULL, 'Euclid on Euroopan Avaruusjärjestön (ESA) seuraava kosmologiasatelliitti ja seuraavan vuosikymmenen tärkein kosmologiaprojekti. Euclid-satelliitti ja Euclidin kansalliset tietokeskukset sisältävä Science Ground Segment (SGS) muodostavat merkittävän eurooppalaisen tutkimusinfrastruktuurin. Sen tarkoituksena on ratkaista niin sanottu pimeän energian ongelma, miksi maailmankaikkeuden laajeneminen kiihtyy ja onko kiihtymisen syynä avaruuden täyttävä pimeä energia vai painovoimalain poikkeaminen yleisestä suhteellisuusteoriasta. Euclid tutkii myös pimeän aineen jakautumista maailmankaikkeudessa ja auttaa selvittämään pimeän aineen laatua ja maailmankaikkeuden rakenteen alkuperää. Euclid tuottaa kolmiulotteisen kartan maailmankaikkeudesta, sekä galakseista että pimeästä aineesta, ja miljardeja galakseja sisältävän galaksiluettelon. Helsingin yliopisto koordinoi Suomen ESA-yhteistyökumppanina Suomen osallistumista Euclid-tutkimusinfrastruktuuriin. Lisäksi projektiin osallistuvat Helsingin, Turun ja Jyväskylän yliopistojen sekä Aalto-yliopiston tutkimusryhmät. Tieteen tietotekniikan keskus CSC on mukana Suomen Euclid-yhteistyössä. Euclid -tutkimusinfrastruktuurin jäsenenä Suomi on osallistuu Euclid SGS:iin kehittämällä tietoaineiston analyysimetodeja, osallistumalla Euclid-tietoaineiston analyysiin ja varustamalla yksi Euclidin tieteellisistä tietokeskuksista.', 'Euclid is the ESA''s (European Space Agency) next cosmology satellite and its most important cosmology project over the next decade. The Euclid satellite and the Euclid Science Ground Segment (SGS), comprising Euclid''s national data centres, form a major European research infrastructure. Its purpose is to solve the socalled dark energy problem – why the expansion of the Universe is accelerating and whether this is caused by dark energy filling space or whether it is due to a deviation in the laws of gravity from the general theory of relativity. Euclid will also study the distribution of dark matter throughout the Universe and contribute to the investigation of the nature of dark matter and the origin of the structure of the Universe. Euclid will produce a 3-dimensional map of the universe, both galaxies and dark matter, and a galaxy catalogue conatining billions of galaxies.  As Finland''s ESA partner, the University of Helsinki coordinates Finland''s participation in the Euclid research infrastructure. In addition, research groups from the universities of Helsinki, Turku and Jyväskylä, and from Aalto University are involved in the project. CSC – IT Center for Science Ltd is also a participant in Finland''s Euclid collaboration. As a member of the Euclid research infrastructure, Finland will participate in the Science Ground Segment (SGS) of the Euclid mission by developing data analysis methods, participating in the analysis of Euclid data and equipping one of Euclid''s science data centres.', NULL, 'http://avaa.tdata.fi/documents/10197/76259/Euclid-esa-newimage-28May2014.jpeg/87952344-12db-4509-bd42-6e2ef7686ee0', '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(30,NULL,1,1990,1991,1992,NULL,'Jyväskylän yliopiston fysiikan laitoksen Kiihdytinlaboratorio','Accelerator laboratory of the university of Jyväskylä','JYFL-ACCLAB','JYFL-ACCLAB',NULL, 'Jyväskylän yliopiston fysiikan laitoksen kiihdytinlaboratorio JYFL-ACCLAB kuuluu Euroopan johtaviin ydinfysiikan tutkimuslaitoksiin. Se on mainittu yhtenä tärkeimmistä stabiilien ionisuihkujen laboratoriona European Science Foundationin (ESF) ydinfysiikan asiantuntijakomitean NuPECC:n pitkäaikaissuunnitelmassa sekä ESFRI-2016 Tiekarttadokumentissa. JYFL-ACCLAB toimii tutkijoita vastaanottavana EU:n tukemana infrastruktuurina ja Euroopan Avaruusjärjestön ESA:n virallisena testilaboratoriona. JYFL-ACCLAB muodostaa Suomen Akatemian Ydin- ja Kiihdytinfysiikan Huippututkimusyksikön. Sillä on kansallinen tehtävä toimia kiihdytinteknologian ja säteilyn käytön asiantuntija- ja koulutuskeskuksena. JYFL-ACCLAB on Suomessa ainutlaatuinen kansainvälinen tutkimusinfrastruktuuri, kun huomioidaan ulkomaisten investointien, käyttäjien ja tieteellisten tulosten määrä. JYFL-ACCLAB toimii kiinteästi yliopiston yhteydessä, mikä on ainutlaatuista Euroopassa.', 'JYFL-ACCLAB, the Accelerator Laboratory of the Department of Physics, University of Jyväskylä, is one of the leading stable-ion beam facilities in Europe recognized by the Nuclear Physics European Collaboration Committee (NuPECC Long Range Plan 2010) and by ESFRI (Roadmap 2016 - Landscape Analysis).  It has operated as one of the EU Large Access Infrastructures since the EU-FP4 programme. It is one of the three accredited radiation test facilities of the European Space Agency (ESA). It is the main Finnish contributor to the international FAIR project (ESFRI Landmark) and has close connections to the ISOLDE ISOLDE project at CERN. JYFL-ACCLAB constitutes the Academy of Finland’s Centre of Excellence in Nuclear and Accelerator Based Physics and has a national role as a centre of expertise and training in the use of accelerator technology and radiation.', NULL, 'http://avaa.tdata.fi/documents/10197/76259/image.jpg/ad6248bc-d60c-4b46-9560-bd6f89d09ecb', '2016-07-25');  -- comment

INSERT INTO infra.infra VALUES(31,NULL,1,1971,NULL,NULL,NULL,'CSC - Tieteen tietotekniikan keskus -kansallinen tutkimusinfrastruktuuri','CSC - IT Center for Science -national research infrastructure','CSC RI','CSC RI',NULL, 'CSC – Tieteen tietotekniikan keskus on tarjonnut suomalaiselle tutkimukselle kehittyneitä tietotekniikkapalveluita jo vuodesta 1971 asti. CSC:n kansallinen tutkimusinfrastruktuuri (CSC RI) koostuu neljästä eri osa-alueesta: laskentapalveluista, ohjelmistoista ja tietokannoista, Funet-tietoverkosta, datakeskuksesta ja pilvilaskentapalveluista. Suomalainen tutkimus nojaa vahvasti näihin CSC RI:n tarjoamiin palveluihin. CSC on yksi Pohjois-Euroopan suurimmista superlaskentakeskuksista ja jäsenenä merkittävissä eurooppalaisissa tutkimuksen e-infrastruktuurihankkeissa. Kehittämällä jatkuvasti tutkimusinfrastruktuuriaan CSC varmistaa tutkijoille kustannustehokkaasti oikea-aikaiset ja nykyaikaiset mallinnus- ja analysointipalvelut.', 'CSC – IT Center for Science Ltd has been providing ICT services for the Finnish scientific community since 1971. The CSC RI consists of four parts: a compute and storage platform, the Finnish University and Research Network (Funet), datacenter and a cloud computing platform. All Finnish research trust on CSC through one or several of its services: Funet the national network backbone and related services; a computing and storage platform; a datacentre facility; and a novel cloud service platform. The CSC RI falls INTO infra.the category of established or newly established infrastructure that will evolve and be upgraded according to user needs. The four components of CSC RI have individual plans but CSC as a whole has a long-term strategy and makes annual plans-of-action for approval by its board. CSC is one of Northern Europe''s largest supercomputing centers and is involved as a member in major European research e-infrastructures.', 'http://avaa.tdata.fi/documents/10197/76259/CSC-logo.png/7ba4c090-c9ca-4191-91ad-d0f9f8615e28', 'http://avaa.tdata.fi/documents/10197/76259/sisu-9-panels.jpg.png/4b07b502-fccb-4ec1-813d-29b3052d5a21', '2016-07-25');  -- CSC RI

INSERT INTO infra.infra VALUES(32,NULL,1,2007,2010,2010,NULL,'PRACE, Eurooppalainen suurteholaskentainfrastruktuuri','Partnership for Advanced Computing in Europe','PRACE (Suomi)','PRACE (Finland)',NULL, 'Partnership for Advanced Computing in Europe, PRACE, on eurooppalainen suurteholaskennan tutkimusinfrastruktuuri, joka mahdollistaa yliopistojen tutkijoille ja yritysten tuotekehittäjille huippuluokan suurteholaskennan palvelut. PRACE-tutkimusinfrastruktuurin muodostavat yhteistyössä toimivat kansalliset eurooppalaiset laskentakeskukset. Suomi on yksi PRACE-tutkimusinfrastruktuurin perustajajäsenistä. PRACE-yhteistyön ansiosta suomalaiset laskennallisten tieteiden tutkimusprojektit voivat hyödyntää Tier-0- ja Tier-1-tason resursseja. CSC on myös yksi kuudesta PRACEn koulutuskeskuksista (PRACE Advanced Training Center). Koulutusten avulla varmistetaan, että tutkijat käyttävät PRACEn tarjoamia suurteholaskentaresursseja mahdollisimman tehokkaasti.', 'The Partnership for Advanced Computing in Europe, PRACE, is a European research infrastructure offering high-performance computing resources. PRACE enables world-class science and research for university researchers and in private-sector product development. The PRACE research infrastructure consists of national European computing centres functioning in collaboration with one another. Finland is a founding member of the PRACE research infrastructure. Under the authorisation of the Ministry of Education and Culture, CSC represents Finland within the PRACE aisbl. Cooperation in PRACE enables Finnish researchers to use PRACE''s Tier-0 and Tier-1 resources in Finnish computational science research projects. CSC also hosts one of the PRACE Advanced Training Centers which carries out training and education activities that help researchers to utilise the computational infrastructure available through PRACE.', 'http://avaa.tdata.fi/documents/10197/76259/prace-logo.png/f19b22c1-7ddc-4f4c-82d7-33403ca9ff54', NULL, '2016-07-25');  -- PRACE

INSERT INTO infra.infra VALUES(33,NULL,0,NULL,2014,2019,NULL,'Suomen hila- ja pilvilaskennan infrastruktuuri','Finnish Grid and Cloud Infrastructure',NULL,'FGCI',NULL, 'Suomen hila- ja pilvilaskennan infrastruktuuri FGCI kehittää Suomeen koherentin hila- ja pilvilaskentainfrastruktuurin. Tietojenkäsittelytieteen, fysiikan ja insinööritieteiden kehitys on mahdollistanut nopeiden tietokoneiden kehityksen ja informaation nopean siirron maailman laajuisesti, minkä ansiosta tieteellinen ja kaupallinen laskenta ovat nopeasti kehittymässä Internetin yli hajautetuksi.', 'The Finnish Grid and Cloud Infrastructure FGCI is engaged in the development of a coherent grid and cloud infrastructure in Finland. Developments in computer science, physics and engineering science have enabled the development of fast computers and rapid data transfer around the world.', 'http://avaa.tdata.fi/documents/10197/76259/FGCI-logo.jpg/0f4ca72d-21f2-47ff-a175-dcca5b73cd8f', NULL, '2016-07-25');  -- comment



INSERT INTO infra.infra VALUES(34, NULL, 1, 1977, 1988, 1994, NULL, 'Euroopan synkrotronisäteilytutkimuslaitos', 'European Synchrotron Radiation Facility', 'ESRF', 'ESRF', NULL, 'Synkrotroni on laitteisto, joka tuottaa vahvoja röntgensäteitä. Kukin säde ohjataan omaan säteilylinjaansa, jossa se erilaisten linssien ja instrumenttien kautta vaikuttaa tutkittavaan materiaalinäytteeseen.','A synchrotron is a stadium-sized machine that produces many beams of bright X-ray light. Each beam is guided through a set of lenses and instruments called a beamline, where the X-rays illuminate and interact with samples of material being studied.', NULL, NULL, '2016-11-16'); -- ESRF , 'Ranska'

INSERT INTO infra.infra VALUES(35, NULL, 1, NULL, 2013, NULL, 2023, 'Kansainvälinen merellisen kuoren ja merenpohjan tutkimusohjelma (IODP)', 'International Ocean Discovery Program', 'IODP', 'IODP', NULL, 'IODP on jatkoa vuosina 2003-2013 toimineelle IODP-ohjelmalle (Integrated Ocean Drilling Program), 1985-2003 toimineelle ODP-ohjelmalle (Ocean Driling Program) ja sitä 1968-1984 edeltäneelle DSDP-ohjelmalle (Deep Sea Drilling Project). The International Ocean Discovery Program (IODP) on kansainvälinen merientutkimusohjelma, jonka päämääränä on tutkia Maan historiaa ja dynamiikkaa tutkimusaluksia käyttäen. Kymmenvuotisen tutkimusohjelman tiedesuunnitelman neljän pääteeman tutkimuskysymykset liittyvät Maan ilmastoon, syvän meren elämään, geodynamiikkaan ja luonnonuhkiin. Tutkimustulokset edesauttavat pitkän aikavälin globaalin perspektiivin saamista eräisiin nykypäivän tärkeimpiin ympäristökysymyksiin.', 'The International Ocean Discovery Program (IODP) is an international marine research collaboration that explores Earth''s history and dynamics using ocean-going research platforms. The 10-year International Ocean Discovery Program''s four research themes, addressing fundamental questions about Earth''s climate, deep life, geodynamics, and geohazards, will facilitate a long-term, global perspective on some of today''s most pressing environmental issues.', NULL, NULL, '2016-11-16'); -- IODP

INSERT INTO infra.infra VALUES(36, NULL, 1, 2013, 2015, 2017, NULL, 'Suomen Lajitietokeskus', 'Finnish Biodiversity Information Facility', 'FinBIF', 'FinBIF', NULL, 'Suomen Lajitietokeskus on lajitiedon digitointia, tuottamista, kokoamista, yhteen liittämistä, standardointia sekä avointa jakelua ja hyödyntämistä edistävä ja mahdollistava infrastruktuuri. Se on e-infrastruktuuri, jonka palvelut ovat käytettävissä portaalissa Laji.fi.', 'The Finnish Biodiversity Information Facility is an infrastructure, which promotes and facilitates digitisation, creation, sourcing, collation, standardisation, and open distribution and utilisation of data on species. It is an e-infrastructure, the services of which are available at the portal Species.fi / Laji.fi.', NULL, NULL, '2016-11-16'); -- FinBIF

INSERT INTO infra.infra VALUES(37, NULL, 1, 1999, 2001, 2002, NULL, 'Maailman Lajitietokeskus', 'Global Biodiversity Information Facility', 'GBIF', 'GBIF', NULL, 'Maailman Lajitietokeskus on globaali avoimen tiedon lajitietoa keräävä ja jakava e-infrastruktuuri, jota rahoittavat jäsenvaltiot. Se mahdollistaa internetin kautta pääsyn kaikille avoimeen eliölajitietoon maailmanlaajuisesti.','The Global Biodiversity Information Facility (GBIF) is an international open data infrastructure funded by governments. It allows anyone anywhere to access data about all types of life on Earth shared across national boundaries via the Internet.', NULL, NULL, '2016-11-16'); -- GBIF 'Tanska'

INSERT INTO infra.infra VALUES(38, NULL, 1, 1973, 1975, 1974, NULL, 'Euroopan molekyylibiologian laboratorio', 'European Molecular Biology Laboratory', 'EMBL', 'EMBL', NULL, 'EMBL on maailman johtavia life sciences-alueen tutkimusinstituutteja ja Euroopan johtava alan tutkimusorganisaatio/-laboratorio. EMBL on jäsenvaltioiden (yli 20) julkisin varoin rahoittama yhteinen organisaatio, joka tekee biotieteellistä perustutkimusta. Tutkimus kohdistuu biologisiin toimintoihin, molekyylitasolta eläviin organismeihin, sekä laskennalliseen biologiaan bioinformatiikkaan ja systeemibiologiaan. Tutkimusta toteuttaa yli 80 tutkimusryhmää, joiden toiminta kattaa molekyylibiologian koko kirjon. EMBL:n 1600 työntekijää edustavat monia eri kansallisuuksia ja tieteenaloja, esim. biologia, fysiikka, kemia ja tietojenkäsittelytieteet. EMBL kouluttaa tutkijoita eri tasoilla: tohtoriopiskelijat, post-doc tutkijat ja vierailevat tutkijat. EMBL:n palvelut kattavat mm. seuraavat alueet: biomolekulääriset tietokannat ja bioinformatiikan työkalut rakennebiologian tukitoiminnot (säteilylähteet, instrumentaatio ja teknologia) sekä helposti hyödynnettävät core facility-palvelut metodeihin ja teknologioihin, joiden pystyttäminen ja ylläpitäminen kansallisesti on hyvin kallista ja teknisesti haastavaa.', 'The European Molecular Biology Laboratory (EMBL) is one of the world''s leading research institutions, and Europe''s flagship laboratory for the life sciences. EMBL is an intergovernmental organisation specialising in basic research in the life sciences, funded by public research monies from more than 20 member states. Research at EMBL emphasises experimental analysis at multiple levels of biological organisation, from the molecule to the organism, as well as computational biology, bioinformatics and systems biology. Research is conducted by more than 80 independent groups covering the spectrum of molecular biology. EMBLs 1600 employees from many nations represent scientific disciplines including biology, physics, chemistry and computer science. Training is available at multiple levels: PhD students, postdocs and visiting scientists. Services provided by EMBL include: core biomolecular databases and bioinformatics tools, particularly at EMBL-EBI, the provision of beamlines, instrumentation and high-throughput technology for structural biology at the Hamburg and Grenoble oustations, Core Facilities, which provide cost-effective and efficient access to methods and technologies that are expensive to set up or maintain, or that require considerable expense.', NULL, NULL, '2016-11-16'); -- EMBL

INSERT INTO infra.infra VALUES(39, NULL, 1, 2015, 2016, 2016, NULL, 'Tutkimusinfrastruktuuri yksittäisten solujen analysointiin', 'Infrastructure for Single Cell Capture and Processing', 'SC-infra', 'SC-infra', NULL, NULL, 'SC-infra -network aims at bringing the latest single-cell genomics tools available for the research community in Finland thus promoting high level research international competence and attractiveness of Finland as a research environment. Availability of the modern single cell techniques is not only important for advancing excellence in basic research, but also for creating platform for development of novel innovations and commercial applications. The collaborators of the consortium aim to build a national infrastructure and expertise for single cell processing. Different in-depth expertise and capabilities will be developed in each center based on the research areas and technology expertise.', NULL, NULL, '2016-11-16'); -- SC-infra

INSERT INTO infra.infra VALUES(41, NULL, 0, 2015, 2016, 2017, NULL, NULL, 'RawMatTERS Finland Infrastructure', 'RAMI', 'RAMI', NULL, NULL, 'RawMatTERS Finland Infrastructure (RAMI) supports expertise in the design synthesis and characterization of a variety of inorganic materials. RAMI contains the selected research infrastructures at Aalto University (School of Chemical Engineering). Geological Survey of Finland (GTK) and VTT Technical Research Centre of Finland for research related to natural and new inorganic materials and circular economy. RAMI is part of the EIT Raw Materials KIC''s infrastructure network.', NULL, NULL, '2016-11-16'); -- RAMI

INSERT INTO infra.infra VALUES(42, NULL, 1, 2014, 2015, 2015, NULL, 'Heliumionimikroskooppi poikkitieteelliseen materiaalitutkimukseen', 'Helium Ion Microscope for Interdisciplinary Materials Research', 'HIM', 'HIM', NULL, 'Zeiss Orion Nanofab heliumionimikroskooppi (HIM) on pyyhkäisyelektronimikroskoopin (SEM) kaltainen kuvantamislaite jossa elektronien sijasta tutkittavan näytteen pintaa pyyhkäistään positiivisilla He-ioneilla. Sillä voidaan kuvata kohteita millimetrimittakaavasta aina yksittäisiin nanometreihin asti. Merkittävimmät edut SEMiin verrattuna ovat parempi erotuskyky (jopa 0,5 nm) laaja syvyysterävyysalue sekä mahdollisuus kuvata eristäviä näytteitä ilman johtavaa pinnoitusta. Ne-ionien käyttö He-ionien sijaan mahdollistaa myös tutkittavan näytteen muokkauksen nanometrimittakaavassa.', 'Zeiss Orion Nanofab helium ion microscope (HIM) is an imaging device similar to scanning electron microscope (SEM). In HIM the sample surface is scanned with positive He ions instead of electrons and objects from mm size to nm size can be studied. The greatest advantages of HIM over SEM are better resolution (even 0.5 nm) large depth of field and possibility to image insulating samples without conductive coating. By using Ne ions instead of He ions also sample modification and milling in nanometer scale is possible.', NULL, NULL, '2016-11-16'); -- HIM

INSERT INTO infra.infra VALUES(43, NULL, 1, NULL, NULL, 1962, NULL, 'Euroopan eteläinen observatorio', 'European Southern Observatory', 'ESO', 'ESO', NULL, 'ESO on eurooppalainen tähtitieteen tutkimus- ja teknologiaorganisaatio jossa on 15 jäsenmaata ja joka kattaa n. 30% maailman tähtitieteilijöistä. ESO:n päämaja on Saksassa ja sen teleskoopit sijaitsevat Chilessä. ESO on Euroopan tärkein hallitustenvälinen tähtitieteen alan organisaatio ja maailman johtava maanpäällisen tähtitieteen observatorio. ESO operoi Chilessä neljää optisen/infrapuna-aallonpituuden 8-metristä Very Large Telescopea (VLT) ja se on Euroopan osapuoli Atacama Large Millimeter Array''ssä (ALMA) joka on maailman suurin tähtitieteen tutkimusinfrastruktuuri. ESO rakentaa myös 39-metristä European Extremely Large Telescopea (E-ELT) joka valmistuessaan vuonna 2024 on maailman suurin teleskooppi joka mullistaa optisen ja infrapunatähtitieteen tutkimuksen. E-ELT:n avulla voidaan tutkia entistä paremmin esimerkiksi aurinkokunnan ulkopuolisia planeettoja sekä varhaisinta maailmankaikkeutta. Suomen ESO-keskus (FINCA) harjoittaa ja koordinoi ESO:on liittyvää tähtitieteen tutkimusta Suomessa sekä edistää ESO:on liittyvää teknologista kehitystyötä. Se osallistuu tutkijakoulutukseen ja edistää suomalaisten yliopistojen tähtitieteeseen liittyvää yhteistyötä.', 'ESO is a European astronomical research and technology organization with 15 member states, covering ca. 30% of all astronomers in the world. ESO''s headquarters are in Germany and its telescopes are situated in Chile.  ESO is the foremost intergovernmental astronomy organization in Europe and the leading ground-based observatory in the world. In Chile. ESO operates four optical/infrared 8m Very Large Telescopes (VLT) and it is the European partner of the Atacama Large Millimeter Array (ALMA) the largest astronomical research infrastructure in the world. ESO is also constructing the 39m European Extremely Large Telescope (E-ELT), which when completed in 2024 will be the largest telescope in the world revolutionizing optical and infrared astronomical research. E-ELT will allow a more detailed study of for example extrasolar planets and the earliest Universe. FINCA practises and co-ordinates Finnish ESO-related research in astronomy and promotes ESO-related technological development work. It participates in research training and promotes co-operation of Finnish universities in astronomy.', NULL, NULL, '2016-11-16'); -- ESO 'Saksa'

INSERT INTO infra.infra VALUES(44, NULL, 1, 2016, 2017, 2018, 2038, 'Seuraavan sukupolven termohydraulinen koelaite', 'Next Generation Thermal Hydraulic Test Loop', 'NextGenTH', 'NextGenTH',
-- 'PWR-PACTEL' replaced with NULL as it stands for "previous infra's" ID
NULL, NULL, 'The Next Generation Thermal Hydraulic Test Loop is a multifunctional facility designed to reproduce a wide range of heat transfer and fluid flow (thermal-hydraulic) phenomena relevant to light water moderated nuclear reactors. The main scientific output of the new facility will be (1) capability to locally discern interpret and model the 2D/3D dynamic structure of two-phase (water-steam) flow under a broad variety of conditions relevant to safety and availability of nuclear power plants and (2) large-scale modelling of system-wide behavior in multiple genometrics representative of various nuclear heat transport systems (modularity: interchangeable components typical to nuclear systems).', NULL, NULL, '2016-11-16'); -- NestGenTH

INSERT INTO infra.infra VALUES(45, NULL, 1, NULL, NULL, 1954, NULL, 'Euroopan hiukkasfysiikan tutkimuslaitos', 'European Organization for Nuclear Research', 'CERN', 'CERN', NULL, 'CERN on maailman johtava monipuolinen hiukkas- ja ydinfysiikan tutkimuskeskus. Se sijaitsee Geneven lähistöllä Sveitsin ja Ranskan rajalla. CERN:n 22 jäsenmaata osallistuvat yhteisvoimin aineen perusrakenteen ja luonnon perusvuorovaikutuksien tutkimukseen globaaleissa hankkeissa joihin millään Euroopan maalla ei yksinään olisi mahdollisuutta. CERN:n suurhanke maailman suurin tieteellinen instrumentti LHC eli suuri hadronitörmäytin aloitti tutkimustoimintansa vuonna 2010 ja se on mm. tuonut selvyyden alkeishiukkasten massan alkuperään löytämällä Higgsin hiukkasen. CERN on myös merkittävä teknologinen kehitysalusta. World Wide Web WWW on keksitty CERN:ssä. Suomen CERN-toiminnasta vastaa Fysiikan tutkimuslaitos (HIP).', 'CERN is the world leading research centre for particle and nuclear physics. It is located near Geneva on the Franco-Swiss border. At CERN the 22 member states collaborate to study the basic constituents of matter and fundamental forces of nature in global projects which no European country could afford. CERN hosts the Large Hadron Collider (LHC) which is the world''s largest and most powerful particle accelerator. The LHC started scientific operation in 2010 and it has shed light on the origin of mass of fundamental particles by observing the Higgs particle. CERN is also a major platform for technological development. The World Wide Web was invented at CERN. Helsinki Institute of Physics (HIP) is responsible for Finland''s CERN activities.', NULL, NULL, '2016-11-16'); -- CERN

INSERT INTO infra.infra VALUES(46, NULL, 0, 2005, 2012, 2022, NULL, 'Ydinfysiikan kansainvälinen kiihdytinlaboratorio', 'Facility for Antiproton and Ion Research', 'FAIR', 'FAIR', NULL, 'FAIR on Darmstadtiin Saksaan perustettu ydinfysiikan kansainvälinen kiihdytinlaboratorio jossa tullaan tuottamaan korkean energian ja suuren intensiteetin hiukkassuihkuja sekä primääri- ja sekundääri-ionisuihkuja että anti-protonisuihkuja. FAIR on tällä hetkellä kymmenen jäsenmaan yhteishanke. FAIR-hankkeessa on tarkoitus tutkia raskasionitörmäyksiä hyvin lyhytikäisten ja eksoottisten ytimien spektroskopiaa antimateriaa sekä suuren tiheyden plasmojen ominaisuuksia. Kiihdytinkompleksi sisältää hiukkassuihkujen varastointi- ja jäähdytysrenkaat ja mahdollistaa sisäisten kohtioiden käytön tutkimuksessa. Kaksi suprajohtavaa synkrotronia tuottaa korkean intensiteetin ionisuihkuja ja antaa mahdollisuuden primääri-ionisuihkuihin raskailla ytimillä aina uraaniin saakka sekä laajaan radioaktiivisten ionisuihkujen valikoimaan. Yleisesti ottaen hanke keskittyy aineen subatomaarisen rakenteen ymmärtämiseen toisaalta sen perusvuorovaikutusten ja toisaalta monihiukkassysteemien tutkimuksen kautta. Fysiikan tutkimuslaitos (HIP) koordinoi Suomen FAIR-kontribuutiota.', 'FAIR is a new international accelerator facility for the research with antiprotons and ions. It is a joint international effort of so far ten member states. It will be built in Darmstadt, Germany. FAIR will produce high energy and high intensity particle beams of both primary and secondary ions and and antiprotons. The aim is to study heavy ion collisions, spectroscopy of very short lived exotic nuclei antimatter and properties of high density plasma. The accelerator facility contains a system of cooler-storage rings and enables usage of internal targets. Two superconducting synchrotrons produce high intensity ion beams and enables wide selection of radioactive ion beams, with primary ion beams up to Uranium. Generally the facility focuses on the understanding of subatomaric structure of matter by studying fundamental interactions and complex many particle systems. Helsinki Institute of Physics (HIP) coordinates the Finnish contribution to FAIR.', NULL, NULL, '2016-11-16'); -- FAIR

INSERT INTO infra.infra VALUES(47, NULL, 1, 1980, 1984, 1989, NULL, 'Pohjoismainen optinen teleskooppi', 'Nordic Optical Telescope', 'NOT', 'NOT', NULL, 'Yhteispohjoismainen 2,56 metrin peiliteleskooppi Kanarian saarilla. Käyttötarkoitus tähtitieteen perustutkimus.', 'Nordic 2.56 meter mirror telescope located on the Canary Islands. The purpose is basic research in astronomy.', NULL, NULL, '2016-11-16'); -- NOT 'Espanja'

INSERT INTO infra.infra VALUES(48, NULL, 1, NULL, NULL, 2012, NULL, 'Pohjoismaiden e-infrastuktuuri yhteistyö', 'Nordic e-Infrastructure Collaboration', 'NeIC', 'NeIC', NULL, 'NeIC on yhteispohjoismainen kansallisten laskenta- ja tallennusresurssientarjoajien yhteistyöorganisaatio. NeIC:n edesauttaa  pohjoismaisellla tasolla tärkeiden tutkimuksen e-infrastruktuuri palveluiden kehitystä ja operointia. NeIC:n isäntäorganisaationa toimii Nordforsk. NeIC:n kaksi tärkeintä palvelua ovat pohjoismaisen hajautetun WLCG Tier-1 keskuksen operointi ja yhteispohjoismaisten kehityshankkeiden tuki.', 'The vision of NeIC is to facilitate the development and operation of high quality e-infrastructure solutions in areas of joint Nordic interest. The legal representative of and hosting organisation for NeIC is NordForsk, which is an organisation under the Nordic Council of Ministers. Two major aspects of NeIC are the distributed operation of the Nordic WLCG Tier-1 site and the collaborative development activities that support and enhance the national efforts in research infrastructure to benefit researchers as well as international projects.', NULL, NULL, '2016-11-16'); -- NeIC 'Norja'


/*
table_data_infra_avainsanat.sql

INFRA_AVAINSANAT-TAULU: yhdistää infran ja avainsanat toisiinsa
INSERT INTO infra.infra_avainsanat VALUES(INFRA_ID,AVAINSANA_ID);  -- comment
INFRA_ID - INT(4): juokseva numero, kannan sisäinen, uniikki, linkki infra-tauluun
AVAINSANA_ID - INT(4): juokseva numero, kannan sisäinen, uniikki, linkki palvelu-tauluun
*/

INSERT INTO infra.infra_avainsanat VALUES(7,1);  -- ATT & KDK-PAS
INSERT INTO infra.infra_avainsanat VALUES(7,2);  -- ATT & KDK-PAS
INSERT INTO infra.infra_avainsanat VALUES(7,3);  -- ATT & KDK-PAS
-- INSERT INTO infra.infra_avainsanat VALUES(7,4);  -- comment
-- INSERT INTO infra.infra_avainsanat VALUES(7,5);  -- comment

INSERT INTO infra.infra_avainsanat VALUES(2,6);  -- FIN-CLARIN
INSERT INTO infra.infra_avainsanat VALUES(2,7);  -- FIN-CLARIN
INSERT INTO infra.infra_avainsanat VALUES(2,8);  -- FIN-CLARIN
INSERT INTO infra.infra_avainsanat VALUES(2,9);  -- FIN-CLARIN
INSERT INTO infra.infra_avainsanat VALUES(2,10);  -- FIN-CLARIN

INSERT INTO infra.infra_avainsanat VALUES(3,11);  -- FinElib
INSERT INTO infra.infra_avainsanat VALUES(3,12);  -- FinElib
INSERT INTO infra.infra_avainsanat VALUES(3,13);  -- FinElib
INSERT INTO infra.infra_avainsanat VALUES(3,14);  -- FinElib

INSERT INTO infra.infra_avainsanat VALUES(4,15);  -- Finna
INSERT INTO infra.infra_avainsanat VALUES(4,16);  -- Finna

INSERT INTO infra.infra_avainsanat VALUES(5,17);  -- FMAS
INSERT INTO infra.infra_avainsanat VALUES(5,18);  -- FMAS
INSERT INTO infra.infra_avainsanat VALUES(5,19);  -- FMAS
INSERT INTO infra.infra_avainsanat VALUES(5,20);  -- FMAS
INSERT INTO infra.infra_avainsanat VALUES(5,21);  -- FMAS

INSERT INTO infra.infra_avainsanat VALUES(33,22);  -- FGCI
INSERT INTO infra.infra_avainsanat VALUES(33,23);  -- FGCI

INSERT INTO infra.infra_avainsanat VALUES(9,24);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,25);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,26);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,27);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,28);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,29);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,30);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,31);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,32);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,33);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,34);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,35);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,36);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,37);  -- FIN-EPOS
INSERT INTO infra.infra_avainsanat VALUES(9,38);  -- FIN-EPOS

INSERT INTO infra.infra_avainsanat VALUES(12,39);  -- INAR RI
INSERT INTO infra.infra_avainsanat VALUES(12,40);  -- INAR RI
INSERT INTO infra.infra_avainsanat VALUES(12,41);  -- INAR RI
INSERT INTO infra.infra_avainsanat VALUES(12,42);  -- INAR RI
INSERT INTO infra.infra_avainsanat VALUES(12,43);  -- INAR RI
INSERT INTO infra.infra_avainsanat VALUES(12,44);  -- INAR RI
INSERT INTO infra.infra_avainsanat VALUES(12,45);  -- INAR RI
INSERT INTO infra.infra_avainsanat VALUES(12,46);  -- INAR RI
INSERT INTO infra.infra_avainsanat VALUES(12,47);  -- INAR RI
INSERT INTO infra.infra_avainsanat VALUES(12,48);  -- INAR RI
INSERT INTO infra.infra_avainsanat VALUES(12,49);  -- INAR RI
INSERT INTO infra.infra_avainsanat VALUES(12,50);  -- INAR RI

INSERT INTO infra.infra_avainsanat VALUES(20,51);  -- INFRAFRONTIER
INSERT INTO infra.infra_avainsanat VALUES(20,52);  -- INFRAFRONTIER
INSERT INTO infra.infra_avainsanat VALUES(20,53);  -- INFRAFRONTIER
INSERT INTO infra.infra_avainsanat VALUES(20,54);  -- INFRAFRONTIER
INSERT INTO infra.infra_avainsanat VALUES(20,55);  -- INFRAFRONTIER
INSERT INTO infra.infra_avainsanat VALUES(20,98);  -- INFRAFRONTIER

INSERT INTO infra.infra_avainsanat VALUES(21,56);  -- Instruct
INSERT INTO infra.infra_avainsanat VALUES(21,57);  -- Instruct
INSERT INTO infra.infra_avainsanat VALUES(21,58);  -- Instruct
INSERT INTO infra.infra_avainsanat VALUES(21,59);  -- Instruct
INSERT INTO infra.infra_avainsanat VALUES(21,60);  -- Instruct
INSERT INTO infra.infra_avainsanat VALUES(21,61);  -- Instruct
INSERT INTO infra.infra_avainsanat VALUES(21,62);  -- Instruct

INSERT INTO infra.infra_avainsanat VALUES(11,63);  -- ICOS
INSERT INTO infra.infra_avainsanat VALUES(11,64);  -- ICOS
INSERT INTO infra.infra_avainsanat VALUES(11,65);  -- ICOS
INSERT INTO infra.infra_avainsanat VALUES(11,66);  -- ICOS
INSERT INTO infra.infra_avainsanat VALUES(11,67);  -- ICOS
INSERT INTO infra.infra_avainsanat VALUES(11,68);  -- ICOS
INSERT INTO infra.infra_avainsanat VALUES(11,69);  -- ICOS
INSERT INTO infra.infra_avainsanat VALUES(11,70);  -- ICOS
INSERT INTO infra.infra_avainsanat VALUES(11,71);  -- ICOS
INSERT INTO infra.infra_avainsanat VALUES(11,72);  -- ICOS

INSERT INTO infra.infra_avainsanat VALUES(28,73);  -- CTA
INSERT INTO infra.infra_avainsanat VALUES(28,74);  -- CTA

INSERT INTO infra.infra_avainsanat VALUES(30,75);  -- JYFL-ACCLAB
INSERT INTO infra.infra_avainsanat VALUES(30,76);  -- JYFL-ACCLAB
INSERT INTO infra.infra_avainsanat VALUES(30,77);  -- JYFL-ACCLAB
INSERT INTO infra.infra_avainsanat VALUES(30,78);  -- JYFL-ACCLAB

INSERT INTO infra.infra_avainsanat VALUES(31,79);  -- CSC RI
INSERT INTO infra.infra_avainsanat VALUES(31,80);  -- CSC RI
INSERT INTO infra.infra_avainsanat VALUES(31,81);  -- CSC RI
INSERT INTO infra.infra_avainsanat VALUES(31,82);  -- CSC RI
INSERT INTO infra.infra_avainsanat VALUES(31,83);  -- CSC RI

INSERT INTO infra.infra_avainsanat VALUES(17,84);  -- ELIXIR
INSERT INTO infra.infra_avainsanat VALUES(17,81);  -- ELIXIR

INSERT INTO infra.infra_avainsanat VALUES(18,85);  -- EuBI

INSERT INTO infra.infra_avainsanat VALUES(29,86);  -- euclid
INSERT INTO infra.infra_avainsanat VALUES(29,87);  -- euclid
INSERT INTO infra.infra_avainsanat VALUES(29,88);  -- euclid
INSERT INTO infra.infra_avainsanat VALUES(29,89);  -- euclid

INSERT INTO infra.infra_avainsanat VALUES(23,90);  -- NVVL
INSERT INTO infra.infra_avainsanat VALUES(23,91);  -- NVVL
INSERT INTO infra.infra_avainsanat VALUES(23,92);  -- NVVL

INSERT INTO infra.infra_avainsanat VALUES(26,93);  -- XBI&XFEL
INSERT INTO infra.infra_avainsanat VALUES(26,94);  -- XBI&XFEL
INSERT INTO infra.infra_avainsanat VALUES(26,95);  -- XBI&XFEL
INSERT INTO infra.infra_avainsanat VALUES(26,96);  -- XBI&XFEL
INSERT INTO infra.infra_avainsanat VALUES(26,97);  -- XBI&XFEL

INSERT INTO infra.infra_avainsanat VALUES(27,99);  -- BIOECONOMY infra
INSERT INTO infra.infra_avainsanat VALUES(27,100);  -- BIOECONOMY infra
INSERT INTO infra.infra_avainsanat VALUES(27,101);  -- BIOECONOMY infra
INSERT INTO infra.infra_avainsanat VALUES(27,102);  -- BIOECONOMY infra
INSERT INTO infra.infra_avainsanat VALUES(27,103);  -- BIOECONOMY infra
INSERT INTO infra.infra_avainsanat VALUES(27,104);  -- BIOECONOMY infra
INSERT INTO infra.infra_avainsanat VALUES(27,105);  -- BIOECONOMY infra
INSERT INTO infra.infra_avainsanat VALUES(27,106);  -- BIOECONOMY infra
INSERT INTO infra.infra_avainsanat VALUES(27,107);  -- BIOECONOMY infra

INSERT INTO infra.infra_avainsanat VALUES(15,108);  -- biokeskus
INSERT INTO infra.infra_avainsanat VALUES(15,109);  -- biokeskus

INSERT INTO infra.infra_avainsanat VALUES(13,110);  -- oGIIR
INSERT INTO infra.infra_avainsanat VALUES(13,111);  -- oGIIR
INSERT INTO infra.infra_avainsanat VALUES(13,112);  -- oGIIR
INSERT INTO infra.infra_avainsanat VALUES(13,113);  -- oGIIR
INSERT INTO infra.infra_avainsanat VALUES(13,114);  -- oGIIR
INSERT INTO infra.infra_avainsanat VALUES(13,115);  -- oGIIR
INSERT INTO infra.infra_avainsanat VALUES(13,116);  -- oGIIR
INSERT INTO infra.infra_avainsanat VALUES(13,117);  -- oGIIR
INSERT INTO infra.infra_avainsanat VALUES(13,118);  -- oGIIR
INSERT INTO infra.infra_avainsanat VALUES(13,119);  -- oGIIR

INSERT INTO infra.infra_avainsanat VALUES(14,120);  -- BBMRI.fi
INSERT INTO infra.infra_avainsanat VALUES(14,121);  -- BBMRI.fi
INSERT INTO infra.infra_avainsanat VALUES(14,122);  -- BBMRI.fi
INSERT INTO infra.infra_avainsanat VALUES(14,123);  -- BBMRI.fi

INSERT INTO infra.infra_avainsanat VALUES (34, 124); -- ESRF


INSERT INTO infra.infra_avainsanat VALUES (34, 125); -- ESRF"
INSERT INTO infra.infra_avainsanat VALUES (34, 126); -- ESRF"
INSERT INTO infra.infra_avainsanat VALUES (34, 127); -- ESRF"
INSERT INTO infra.infra_avainsanat VALUES (34, 128); -- ESRF"

INSERT INTO infra.infra_avainsanat VALUES (35, 129); -- IODP"
INSERT INTO infra.infra_avainsanat VALUES (35, 130); -- IODP"
INSERT INTO infra.infra_avainsanat VALUES (35, 131); -- IODP"
INSERT INTO infra.infra_avainsanat VALUES (35, 132); -- IODP"
INSERT INTO infra.infra_avainsanat VALUES (35, 72); -- IODP"
INSERT INTO infra.infra_avainsanat VALUES (35, 133); -- IODP"
INSERT INTO infra.infra_avainsanat VALUES (35, 134); -- IODP"
INSERT INTO infra.infra_avainsanat VALUES (35, 135); -- IODP"
INSERT INTO infra.infra_avainsanat VALUES (35, 136); -- IODP"

INSERT INTO infra.infra_avainsanat VALUES (36, 137); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 138); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 139); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 140); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 141); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 142); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 116); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 2); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 143); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 144); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 145); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 146); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 147); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 148); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 149); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 150); -- FinBIF"
INSERT INTO infra.infra_avainsanat VALUES (36, 151); -- FinBIF"

INSERT INTO infra.infra_avainsanat VALUES (37, 152); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 153); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 154); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 155); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 156); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 157); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 158); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 159); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 160); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 161); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 162); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 146); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 164); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 165); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 166); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 167); -- GBIF"
INSERT INTO infra.infra_avainsanat VALUES (37, 168); -- GBIF"

INSERT INTO infra.infra_avainsanat VALUES (38, 169); -- EMBL"
INSERT INTO infra.infra_avainsanat VALUES (38, 170); -- EMBL"
INSERT INTO infra.infra_avainsanat VALUES (38, 171); -- EMBL"
INSERT INTO infra.infra_avainsanat VALUES (38, 172); -- EMBL"
INSERT INTO infra.infra_avainsanat VALUES (38, 173); -- EMBL"
INSERT INTO infra.infra_avainsanat VALUES (38, 174); -- EMBL"
INSERT INTO infra.infra_avainsanat VALUES (38, 175); -- EMBL"
INSERT INTO infra.infra_avainsanat VALUES (38, 176); -- EMBL"
INSERT INTO infra.infra_avainsanat VALUES (38, 177); -- EMBL"
INSERT INTO infra.infra_avainsanat VALUES (38, 178); -- EMBL"
INSERT INTO infra.infra_avainsanat VALUES (38, 179); -- EMBL"
INSERT INTO infra.infra_avainsanat VALUES (38, 180); -- EMBL"
INSERT INTO infra.infra_avainsanat VALUES (38, 181); -- EMBL"

INSERT INTO infra.infra_avainsanat VALUES (39, 182); -- SC-infra"
INSERT INTO infra.infra_avainsanat VALUES (39, 183); -- SC-infra"
INSERT INTO infra.infra_avainsanat VALUES (39, 184); -- SC-infra"
INSERT INTO infra.infra_avainsanat VALUES (39, 185); -- SC-infra"
INSERT INTO infra.infra_avainsanat VALUES (39, 186); -- SC-infra"
INSERT INTO infra.infra_avainsanat VALUES (39, 187); -- SC-infra"
INSERT INTO infra.infra_avainsanat VALUES (39, 188); -- SC-infra"
INSERT INTO infra.infra_avainsanat VALUES (39, 189); -- SC-infra"
INSERT INTO infra.infra_avainsanat VALUES (39, 190); -- SC-infra"
INSERT INTO infra.infra_avainsanat VALUES (39, 191); -- SC-infra"

INSERT INTO infra.infra_avainsanat VALUES (41, 192); -- RAMI"
INSERT INTO infra.infra_avainsanat VALUES (41, 193); -- RAMI"
INSERT INTO infra.infra_avainsanat VALUES (41, 194); -- RAMI"
INSERT INTO infra.infra_avainsanat VALUES (41, 195); -- RAMI"
INSERT INTO infra.infra_avainsanat VALUES (41, 196); -- RAMI"
INSERT INTO infra.infra_avainsanat VALUES (41, 197); -- RAMI"
INSERT INTO infra.infra_avainsanat VALUES (41, 198); -- RAMI"
INSERT INTO infra.infra_avainsanat VALUES (41, 199); -- RAMI"
INSERT INTO infra.infra_avainsanat VALUES (41, 200); -- RAMI"

INSERT INTO infra.infra_avainsanat VALUES (42, 85); -- HIM"
INSERT INTO infra.infra_avainsanat VALUES (42, 201); -- HIM"
INSERT INTO infra.infra_avainsanat VALUES (42, 225); -- HIM"
INSERT INTO infra.infra_avainsanat VALUES (42, 202); -- HIM"
INSERT INTO infra.infra_avainsanat VALUES (42, 163); -- HIM"
INSERT INTO infra.infra_avainsanat VALUES (42, 146); -- HIM"

INSERT INTO infra.infra_avainsanat VALUES (43, 203); -- ESO"
INSERT INTO infra.infra_avainsanat VALUES (43, 204); -- ESO"
INSERT INTO infra.infra_avainsanat VALUES (43, 227); -- ESO"

INSERT INTO infra.infra_avainsanat VALUES (44, 205); -- NextGenTH"
INSERT INTO infra.infra_avainsanat VALUES (44, 206); -- NextGenTH"
INSERT INTO infra.infra_avainsanat VALUES (44, 207); -- NextGenTH"
INSERT INTO infra.infra_avainsanat VALUES (44, 208); -- NextGenTH"
INSERT INTO infra.infra_avainsanat VALUES (44, 210); -- NextGenTH"
INSERT INTO infra.infra_avainsanat VALUES (44, 211); -- NextGenTH"

INSERT INTO infra.infra_avainsanat VALUES (45, 212); -- CERN"
INSERT INTO infra.infra_avainsanat VALUES (45, 213); -- CERN"
INSERT INTO infra.infra_avainsanat VALUES (45, 214); -- CERN"
INSERT INTO infra.infra_avainsanat VALUES (45, 215); -- CERN"
INSERT INTO infra.infra_avainsanat VALUES (45, 216); -- CERN"
INSERT INTO infra.infra_avainsanat VALUES (45, 217); -- CERN"
INSERT INTO infra.infra_avainsanat VALUES (45, 218); -- CERN"

INSERT INTO infra.infra_avainsanat VALUES (46, 232); -- FAIR"
INSERT INTO infra.infra_avainsanat VALUES (46, 233); -- FAIR"
INSERT INTO infra.infra_avainsanat VALUES (46, 213); -- FAIR"
INSERT INTO infra.infra_avainsanat VALUES (46, 214); -- FAIR"
INSERT INTO infra.infra_avainsanat VALUES (46, 215); -- FAIR"
INSERT INTO infra.infra_avainsanat VALUES (46, 229); -- FAIR"
INSERT INTO infra.infra_avainsanat VALUES (46, 230); -- FAIR"
INSERT INTO infra.infra_avainsanat VALUES (46, 231); -- FAIR"
INSERT INTO infra.infra_avainsanat VALUES (46, 219); -- FAIR"
INSERT INTO infra.infra_avainsanat VALUES (46, 220); -- FAIR"
INSERT INTO infra.infra_avainsanat VALUES (46, 221); -- FAIR"
INSERT INTO infra.infra_avainsanat VALUES (46, 228); -- FAIR"

INSERT INTO infra.infra_avainsanat VALUES (47, 222); -- NOT"
INSERT INTO infra.infra_avainsanat VALUES (47, 223); -- NOT"
INSERT INTO infra.infra_avainsanat VALUES (47, 224); -- NOT"

INSERT INTO infra.infra_avainsanat VALUES (48, 79); -- NeIC"
INSERT INTO infra.infra_avainsanat VALUES (48, 226); -- NeIC"


/*
table_data_kayttoehto.sql

kayttoehto-TAULU: lista kaikkien infrojen käyttöehdoista
INSERT INTO infra.kayttoehto VALUES(INFRA_ID,SAAVUTETTAVUUS,ANONYMITEETTI,MAKSULLISUUS,TULOSTEN_JULKAISUVELVOITE,TUOTOKSIEN_JULKAISUVELVOITE,OSAAMISEN_AVOIMUUS,SEURANTATYOKALUT,TULOSTEN_LISENSOINTI,URLFI,URLEN);  -- comment
INFRA_ID - INT(4) : juokseva numero, kannan sisäinen, identifioi infran. yksi rivi per infra
 alla olevat muuttujat on määritelty selite-taulussa
SAAVUTETTAVUUS - TINYINT(2): lukuarvo välillä 21-23: 21=hakuprosessi, 22=tunnistautuminen, 23=kaikille avoin
ANONYMITEETTI - TINYINT(2): lukuarvo välillä 31-33: 31=kirjautuneena, 32=osittain anonyymi, 33=täysin anonyymi
MAKSULLISUUS - TINYINT(2): lukuarvo välillä 41-43: 41=kaikille maksullinen, 42=osittain maksullinen, 43=kaikille maksuton
TULOSTEN_JULKAISUVELVOITE - TINYINT(2): lukuarvo välillä 51-53: 51=ei julkaisuvelvoitetta, 52=julkaisuvelvoite, 53=avoin julkaisuvelvoite
TUOTOKSIEN_JULKAISUVELVOITE - TINYINT(2): lukuarvo välillä 61-63: 61=ei saatavilla, 62=osittain saatavilla, 63=avoimesti saatavilla
OSAAMISEN_AVOIMUUS - TINYINT(2): lukuarvo välillä 71-73: 71=ei rekisteriä/koulutusta, 72=osittainen rekisteri ja opastus, 73=avoin rekisteri ja koulutus
SEURANTATYOKALUT - TINYINT(2): lukuarvo välillä 81-83: 81=ei seurantaa, 82=osittain seuranta, 83=avoin seuranta
TULOSTEN_LISENSOINTI - TINYINT(2): lukuarvo välillä 91-93: 91=ei lisensointia, 92=osittain lisensoitu, 93=avoin lisensointi
URLFI - VARCHAR(500): linkki suomenkielisiin käyttöehtoihin
URLEN - VARCHAR(500): linkki englanninkielisiin käyttöehtoihin

HUOM: Muuttujia on melko työläs/vaikea asettaa tutustumatta käyttöehtoihin tarkasti. Pohditaan pitäisikö jokainen arvo kysyä infroilta itseltään tietojen keruun yhteydessä. Sitä edellyttää vaihtoehtojen tarkka määrittely.
Lisäksi joissain infroissa on palvelukohtaisia tai jopa aineistokohtaisia käyttöehtoja (ja aineistoja satoja per infra), eli koko kompleksisuutta ei pystytä kirjaamaan. Joku muuttuja "useita ehtoja" tjms. kuvaamaan kompleksisuutta ja tähän laitettu arvo vain joku keskiarvo tjms.?
On tietenkin mahdollista, että käyttöehdot eivät kertakaikkiaan redusoidu tähän mittariin. Tämä kokeilu on kuitenkin hyvä käydä läpi ja kerätä kommentteja sidosryhmiltä.
*/

INSERT INTO infra.kayttoehto VALUES(1,23,32,43,51,61,NULL,NULL,NULL,NULL,'http://www.europeansocialsurvey.org/data/conditions_of_use.html');  -- ESS
INSERT INTO infra.kayttoehto VALUES(2,23,33,43,53,62,73,82,93,'http://www.helsinki.fi/finclarin/kaytto','http://www.helsinki.fi/finclarin/access');  -- FIN-CLARIN, useita urleja
INSERT INTO infra.kayttoehto VALUES(3,22,31,43,51,61,NULL,82,NULL,'http://wiki.helsinki.fi/display/FinELib/FinELib-aineistot','http://wiki.helsinki.fi/display/FinELib/FinELib-aineistot');  -- FinELib, useita urleja, aineistokohtaiset ehdot
INSERT INTO infra.kayttoehto VALUES(4,23,33,43,NULL,62,73,83,NULL,'https://www.finna.fi/Content/terms_conditions','https://www.finna.fi/Content/terms_conditions?lng=en-gb');  -- Finna, aineistokohtaiset ehdot
INSERT INTO infra.kayttoehto VALUES(5,22,32,42,NULL,NULL,73,82,NULL,NULL,NULL);  -- FMAS
INSERT INTO infra.kayttoehto VALUES(6,23,31,43,52,61,NULL,82,NULL,'https://services.fsd.uta.fi/docs/eula','https://services.fsd.uta.fi/docs/eula?lang=en');  -- FSD&CESSDA, useita urleja

INSERT INTO infra.kayttoehto VALUES(7,22,32,NULL,53,62,73,83,93,'https://www.csc.fi/fi/yleiset-kayttoehdot?inheritRedirect=true','https://www.csc.fi/general-terms-of-use?inheritRedirect=true');  -- TTA&KDK-PAS, palvelukohtaisia detaljeja

INSERT INTO infra.kayttoehto VALUES(8,23,32,43,NULL,NULL,NULL,NULL,NULL,NULL,'https://www.espas-fp7.eu/portal/dataPolicies.html');  -- EISCAT_3D
INSERT INTO infra.kayttoehto VALUES(9,23,33,43,NULL,NULL,NULL,NULL,NULL,NULL,NULL);  -- FIN-EPOS

-- INSERT INTO infra.kayttoehto VALUES(34,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);  -- FINMARI-euroargo
INSERT INTO infra.kayttoehto VALUES(10,22,32,42,52,62,72,82,NULL,NULL,NULL);  -- FINMARI-FINMARI
-- INSERT INTO infra.kayttoehto VALUES(35,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);  -- FINMARI-EMBRC

INSERT INTO infra.kayttoehto VALUES(11,23,33,43,51,61,73,83,93,NULL,NULL);  -- ICOS
INSERT INTO infra.kayttoehto VALUES(12,23,33,43,53,63,72,83,91,NULL,NULL);  -- INAR
INSERT INTO infra.kayttoehto VALUES(13,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);  -- oGIIR
INSERT INTO infra.kayttoehto VALUES(14,23,32,41,52,NULL,73,NULL,NULL, NULL, NULL);  -- BBMRI

INSERT INTO infra.kayttoehto VALUES(15,23,NULL,41,53,NULL,73,83,91,NULL,NULL);  -- biocenter.fi

INSERT INTO infra.kayttoehto VALUES(16,NULL,NULL,NULL,51,61,NULL,NULL,NULL,NULL,'http://www.eatris.eu/documents/EATRIS_General_Terms_and_Conditions.pdf');  -- EATRIS

INSERT INTO infra.kayttoehto VALUES(17,23,33,42,53,63,73,83,93,NULL,'http://www.elixir-europe.org');  -- ELIXIR, useita urleja
INSERT INTO infra.kayttoehto VALUES(18,21,33,41,NULL,NULL,73,83,NULL,NULL,NULL);  -- EuBI

INSERT INTO infra.kayttoehto VALUES(19,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);  -- EU-OPENSCREEN
INSERT INTO infra.kayttoehto VALUES(20,23,31,42,53,63,73,83,91,NULL,'https://www.infrafrontier.eu/resources-and-services/access-emma-mouse-resources');  -- INFRAFRONTIER
INSERT INTO infra.kayttoehto VALUES(21,21,31,42,53,62,73,83,92,NULL,NULL);  -- ICVIR/Instruct

INSERT INTO infra.kayttoehto VALUES(22,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);  -- NaPPI

INSERT INTO infra.kayttoehto VALUES(23,21,31,41,51,61,72,83,92,NULL,'http://www2.uef.fi/fi/bck/national-virus-vector-laboratory');  -- NVVL

INSERT INTO infra.kayttoehto VALUES(24,21,31,42,52,62,73,83,91,NULL,NULL);  -- MAX IV
INSERT INTO infra.kayttoehto VALUES(25,23,33,41,NULL,NULL,73,82,NULL,NULL,NULL);  -- OMN/otanano

INSERT INTO infra.kayttoehto VALUES(26,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);  -- XFEL&XBI

INSERT INTO infra.kayttoehto VALUES(27,22,NULL,41,52,62,72,NULL,NULL,NULL,'http://bioeconomy.aalto.fi/en/equipment/pricing/');  -- BIOECONOMY

INSERT INTO infra.kayttoehto VALUES(28,21,32,43,53,63,73,83,91,NULL,NULL);  -- CTA

INSERT INTO infra.kayttoehto VALUES(29,21,31,43,51,63,72,82,92,NULL,NULL);  -- Euclid

INSERT INTO infra.kayttoehto VALUES(30,21,31,42,52,62,72,82,91,NULL,'https://www.jyu.fi/fysiikka/en/research/accelerator/index_html/beamtime.html');  -- JYFL-ACCLAB
INSERT INTO infra.kayttoehto VALUES(31,22,31,42,52,62,72,83,NULL,'https://www.csc.fi/yleiset-kayttoehdot?inheritRedirect=true','https://www.csc.fi/general-terms-of-use?inheritRedirect=true');  -- CSC RI

INSERT INTO infra.kayttoehto VALUES(32,21,31,43,52,62,72,83,NULL,NULL,'http://www.prace-ri.eu/how-to-apply/');  -- PRACE
INSERT INTO infra.kayttoehto VALUES(33,22,31,43,52,62,73,82,91,NULL,NULL);  -- FGCI

/*
table_data_organisaatio.sql

ORGANISAATIO-TAULU: lista kaikista organisaatioista
INSERT INTO infra.organisaatio VALUES(ORGANISAATIO_ID,NIMI,NAME,MAA,ISNI,CRMID,EMO_ORGANISAATIO, KV_ISANTA);  -- comment
ORGANISAATIO_ID - BIGINT(20): juokseva numero, kannan sisäinen, uniikki, identifioi organisaation - VARCHAR(100): suomenkielinen nimi organisaatiolle (HUOM: aliorganisaatiot myös näiden kautta Turun yliopisto, Yhteiskuntatieteellinen tiedekunta)
NAME - VARCHAR(100): englanninkielinen nimi organisaatiolle
MAA - VARCHAR(2): kv-isäntämaan maakoodi, 2-kirjainta, noudattaa ISO 3166-1 -standardia (alpha1?).
ISNI - VARCHAR(150): vastuuorganisaation ISNI-koodi, jos olemassa, merkkijono: 16 numeroa. HUOM: 150-merkkiä tarpeettoman pitkä. HUOM2: joillekin yliopistojen laitoksillekin olemassa oma ISNI!
CRMID - VARCHAR(50): organisaation tunniste CSC:n sisäisessä CRM-järjestelmässä (myöhempi integraatiotarve?)
EMO_ORGANISAATIO - BIGINT(20): linkki mahdolliseen äiti-organisaatioon (esim. laitoksen linkki tiedekuntaan/yliopistoon)
KV_ISANTA - TINYINT(1): boolean-arvo joka kertoo onko kyseessä kv-infran isäntämaa -tyyppinen organisaation (esim. "Ruotsi") vai jokin muu (vain maat, ei organisaatiot)
*/

INSERT INTO infra.organisaatio VALUES(1,'Turun yliopisto','University of Turku','FI','0000 0001 2198 1512',NULL,NULL,0);  -- UTU, ESS, CTA
INSERT INTO infra.organisaatio VALUES(2,'Yhteiskuntatieteellinen tiedekunta','Faculty of Social Sciences','FI',NULL,NULL,1, 0);  -- UTU - yhteiskuntatieteellinen, ESS
INSERT INTO infra.organisaatio VALUES(3,'Yhdistynyt kuningaskunta','United Kingdom','GB',NULL,NULL,NULL, 1);  -- Iso-Britannia, ESS-ESFRI-isäntämaa, ELIXIR-esfri-isäntämaa, Instruct-esfri-isäntämaa
INSERT INTO infra.organisaatio VALUES(4,'Helsingin yliopisto','University of Helsinki','FI','0000 0004 0410 2071',NULL,NULL, 0);  -- HY, FIN-CLARIN, FinElib, Finna, FIN-EPOS, ICOS, INAR, biokeskus, EATRIS, EU-OPENSCREEN, Instruct
INSERT INTO infra.organisaatio VALUES(5,'Nykykielten laitos','Department of Modern Languages','FI',NULL,NULL,4, 0);  -- HY, FIN-CLARIN
INSERT INTO infra.organisaatio VALUES(6,'Alankomaat','Netherlands','NL',NULL,NULL,NULL, 1);  -- Alankomaat, FIN-CLARIN ESFRI-isäntämaa, EATRIS-esfri-isäntämaa
INSERT INTO infra.organisaatio VALUES(7,'Kansalliskirjasto','The National Library of Finland','FI','0000 0001 2033 7602',NULL,NULL, 0);  -- Kansalliskirjasto, FinElib, Finna
-- tästä välistä unohtui vahingossa kansallisarkisto FMAS-infran kohdalta. löytyy alempaa id:llä 40
INSERT INTO infra.organisaatio VALUES(8,'Tilastokeskus','Statistics Finland','FI','0000 0004 0410 5635',NULL,NULL, 0);  -- Tilastokeskus, FMAS
INSERT INTO infra.organisaatio VALUES(9,'Tampereen yliopisto','University of Tampere','FI','0000 0001 2314 6254',NULL,NULL, 0);  -- UTA, FSD&CESSDA
INSERT INTO infra.organisaatio VALUES(10,'Yhteiskuntatieteellinen tietoarkisto','Finnish Social Science Data Archive','FI',NULL,NULL,9, 0);  -- UTA, FSD&CESSDA
INSERT INTO infra.organisaatio VALUES(11,'Norja','Norway','NO',NULL,NULL,NULL, 1);  -- Norja, FSD&CESSDA, ESFRI-isäntämaa
INSERT INTO infra.organisaatio VALUES(12,'CSC - Tieteen tietotekniikan keskus','CSC - IT Center for Science','FI','0000 0004 0512 9137',NULL,NULL, 0);  -- CSC, TTA&KDK-PAS, ELIXIR, CSC-RI, PRACE
INSERT INTO infra.organisaatio VALUES(13,'Oulun yliopisto','University of Oulu','FI','0000 0001 0941 4873',NULL,NULL, 0);  -- OY, EISCAT_3D, INFRAFRONTIER-esfri-isäntämaa, XFEL&XBI
INSERT INTO infra.organisaatio VALUES(14,'Sodankylän geofysiikan observatorio','Sodankylä Geophysical Observatory','FI','0000 0000 9041 5920',NULL,13, 0);  -- OY, EISCAT_3D
INSERT INTO infra.organisaatio VALUES(15,'Ruotsi','Sweden','SE',NULL,NULL,NULL, 1);  -- Ruotsi, OY, EISCAT_3D ESFRI-isäntämaa, MAX IV -isäntämaa, FINMARI-esfri-isäntämaa
INSERT INTO infra.organisaatio VALUES(16,'Seismologian instituutti','Institute of Seismology','FI','0000 0001 2199 3193',NULL,4, 0);  -- HY, Seismologian instituutti, FIN-EPOS
-- tästä välistä unohtuivat FINMARIn tiedot, lisätty loppuun
INSERT INTO infra.organisaatio VALUES(17,'Italia','Italy','IT',NULL,NULL,NULL, 1);  -- Italia, HY, FIN-EPOS
INSERT INTO infra.organisaatio VALUES(18,'Ilmatieteen laitos','Finnish Meteorological Institute','FI','0000 0001 2253 8678',NULL,NULL, 0);  -- HY, Ilmatieteen laitos, ICOS
INSERT INTO infra.organisaatio VALUES(19,'Itä-Suomen yliopisto','University of Eastern Finland','FI','0000 0001 2114 3658',NULL,NULL, 0);  -- HY / Itä-Suomen yliopisto, ICOS, NVVL
INSERT INTO infra.organisaatio VALUES(20,'Suomi','Finland','FI',NULL,NULL,NULL, 1);  -- Suomi, ICOS ESFRI-isäntämaa
INSERT INTO infra.organisaatio VALUES(21,'Matemaattis-luonnontieteellinen tiedekunta','Faculty of Science','FI',NULL,NULL,4, 0);  -- HY, INAR

INSERT INTO infra.organisaatio VALUES(22,'Maanmittauslaitos','National Land Survey of Finland','FI','0000 0004 0494 894X',NULL,NULL, 0);  -- ogiir, maanmittauslaitos
-- lopussa vielä id:llä 66,67,68

INSERT INTO infra.organisaatio VALUES(23,'Terveyden ja hyvinvoinnin laitos','National Institute for Health and Welfare','FI','0000 0001 1013 0499',NULL,NULL, 0);  -- THL, BBMRI
INSERT INTO infra.organisaatio VALUES(24,'Itävalta','Austria','AT',NULL,NULL,NULL, 1);  -- Itävalta, BBMRI esfri-isäntämaa
-- lopussa vielä id:llä 69

INSERT INTO infra.organisaatio VALUES(25,'Suomen molekyylilääketieteen instituutti','Institute for Molecular Medicine Finland','FI','0000 0004 0409 5350',NULL,NULL, 0);  -- HY, Eatris. EU-OPENSCREEN
INSERT INTO infra.organisaatio VALUES(26,'Åbo Akademi','Åbo Akademi University','FI','0000 0001 2165 2639',NULL,NULL, 0);  -- ÅA, EuBI
INSERT INTO infra.organisaatio VALUES(27,'Saksa','Germany','DE',NULL,NULL,NULL, 1);  -- EuBI esfri-isäntämaa, EU-OPENSCREEN-esfri-isäntämaa, INFRAFRONTIER-esfri-isäntämaa, XFEL&SBI-esfri-isäntämaa, CTA-esfri-isäntämaa. EMBL
INSERT INTO infra.organisaatio VALUES(28,'Bio- ja ympäristotieteellinen tiedekunta','Faculty of Biological and Environmental Sciences','FI',NULL,NULL,4, 0);  -- HY, Instruct, NaPPI
INSERT INTO infra.organisaatio VALUES(29,'Biotekniikan instituutti','Institute of Biotechnology','FI',NULL,NULL,4, 0);  -- HY, Instruct
INSERT INTO infra.organisaatio VALUES(30,'A. I. Virtanen -instituutti','A. I. Virtanen Institute for Molecular Sciences','FI','0000 0000 9894 3445',NULL,19, 0);  -- A.I.Virtanen instituutti, NVVL
INSERT INTO infra.organisaatio VALUES(31,'Biokeskus Kuopio','Biocenter Kuopio','FI',NULL,NULL,19, 0);  -- biokeskus kuopio, NVVL
INSERT INTO infra.organisaatio VALUES(32,'Lundin yliopisto','Lund University','SE','0000 0001 0930 2361',NULL,NULL, 0);  -- MAX IV, LU
INSERT INTO infra.organisaatio VALUES(33,'Aalto-yliopisto','Aalto University','FI','0000 0001 0838 9418',NULL,NULL, 0);  -- AY, OMN, BIOECONOMY
INSERT INTO infra.organisaatio VALUES(34,'Biotekniikan ja kemian tekniikan laitos','Department of Biotechnology and Chemical Technology','FI',NULL,NULL,33, 0);  -- AY, BIOECONOMY
INSERT INTO infra.organisaatio VALUES(35,'Fysiikan ja tähtitieteen laitos','Department of Physics and Astronomy','FI',NULL,NULL,1, 0);  -- CTA, UTU
INSERT INTO infra.organisaatio VALUES(36,'Fysiikan laitos','Department of Physics','FI',NULL,NULL,4, 0);  -- HY, Euclid, FGCI, HUOM: ei erotu JyU:n samannimisestä laitoksesta
INSERT INTO infra.organisaatio VALUES(37,'Ranska','France','FR',NULL,NULL,NULL, 1);  -- HY, Euclid-esfri-isäntämaa, FINMARI-esfri-isäntämaa, ESRF
INSERT INTO infra.organisaatio VALUES(42,'Jyväskylän yliopisto','University of Jyväskylä','FI','0000 0001 2179 9569',NULL,NULL, 0);  -- JYFL-ACCLAB, JYU
INSERT INTO infra.organisaatio VALUES(38,'Fysiikan laitos','Department of Physics','FI',NULL,NULL,42, 0);  -- JYFL-ACCLAB, JYU HUOM: JyU pitää olla jo luotu (id 42)
INSERT INTO infra.organisaatio VALUES(39,'Belgia','Belgium','BE',NULL,NULL,NULL, 1);  -- Belgia, PRACE-esfri-isäntämaa
INSERT INTO infra.organisaatio VALUES(40,'Kansallisarkisto','National Archives','FI','0000 0001 2247 9225',NULL,NULL, 0);  -- Kansallisarkisto,FMAS
INSERT INTO infra.organisaatio VALUES(41,'Suomen ympäristökeskus','Finnish Environment Institute','FI','0000 0001 1019 1419',NULL,NULL, 0);  -- ympäristökeskus, FINMARI
-- lisää id:llä 54 - 60

INSERT INTO infra.organisaatio VALUES(43,'Opetus- ja kultuuriministeriö','Ministry of Education and Culture','FI','0000 0004 0410 3701',NULL,NULL, 0);  -- OKM, TTA&KDK-PAS
INSERT INTO infra.organisaatio VALUES(44,'Teknologian tutkimuskeskus VTT OY','VTT Technical Reserach Centre of Finland Ltd','FI','0000 0001 2106 1548',NULL,NULL, 0);  -- OMN, VTT
INSERT INTO infra.organisaatio VALUES(45,'Fysiikan tutkimuslaitos','Helsinki Institute of Physics','FI',NULL,NULL,4, 0);  -- comment
INSERT INTO infra.organisaatio VALUES(46,'Biotieteiden laitos','Department of Biosciences','FI',NULL,NULL,28, 0);  -- Instruct
INSERT INTO infra.organisaatio VALUES(47,'Oxfordin yliopisto','Oxford university','GB','0000 0004 1936 8948',NULL,NULL, 0);  -- Instruct
INSERT INTO infra.organisaatio VALUES(48,NULL,'Division of Structural Biology','GB',NULL,NULL,47, 0);  -- Instruct
INSERT INTO infra.organisaatio VALUES(49,'ELIXIR keskus','ELIXIR Hub','GB',NULL,NULL,NULL, 0);  -- ELIXIR

INSERT INTO infra.organisaatio VALUES(50,NULL,'Turku Bioimaging','FI',NULL,NULL,NULL, 0);  -- EuBI
INSERT INTO infra.organisaatio VALUES(51,NULL,'EuBI Hub ERIC Statutory Seat','FI',NULL,NULL,NULL, 0);  -- EuBI

INSERT INTO infra.organisaatio VALUES(52,NULL,'European XFEL GmbH, Hampuri','DE','0000 0004 0590 2900',NULL,NULL, 0);  -- XBI, XFEL
INSERT INTO infra.organisaatio VALUES(53,'Biokemian ja molekyylilääketieteen tiedekunta','Faculty of biochemistry and molecular medicine','FI',NULL,NULL,13, 0);  -- XFEL (yhteystiedoissa)

INSERT INTO infra.organisaatio VALUES(54,'Geologian tutkimuskeskus','Geological survey of Finland','FI','0000 0001 2375 3425',NULL,NULL, 0);  -- FINMARI
INSERT INTO infra.organisaatio VALUES(55,'Luonnonvarakeskus','Natural Resources Institute, Finland','FI','0000 0004 4668 6757',NULL,NULL, 0);  -- FINMARI
INSERT INTO infra.organisaatio VALUES(56,'Tvärminnen eläintieteellinen asema','Tvärminne Zoological Station','FI',NULL,NULL,4, 0);  -- FINMARI
INSERT INTO infra.organisaatio VALUES(57,'Saaristomeren tutkimuslaitos','Archipelago Research Institute','FI',NULL,NULL,1, 0);  -- FINMARI
INSERT INTO infra.organisaatio VALUES(58,'Husö biologiska station','Husö Biological Station','FI',NULL,NULL,26, 0);  -- FINMARI
INSERT INTO infra.organisaatio VALUES(59,NULL,'EMBRC - European Marine Biological Resource Centre','FR',NULL,NULL,NULL, 0);  -- FINMARI
INSERT INTO infra.organisaatio VALUES(60,NULL,'Euro-Argo','FR',NULL,NULL,NULL, 0);  -- FINMARI

INSERT INTO infra.organisaatio VALUES(61,'CLARIN ERIC','CLARIN ERIC','NL',NULL,NULL,NULL, 0);  -- FIN-CLARIN, isäntä-infra

INSERT INTO infra.organisaatio VALUES(62,NULL,'INFRAFRONTIER GmbH','DE',NULL,NULL,NULL,0);  -- INFRAFRONTIER, isäntä-infra
INSERT INTO infra.organisaatio VALUES(63,NULL,'Biocenter Oulu','FI',NULL,NULL,13, 0);  -- INFRAFRONTIER

INSERT INTO infra.organisaatio VALUES(64,NULL,'PRACE AISBL','BE',NULL,NULL,NULL, 0);  -- PRACE
INSERT INTO infra.organisaatio VALUES(65,NULL,'Forschungzentrum Jülich','DE',NULL,NULL,NULL,0);  -- PRACE

INSERT INTO infra.organisaatio VALUES(66,'Paikkatietokeskus','Finnish Geospatial Research Institute','FI','0000 0001 0791 6570',NULL,22, 0);  -- FGI, oGIIR; paikkatietokeskus (maanmittauslaitos)
INSERT INTO infra.organisaatio VALUES(67,'Maantieteen ja geologian laitos','Department of Geography and Geology','FI',NULL,NULL,1, 0);  -- oGIIR
INSERT INTO infra.organisaatio VALUES(68,'Maankäyttötieteiden laitos','Department of Real Estate, Planning and Geoinformatics','FI',NULL,NULL,33, 0);  -- oGIIR

INSERT INTO infra.organisaatio VALUES(69,'BBMRI ERIC','BBMRI ERIC','AT',NULL,NULL,NULL, 0);  -- BBMRI-ERIC, isäntä-infra

INSERT INTO infra.organisaatio VALUES(70,'Biokeskus Suomi','Biocenter Finland','FI',NULL,NULL,NULL, 0);  -- biokeskus suomi

INSERT INTO infra.organisaatio VALUES(71, 'Suomen Akatemia', 'Academy of Finland', 'FI', NULL, NULL, NULL, 0); -- ESRF 'Luodaan erikseen', 'Euroopan synkrotronisäteilytutkimuslaitos', 'European Synchrotron Radiation Facility', 'FR'
-- INSERT INTO infra.organisaatio VALUES(72, 'Helsingin yliopisto', 'University of Helsinki', 'FI', '404102071', NULL, NULL, 0); -- IODP 'Luodaan erikseen',
INSERT INTO infra.organisaatio VALUES(72, 'Geotieteiden ja maantieteen laitos', 'Department of Geoscience and Geography', 'FI', '404102071', NULL, NULL, 0); -- IODP
INSERT INTO infra.organisaatio VALUES(73, 'Geologian tutkimuskeskus', 'Geological Survey of Finland', 'FI', NULL, NULL, NULL, 0); -- IODP
INSERT INTO infra.organisaatio VALUES(74, 'Merigeologia', 'Marine geology', 'FI', NULL, NULL, NULL, 0); -- IODP

INSERT INTO infra.organisaatio VALUES(75, 'Luonnontieteellinen keskusmuseo Luomus', 'Finnish Museum of Natural History', 'FI', NULL, NULL, 4, 0); -- FinBIF 'Luodaan erikseen'

INSERT INTO infra.organisaatio VALUES(76, 'EMBL (Heidelberg)', 'EMBL (Heidelberg)', 'DE', NULL, NULL, NULL, 0); -- EMBL 'Luodaan erikseen'
INSERT INTO infra.organisaatio VALUES(77, 'European Bioinformatics Institute (EMBL-EBI)', 'European Bioinformatics Institute (EMBL-EBI)', 'UK', NULL, NULL, NULL, 0); -- EMBL
INSERT INTO infra.organisaatio VALUES(78, 'EMBL Grenoblen yksikkö', 'EMBL Grenoble outstation', 'FR', NULL, NULL, NULL, 0); -- EMBL
INSERT INTO infra.organisaatio VALUES(79, 'EMBL Hampurin yksikkö', 'EMBL Hamburg outstation', 'DE', NULL, NULL, NULL, 0); -- EMBL
INSERT INTO infra.organisaatio VALUES(80, 'EMBL Monterotondon yksikkö', 'EMBL Monterotondo outstation', 'IT', NULL, NULL, NULL, 0); -- EMBL

-- INSERT INTO infra.organisaatio VALUES(4, 'Helsingin yliopisto', 'University of Helsinki', 'FI', '404102071', NULL, NULL, 0); -- SC-infra
INSERT INTO infra.organisaatio VALUES(81, 'Suomen Molekyylilääketieteen Instituutti', 'Institute of Molecular Medicine Finland (FIMM)', 'FI', NULL, NULL, 4, 0); -- SC-infra
INSERT INTO infra.organisaatio VALUES(82, 'Biotekniikan Instituutti', 'Institute of Biotechnology (BI)', 'FI', NULL, NULL, 4, 0); -- SC-infra
INSERT INTO infra.organisaatio VALUES(83, 'Immunobiologian tutkimusohjelma', 'Research Programs Unit, Immunobiology (RPU)', 'FI', NULL, NULL, 4, 0); -- SC-infra
-- INSERT INTO infra.organisaatio VALUES(1, 'Turun yliopisto', 'University of Turku', 'FI', NULL, NULL, NULL, 0); -- SC-infra
INSERT INTO infra.organisaatio VALUES(84, 'Turun Biotekniikan Keskus', 'Biocity Turku (BCT)', 'FI', NULL, NULL, 1, 0); -- SC-infra

INSERT INTO infra.organisaatio VALUES(85, 'Jyväskylän yliopisto', 'University of Jyväskylä', 'FI', '121799569', NULL, NULL, 0); -- HIM
INSERT INTO infra.organisaatio VALUES(86, 'Bio- ja ympäristötieteiden laitos', 'Department of Biological and Environmental Science', 'FI', '121799570', NULL, NULL, 0); -- HIM
-- INSERT INTO infra.organisaatio VALUES(92, 'Turun yliopisto', 'University of Turku', 'FI', NULL, NULL, NULL, NULL, ); -- ESO  'Euroopan eteläinen observatorio', 'European Southern Observatory ', 'DE'
INSERT INTO infra.organisaatio VALUES(87, 'Suomen ESO-keskus (FINCA)', 'Finnish Centre for Astronomy with ESO (FINCA)', 'FI', NULL, NULL, NULL, 0); -- ESO 'Euroopan eteläinen observatorio', 'European Southern Observatory ', 'DE'
INSERT INTO infra.organisaatio VALUES(88, 'Lappeenrannan teknillinen yliopisto', 'Lappeenranta University of Technology', 'FI', NULL, NULL, NULL, 0); -- NextGenTH 'LUT School of Energy Systems, Ydintekniikka', 'LUT School of Energy Systems, Nuclear Engineering',
INSERT INTO infra.organisaatio VALUES(89, 'LUT School of Energy Systems, Ydintekniikka', 'LUT School of Energy Systems, Nuclear Engineering', 'FI', NULL, NULL, 88, 0); -- NextGenTH 'LUT School of Energy Systems, Ydintekniikka', 'LUT School of Energy Systems, Nuclear Engineering',
-- INSERT INTO infra.organisaatio VALUES(96, 'Helsingin yliopisto', 'Univeristy of Helsinki', '404102071', NULL, NULL, NULL, NULL, NULL, NULL); -- CERN
INSERT INTO infra.organisaatio VALUES(90, 'Fysiikan tutkimuslaitos', 'Department of Physics', 'FI', '404102071', NULL, NULL, 0); -- CERN
INSERT INTO infra.organisaatio VALUES(91, 'Helsingin yliopisto', 'University of Helsinki', 'FI', '404102071', NULL, NULL, 0); -- FAIR
INSERT INTO infra.organisaatio VALUES(92, 'Fysiikan tutkimuslaitos', 'Department of Physics', 'FI', '404102071', NULL, NULL, 0); -- FAIR
INSERT INTO infra.organisaatio VALUES(94, 'Suomen Akatemia', 'Academy of Finland', 'FI', NULL, NULL, NULL, 0); -- NOT 'Spanish Observatorio del Roque de los Muchachos, La Palma, Canarias', 'ES'
INSERT INTO infra.organisaatio VALUES(98, 'Tuorlan observatorio', 'Tuorla observatory', 'FI', NULL, NULL, 1, 0); -- NOT - aliorganisaatio 'Spanish Observatorio del Roque de los Muchachos, La Palma, Canarias', 'ES'
INSERT INTO infra.organisaatio VALUES(99, 'CSC - Tieteen tietotekniikan keskus Oy', 'CSC - IT Center for Science Ltd.', 'FI', NULL, NULL, NULL, 0); -- NeIC 'Nordforsk', 'Nordforsk', 'NO'
INSERT INTO infra.organisaatio VALUES(100,'Tanska','Denmark','DK',NULL,NULL,NULL, 1);  -- Denmark, GBIF
INSERT INTO infra.organisaatio VALUES(101,'Espanja','Spain','ES',NULL,NULL,NULL, 1);  -- Spain, NOT
INSERT INTO infra.organisaatio VALUES(102,'Nordforsk','Nordforsk','NO',NULL,NULL,NULL, 0);  -- Spain, NOT
INSERT INTO infra.organisaatio VALUES(103, 'Maailman Lajitietokeskus', 'Global Biodiversity Information Facility', NULL, NULL, NULL, 100, 0); -- GBIF 'Maailman Lajitietokeskus', 'Global Biodiversity Information Facility', 'DK'



/*
table_data_yhteystieto.sql

YHTEYSTIETO-TAULU: lista kaikista yhteystiedoista
INSERT INTO infra.yhteystieto VALUES(YHTEYSTIETO_ID,SAHKOPOSTI,AFFILIAATIO,PUHELIN,TITTELI,ETUNIMI,SUKUNIMI, URL, KUVAUS, DESCRIPTION);  -- comment
YHTEYSTIETO_ID - BIGINT(20): juokseva numero, kannan sisäinen, uniikki, identifioi yhteystiedon: linkki organisaatio-tauluun
SAHKOPOSTI - VARCHAR(100)
AFFILIAATIO - BIGINT(20): linkki organisaatio-tauluun
PUHELIN - VARCHAR(50)
TITTELI - VARCHAR(50)
ETUNIMI - VARCHAR(50)
SUKUNIMI - VARCHAR(50)
URL - VARHCHAR(300): linkki esim. yhteystieto-sivulle
KUVAUS - VARHCHAR(300): selittää tarvittaessa yhteystietotyyppiä (esim. tekninen vs. hallinnollinen kontakti, eri palveluiden omat kontaktit jne.)
DESCRIPTION- VARHCHAR(300): sama kuin kuvaus, mutta englanninkielinen
*/


/*
yhteystieto -taulu
*/
INSERT INTO infra.yhteystieto VALUES(1,'heikki.ervasti@utu.fi',1,NULL,'professori','Heikki','Ervasti', NULL, NULL, NULL);  -- ESS

INSERT INTO infra.yhteystieto VALUES(2,'fin-clarin@helsinki.fi',NULL,NULL,NULL,NULL,NULL, NULL, NULL, NULL);  -- FIN-CLARIN
-- lisää fin-clarin yhteystietoja lopussa id:llä 65 ja 66

INSERT INTO infra.yhteystieto VALUES(3,'finelib@helsinki.fi',NULL,NULL,NULL,NULL,NULL, 'http://www.kansalliskirjasto.fi/fi/kirjastoala/finelib.html', 'palveluosoite', 'service email address');  -- FinElib
-- lisää FinElib-tietoja lopussa id:llä 67

INSERT INTO infra.yhteystieto VALUES(4,'finna-posti@helsinki.fi',NULL,NULL,NULL,NULL,NULL, NULL, 'palveluposti', 'service desk');  -- Finna
-- Finnalle myös ID 67:n yhteystieto
-- INSERT INTO infra.yhteystieto VALUES(5,'erkki.tolonen@helsinki.fi',4,NULL,NULL,'Erkki','Tolonen', NULL, NULL, NULL);  -- Finna, tämä poistettiin

INSERT INTO infra.yhteystieto VALUES(6,NULL,NULL,NULL,NULL,NULL,NULL, 'http://www.fmas-foorumi.fi', NULL, NULL);  -- FMAS
-- INSERT INTO infra.yhteystieto VALUES(6,'kati.haanpaa@narc.fi',40,'029 533 7039','erikoistutkija','Kati','Haanpää', NULL, 'käytettävyysasiantuntija', 'usability expert');  -- FMAS, tämä poistettiin

INSERT INTO infra.yhteystieto VALUES(7,'asiakaspalvelu.fsd@uta.fi',NULL,NULL,NULL,NULL,NULL, NULL, NULL, NULL);  -- FSD&CESSDA

INSERT INTO infra.yhteystieto VALUES(8,'avointiede@postit.csc.fi',NULL,NULL,NULL,NULL,NULL, 'http://avointiede.fi/ota-yhteytta', NULL, NULL);  -- TTA&KDK-PAS
INSERT INTO infra.yhteystieto VALUES(9,'minna.karvonen@minedu.fi',43,NULL,'pääsihteeri','Minna','Karvonen', NULL, NULL, NULL);  -- TTA&KDK-PAS
INSERT INTO infra.yhteystieto VALUES(10,'pirjo-leena.forsstrom@csc.fi',NULL,NULL,'pääsihteeri','Pirjo-Leena','Forsström', NULL, NULL, NULL);  -- TTA&KDK-PAS
-- INSERT INTO infra.yhteystieto VALUES(11,'kimmo.koivunen@csc.fi',12,NULL,'kehityspäällikkö','Kimmo','Koivunen', NULL, 'KDK:n PAS-palvelu', 'NDL''s Digital Preservation Service');  -- TTA&KDK-PAS

INSERT INTO infra.yhteystieto VALUES(12,NULL,NULL,'+46 980 79150',NULL,NULL,NULL, NULL, NULL, 'EISCAT Scientific Association');  -- EISCAT
-- contact form url lopussa id:llä 57
INSERT INTO infra.yhteystieto VALUES(13,'jussi.i.markkanen@gmail.com',NULL,'040 866 9096',NULL,'Jussi','Markkanen', NULL, 'EISCAT', NULL);  -- EISCAT

INSERT INTO infra.yhteystieto VALUES(14,'epos.secretariat@ingv.it',NULL,NULL,NULL,NULL,NULL, 'http://www.epos-eu.org/', 'EPOS on hajautettu eurooppalainen geotieteellinen tutkimusinfrastruktuuri ja datakeskus, joka muodostuu kansallisista mittausasemista, dataverkoista, kansainvälisistä tietokeskuksista ja toimintaa koordinoivasta eurooppalaisesta päämajasta.', 'EPOS is a long-term plan for the integration of national and transnational Research Infrastructures for solid Earth science in Europe to provide seamless access to data, services and facilities. EPOS is under construction with help of H2020 financing. EPOS will be ready to serve in 2019.');  -- EPOS

INSERT INTO infra.yhteystieto VALUES(15,'timo.tamminen@environment.fi',41,NULL,NULL,'Timo','Tamminen', NULL, NULL, 'FINMARI coordinator');  -- FINMARI

INSERT INTO infra.yhteystieto VALUES(16,'jouni.heiskanen@helsinki.fi',4,'+358 44355 5548','FT','Jouni','Heiskanen', 'http://www.helsinki.fi/metsaymparisto/staff/en/en_jouni.html', 'koordinaattori', 'Coordinator');  -- ICOS
INSERT INTO infra.yhteystieto VALUES(17,'tuomas.laurila@fmi.fi',18,'+358 50367 1305',NULL,'Tuomas','Laurila', NULL, 'ryhmäpäällikkö', 'Head of Research Group');  -- ICOS
INSERT INTO infra.yhteystieto VALUES(18,'timo.vesala@helsinki.fi',4,'+358 40577 9008','Akatemiaprofessori','Timo','Vesala', 'http://www.helsinki.fi/metsaymparisto/staff/en/en_timo.html', 'johtaja', 'Director');  -- ICOS

INSERT INTO infra.yhteystieto VALUES(19,'markku.kulmala@helsinki.fi',4,'09 191 50756','research unit leader','Markku','Kulmala', 'http://www.atm.helsinki.fi/FCoE/index.php/atm-research-unit', NULL, NULL);  -- INAR

-- oGIIR puuttuu?

INSERT INTO infra.yhteystieto VALUES(20,'Anu.Jalanko@thl.fi',23,NULL,NULL,'Anu','Jalanko', NULL, NULL,NULL);  -- BBMRI.fi
-- lopussa id:llä 76

INSERT INTO infra.yhteystieto VALUES(21,'olli.janne@helsinki.fi',4,'+358 2941 25040','johtaja','Olli','Jänne', 'http://www.biocenter.fi', 'professori, johtaja', 'Professor, Director');  -- biokeskus
INSERT INTO infra.yhteystieto VALUES(22,'bf-biocenter@helsinki.fi',4,'+358 50 4488 600','suunnittelija','Maria','Jokila', NULL, NULL, NULL);  -- biokeskus

INSERT INTO infra.yhteystieto VALUES(23,'andreas.scherer@helsinki.fi',25,'+358 50 448 7257',NULL,NULL,NULL, NULL, NULL, NULL);  -- EATRIS
INSERT INTO infra.yhteystieto VALUES(24,'info@eatris.fi',NULL,NULL,NULL,NULL,NULL, NULL, NULL, NULL);  -- EATRIS

INSERT INTO infra.yhteystieto VALUES(25,'servicedesk@csc.fi',NULL,'09 457 2821',NULL,NULL,NULL, 'http://www.csc.fi', 'CSC - Tieteen tietotekniikan keskus', 'CSC - IT Center for Science');  -- ELIXIR
-- lopussa id:llä 72 -- ELIXIR

INSERT INTO infra.yhteystieto VALUES(26,NULL,50,NULL,'Project Manager','Pasi','Kankaanpää', NULL, NULL, NULL);  -- EuBI
INSERT INTO infra.yhteystieto VALUES(27,NULL,50,'+358 2 333 7059','koordinaattori','Inga','Pukonen', NULL, NULL, NULL);  -- EuBI
INSERT INTO infra.yhteystieto VALUES(28,NULL,1,'+358 50 409 6642','koordinaattori','Petra','Miikkulainen', NULL, NULL, NULL);  -- EuBI
-- INSERT INTO infra.yhteystieto VALUES(28,'tbi-office@bioimaging.fi',NULL,NULL,NULL,NULL,NULL, NULL, NULL, NULL);  -- EuBI

INSERT INTO infra.yhteystieto VALUES(29,'office@eu-openscreen.eu',NULL,NULL,NULL,NULL,NULL, NULL, NULL, 'General enquiries');  -- EU-OPENSCREEN
INSERT INTO infra.yhteystieto VALUES(30,'gribbon@eu-openscreen.eu',NULL,NULL,'Dr.','Philip','Gribbon', NULL, NULL, NULL);  -- EU-OPENSCREEN
INSERT INTO infra.yhteystieto VALUES(31,'krister.wennerberg@fimm.fi',25,'+358 50 415 4900',NULL,'Krister','Wennerberg', NULL, NULL, NULL);  -- EU-OPENSCREEN
INSERT INTO infra.yhteystieto VALUES(32,'janna.saarela@fimm.fi',25,'+358 40 5123 801',NULL,'Janna','Saarela', NULL, NULL, NULL);  -- EU-OPENSCREEN
INSERT INTO infra.yhteystieto VALUES(33,'carina.vonschantz-fant@fimm.fi',25,'+358 50 317 5433',NULL,'Carina','von Schantz-Fant', NULL, NULL, NULL);  -- EU-OPENSCREEN

INSERT INTO infra.yhteystieto VALUES(35,'raija.soininen@oulu.fi',13,'+358 8 537 6135','Dr, Dosentti','Raija','Soininen', 'http://www.oulu.fi/biocenter/tg-core', 'Koordinaattori, Biocenter Oulu Tg core facility', 'Coordinator of Biocenter Oulu Tg core facility, Member of the Infrafrontier management group');  -- INFRAFRONTIER
INSERT INTO infra.yhteystieto VALUES(36,NULL,NULL,NULL,NULL,NULL,NULL, 'https://www.infrafrontier.eu', NULL, NULL);  -- INFRAFRONTIER

-- INSERT INTO infra.yhteystieto VALUES(37,NULL,NULL,'+44 (0) 1865 287 711',NULL,NULL,NULL, NULL, NULL, NULL);  -- Instruct
INSERT INTO infra.yhteystieto VALUES(37,'admin@structuralbiology.eu',48,'+44 (0) 1865 287 711',NULL,NULL,NULL, 'http://www.structuralbiology.eu/update/contact-us', NULL, 'Instruct Hub: core admin team');  -- Instruct
INSERT INTO infra.yhteystieto VALUES(38,'dennis.bamford@helsinki.fi',46,'+358 (0) 2941 59100','Academy professor/Akatemiaprofessori','Dennis','Bamford', 'https://www.structuralbiology.eu/update/centre/centre-for-virus-production', 'ICVIR–keskuksen johtaja, tieteellinen yhteyshenkilö', 'ICVIR Centre Director, scientific contact');  -- Instruct (coordinator), ICVIR
INSERT INTO infra.yhteystieto VALUES(39,'hanna.oksanen@helsinki.fi',46,'+358 (0) 2941 59104','Docent/Dosentti','Hanna M.','Oksanen', 'https://www.structuralbiology.eu/update/centre/centre-for-virus-production', 'ICVIR–keskuksen varajohtaja, tekninen ja hallinnollinen yhteyshenkilö', 'ICVIR Centre deputy Director, technical and admin contact');  -- Instruct (deputy coordinator)
INSERT INTO infra.yhteystieto VALUES(40,'katri.eskelin@helsinki.fi',46,'+358 (0) 2941 59558','Docent/Dosentti','Katri','Eskelin', 'https://www.structuralbiology.eu/update/centre/centre-for-virus-production', 'ICVIR-keskuksen hallintokoordinaattori, tekninen ja hallinnollinen yhteyshenkilö', 'ICVIR administrative coordinator, technical and admin contact');  -- Instruct (admin/technical contact)

INSERT INTO infra.yhteystieto VALUES(41,'kristiina.himanen@helsinki.fi',4,NULL,'project manager','Kristiina','Himanen', NULL, NULL, NULL);  -- NaPPI

INSERT INTO infra.yhteystieto VALUES(42,'seppo.ylaherttuala@uef.fi',19,'+358 40 355 2075','Director','Seppo','Ylä-Herttuala', NULL, NULL, 'director, coordinator');  -- NVVL

INSERT INTO infra.yhteystieto VALUES(43,NULL,13,NULL,'Prof.','Markku','Huttula', 'http://www.oulu.fi/yliopisto', 'Suomen kansallinen vastuuorganisaatio', NULL);  -- MAX IV
-- INSERT INTO infra.yhteystieto VALUES(43,'maxlab@maxlab.lu.se',NULL,NULL,NULL,NULL,NULL, NULL, NULL, 'reception');  -- MAX IV
-- puhelin ja kontakti-URL siirretty loppuu id:lle 59 ja 60
-- INSERT INTO infra.yhteystieto VALUES(59,NULL,NULL,'+46 (0) 46 222 98 72',NULL,NULL,NULL, NULL, NULL, NULL);  -- MAX IV
-- INSERT INTO infra.yhteystieto VALUES(60,NULL,NULL,NULL,NULL,NULL,NULL, 'https://lucat.lu.se/LucatWeb/MainServlet?task=view_english_organization_information011012005', NULL, 'Contact list');  -- MAX IV

INSERT INTO infra.yhteystieto VALUES(44,'mika.koskenvuori@aalto.fi',33,'+358 50 381 1802','director','Mika','Koskenvuori', NULL, NULL, 'OtaNano coordination and Otanano - Micronova');  -- OMN/otanano
INSERT INTO infra.yhteystieto VALUES(45,'alexander.savin@aalto.fi',33,'+358 50 344 2752','staff scientist','Alexander','Savin', 'http://ltl.aalto.fi', NULL, 'laboratory manager, OtaNano – Low temperature laboratory');  -- OMN/otanano
-- id:lle 71
INSERT INTO infra.yhteystieto VALUES(46,'janne.ruokolainen@aalto.fi',33,'+358 50 347 0759','director','Janne','Ruokolainen', NULL, NULL, 'OtaNano – Nanomicroscopy Center');  -- OMN/otanano
INSERT INTO infra.yhteystieto VALUES(47,'heini.saloniemi@vtt.fi',44,'+358 20 722 4541','team leader','Heini','Saloniemi', NULL, NULL, 'OtaNano - VTT at Micronova');  -- OMN/otanano

INSERT INTO infra.yhteystieto VALUES(48,'inari.kursula@oulu.fi',53,'+49-40-89986862','Prof.','Inari','Kursula', 'http://www.oulu.fi/fbmm/', NULL, NULL);  -- XFEL&XBI
-- idlle: 73

INSERT INTO infra.yhteystieto VALUES(49,'anu.kaukovirta-norja@vtt.fi',44,'+358 40 525 7492','Vice president operations','Anu','Kaukovirta-Norja', NULL, NULL, NULL);  -- BIOECONOMY
INSERT INTO infra.yhteystieto VALUES(50,'mika.harkonen@vtt.fi',44,'+358 20 722 2942','Principal scientist','Mika','Härkönen', NULL, NULL, NULL);  -- BIOECONOMY
INSERT INTO infra.yhteystieto VALUES(51,'jaana.rich@aalto.fi',33,'+358 50 408 1988','manager, technical services','Jaana','Rich', NULL, NULL, NULL);  -- BIOECONOMY

-- INSERT INTO infra.yhteystieto VALUES(52,'tabegg@lsw.uni-heidelberg.de',NULL,NULL,'Prof. Doc.','Werner','Hofmann', NULL, NULL, 'Managing director');  -- CTA
INSERT INTO infra.yhteystieto VALUES(52,'aimosill@utu.fi',1,'02-3338289','Dr.','Aimo','Sillanpää', NULL, 'hallinto', 'management');  -- CTA
-- lopussa id:llä 70 lisää

INSERT INTO infra.yhteystieto VALUES(53,NULL,NULL,NULL,NULL,NULL,NULL, 'http://www.euclid-ec.org/?page_id=1184', 'Euclid-konsortion kansalliset yhteystiedot', NULL);  -- Euclid

INSERT INTO infra.yhteystieto VALUES(54,'ari.jokinen@jyu.fi',38,'+358 50 5399468','Professori','Ari','Jokinen', NULL, 'JYFL-ACCLAB johtaja', 'Director of the JYFL-ACCLAB');  -- JYFL-ACCLAB
-- INSERT INTO infra.yhteystieto VALUES(54,NULL,42,'+358 40 805 4356',NULL,NULL,NULL, NULL, 'Fysiikan laitos', 'Department of Physics');  -- JYFL-ACCLAB
-- yhteystietoURLit siirretty loppuun ID:lle 61 ja 62

INSERT INTO infra.yhteystieto VALUES(55,'servicedesk@csc.fi',NULL,'09 457 2821',NULL,NULL,NULL, 'https://research.csc.fi/support', 'Service Desk', 'Service Desk');  -- CSC-RI
-- switchboard siirretty loppuun ID:lle 63

INSERT INTO infra.yhteystieto VALUES(56,'M.Oorsprong(at)staff.prace-ri.eu',NULL,'+32 2 613 09 27','Communications Officer','Marjolein','Oorsprong', 'http://www.prace-ri.eu/prace-office/', 'PRACE aisbl toimisto', 'PRACE aisbl office');  -- PRACE
-- project management office siirretty loppuun ID:lle 64
INSERT INTO infra.yhteystieto VALUES(57,NULL,NULL,NULL,NULL,NULL,NULL, 'https://eiscat3d.se/contact', NULL, 'contact form');  -- EISCAT

-- INSERT INTO infra.yhteystieto VALUES(61,NULL,42,NULL,NULL,NULL,NULL,'https://www.jyu.fi/fysiikka/en/personnel', 'henkilökunnan yhteystiedot', 'personnel contact information');  -- JYFL-ACCLAB
-- INSERT INTO infra.yhteystieto VALUES(62,NULL,42,NULL,NULL,NULL,NULL,'https://www.jyu.fi/fysiikka/en/research/infrastructures/table-of-research-infrastructures', 'vastuuhenkilöt kullekin tutkimuslaitteelle', NULL);  -- JYFL-ACCLAB

INSERT INTO infra.yhteystieto VALUES(63,NULL,NULL,'+358 (0)9 457 2001',NULL,NULL,NULL, 'https://www.csc.fi/yhteystiedot', 'puhelinvaihde', 'switchboard');  -- CSC-RI

INSERT INTO infra.yhteystieto VALUES(64,'f.berberich(at)fz-juelich.de',64,'+49 2461 61 2547','PRACE Project Manager','Florian','Berberich', 'http://www.prace-ri.eu/contact-prace', 'PRACE Project Management Office', 'PRACE Project Management Office');  -- PRACE
-- lopussa id:llä 79

INSERT INTO infra.yhteystieto VALUES(65,NULL,NULL,NULL,NULL,NULL,NULL,'http://www.helsinki.fi/finclarin/yhteystiedot', NULL, NULL);  -- FIN-CLARIN
INSERT INTO infra.yhteystieto VALUES(66,NULL,NULL,NULL,NULL,NULL,NULL,'http://www.helsinki.fi/finclarin/contactinfo', NULL, NULL);  -- FIN-CLARIN

INSERT INTO infra.yhteystieto VALUES(67,'kristiina.hormia@helsinki.fi',NULL,'+358 5055 23056','johtaja','Kristiina','Hormia-Poutanen', NULL, 'vastuullinen johtaja', 'principal director');  -- FinELib, Finna

INSERT INTO infra.yhteystieto VALUES(68,NULL,36,'+358-2-94150007','PhD, Professor, Vice dean ','Kai','Nordlund', NULL, NULL, NULL);  -- FGCI

INSERT INTO infra.yhteystieto VALUES(69,'fin-epos@helsinki.fi',NULL,'0294151606','National co-ordinator','Annakaisa','Korja', 'http://www.helsinki.fi/geo/', NULL, NULL);  -- comment

INSERT INTO infra.yhteystieto VALUES(70,'elilin@utu.fi',1,'02-3338945','Dr.','Elina','Lindfors',NULL,'koordinaattori','coordinator');  -- CTA

INSERT INTO infra.yhteystieto VALUES(71,'vladimir.eltsov@aalto.fi',33,'+358 50 344 2428','senior scientist','Vladimir','Eltsov', 'http://ltl.aalto.fi', NULL, 'sub-mK facilities, OtaNano - Low temperature laboratory');  -- comment

INSERT INTO infra.yhteystieto VALUES(72,'tommi.nyronen@csc.fi',12,NULL,'Dos.','Tommi Henrik','Nyrönen', NULL, 'ELIXIR keskuksen johtaja', 'ELIXIR Head of Node');  -- ELIXIR

INSERT INTO infra.yhteystieto VALUES(73,'inari.kursula@xfel.eu',52,NULL,NULL,NULL,NULL,NULL,NULL,NULL);  -- XBI&XFEL

INSERT INTO infra.yhteystieto VALUES(74,'tapani.sarjakoski@nls.fi',66,'+358 40 755 4852','Professori','Tapani','Sarjakoski', 'http://www.fgi.fi/fgi/fi/tutkimus/osasto/geoinformatiikka-ja-kartografia', 'Koordinaattori', 'coordinator');  -- ogiir
INSERT INTO infra.yhteystieto VALUES(75,'risto.kalliola@utu.fi',1,'+358 50 597 5929','Professori','Risto','Kalliola', 'http://www.utu.fi/fi/yksikot/sci/yksikot/maageo/Sivut/home.aspx', 'Varakoordinaattori', 'deputy coordinator');  -- ogiir

INSERT INTO infra.yhteystieto VALUES(76,'Paivi.Laiho@thl.fi',23,NULL,'Senioritutkija','Päivi','Laiho', NULL, NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.yhteystieto VALUES(77,'info@bbmri.fi',NULL,NULL,NULL,NULL,NULL, 'http://www.bbmri.fi', NULL, NULL);  -- BBMRI.fi
INSERT INTO infra.yhteystieto VALUES(78,'contact@bbmri-eric.eu',NULL,NULL,NULL,NULL,NULL, 'http://www.bbmri-eric.eu', NULL, NULL);  -- BBMRI.fi

INSERT INTO infra.yhteystieto VALUES(79,'janne.ignatius(at)csc.fi',12,'+358 9 457 2224','Director','Janne','Ignatius', 'http://www.csc.fi', 'PRACE (Finnish partner)', 'PRACE (Finnish partner)');  -- PRACE

INSERT INTO infra.yhteystieto VALUES(80, 'ritva.taurio@aka.fi', 71, '+358 29 533 5115', 'Johtava tiedeasiantuntija', 'Ritva', 'Taurio', 'www.aka.fi', 'ESRF:n hallinto- ja finanssikomitean jäsen', 'Member of Administrative and Finance Committee (AFC) in ESRF'); -- ESRF"  'Suomen Akatemia', 'Luodaan erikseen (SA)',
INSERT INTO infra.yhteystieto VALUES(81, 'keijo.hamalainen@helsinki.fi', 4, '+358 2941 22216', 'Professori', 'Keijo', 'Hämäläinen', 'www.helsinki.fi', 'ESRF:n neuvoston jäsen 2016 - 2018', 'Member of ESRF Council 2016 - 2018'); -- ESRF" 'Helsingin yliopisto',
INSERT INTO infra.yhteystieto VALUES(82, 'outi.hyttinen@helsinki.fi', 4, '+358 40 536 2372', 'Tutkija', 'Outi ', 'Hyttinen', 'www.helsinki.fi', NULL, NULL); -- IODP" 'Helsingin yliopisto',
INSERT INTO infra.yhteystieto VALUES(83, 'joonas.virtasalo@gtk.fi', 54, '+358 29 503 2261', 'Vanhempi tutkija', 'Joonas', 'Virtasalo', 'www.gtk.fi', NULL, NULL); -- IODP" 'Geologian tutkimuskeskus',
INSERT INTO infra.yhteystieto VALUES(84, 'dare.talvitie@helsinki.fi', 4, NULL, 'Tietotekniikkapäällikkö', 'Dare', 'Talvitie', 'http://www.luomus.fi/', NULL, NULL); -- FinBIF" Luonnontieteellinen keskusmuseo, Luomus, Helsingin yliopisto', 'Luodaan erikseen ',
INSERT INTO infra.yhteystieto VALUES(85, 'kari.lahti@helsinki.fi', 4, '+358 400 727 955', 'Projektipäällikkö', 'Kari', 'Lahti', 'http://www.luomus.fi/', NULL, NULL); -- FinBIF" 'Luonnontieteellinen keskusmuseo, Luomus, Helsingin yliopisto', 'Luodaan erikseen ',
INSERT INTO infra.yhteystieto VALUES(86, 'info@gbif.org', 75, '+45 35 32 14 70', NULL, NULL, NULL, 'http://www.gbif.org/', 'GBIF sihteeristö', 'GBIF Secretriat'); -- GBIF" 'aLuodaan erikseen ', 'GBIF',
INSERT INTO infra.yhteystieto VALUES(87, 'jarmo.wahlfors@aka.fi', 71, '+358 29 5335 126', 'Yksikön johtaja', 'Jarmo', 'Wahlfors', 'http://www.aka.fi/fi/akatemia/hallintovirasto/terveyden-tutkimuksen-yksikko/', 'Delegaation hallinnollinen edustaja', 'Administrative delegate'); -- EMBL" 'Suomen Akatemia, hallintovirasto, terveyden ja tutkimuksen yksikkö', 'Luodaan erikseen (SA)',
INSERT INTO infra.yhteystieto VALUES(88, 'jaana.saarela@helsinki.fi', 25, '+358 29 4125 755', 'Tutkimusjohtaja', 'Janna', 'Saarela', 'www.fimm.fi', NULL, NULL); -- SC-infra" 'Suomen molekyylilääketieteen instituutti FIMM, Helsingin yliopisto',
INSERT INTO infra.yhteystieto VALUES(89, 'riikka.lund@utu.fi', NULL, '+358 2 333 7697', 'Senior Scientist, Group Leader', 'Riikka', 'Lund', 'http://www.btk.fi/functional-genomics/', NULL, 'Head of Finnish Functional Genomics Centre'); -- SC-infra" Finnish Functional Genomics Centre, Turku Centre for Biotechonlogy, University of Turku and Åbo Akademi University',
INSERT INTO infra.yhteystieto VALUES(90, 'paivi.saavalainen@helsinki.fi', 4, '+358 50 4487 487', 'University Researcher', 'Päivi', 'Saavalainen', 'http://research.med.helsinki.fi/immuno/', NULL, NULL); -- SC-infra" 'Research Programs Unit, Immunobiology, University of Helsinki',
INSERT INTO infra.yhteystieto VALUES(91, 'petri.auvinen@helsinki.fi', 29, '+358 50 4485 852', 'Research director', 'Petri', 'Auvinen', 'http://www.biocenter.helsinki.fi/bi/', NULL, NULL); -- SC-infra" 'Institute of Biotechnology, University of Helsinki',
INSERT INTO infra.yhteystieto VALUES(92, 'jaana.rich@aalto.fi', 33, '+358 50 4081988', 'Manager, technical services', 'Jaana', 'Rich', NULL, 'yhteyshenkilö', 'contact person'); -- RAMI" 'Aalto-yliopisto',
INSERT INTO infra.yhteystieto VALUES(93, 'raimo.lahtinen@gtk.fi', 54, ' +358 29 503 2484', 'Tutkimusprofessori/Research Professor', 'Raimo', 'Lahtinen', 'www.gtk.fi', NULL, NULL); -- RAMI" 'GTK', '"Projektin varajohtaja', ' vastuualueena mikrotomografialaitteisto"', 'micro tomography'
INSERT INTO infra.yhteystieto VALUES(94, 'hugh.obrien@gtk.fi', 54, ' +358 29 503 2205', 'Erikoistutkija/Senior Scientist', 'Hugh', 'O''Brien', NULL, 'Vastaa hankinnasta ja mikrotomografialaitteiston operoinnista', NULL); -- RAMI" 'GTK',
INSERT INTO infra.yhteystieto VALUES(95, 'tarja.laitinen@vtt.fi', 44, ' +358 40 8222905', 'Principal investigator', 'Tarja', 'Laitinen', NULL, NULL, NULL); -- RAMI" 'VTT Technical Research Centre of Finland', 
INSERT INTO infra.yhteystieto VALUES(96, 'tomi.lindroos@vtt.fi', 44, ' +358 50 3020227', 'Research Team Leader', 'Tomi', 'Lindroos', NULL, NULL, 'Leader of materials modelling and eco-design research team. Responsible of the VTT''s Powder Piloting Service Infrastructure, RawMatTERS Finland Infrastructure (RAMI) will be connected to this infra.'); -- RAMI" 'VTT Technical Research Centre of Finland', '
INSERT INTO infra.yhteystieto VALUES(97, 'timo.sajavaara@jyu.fi', NULL, '+358 40 805 4114', 'Professori', 'Timo', 'Sajavaara', 'https://www.jyu.fi/physics/personnel/new/tipesaja', 'Hallinnollinen yhteyshenkilö', 'Administrative contact person'); -- HIM" 'Fysiikan laitos, Jyväskylän yliopisto',
INSERT INTO infra.yhteystieto VALUES(98, 'kai.arstila@jyu.fi', NULL, '+358 40 805 4749', 'Yliopistotutkija', 'Kai', 'Arstila', 'https://www.jyu.fi/physics/personnel/new/kataarst', 'HIM-laitteiston vastaava tutkija', 'Responsible researcher for HIM'); -- HIM" 'Fysiikan laitos, Jyväskylän yliopisto',
INSERT INTO infra.yhteystieto VALUES(99, 'jarkot@utu.fi', NULL, '02 333 8250', 'Professori', 'Jari', 'Kotilainen', 'http://finca.utu.fi/', 'Hallinto', 'Administration'); -- ESO" 'Suomen ESO-keskus, Turun yliopisto',
INSERT INTO infra.yhteystieto VALUES(100, 'juhani.hyvarinen@lut.fi', 88, '+358 50 5241 512', 'Professori', 'Juhani', 'Hyvärinen', NULL, 'Vastuullinen johtaja', 'Nuclear engineering laboratory'); -- NextGenTH" 'LUT School of Energy Systems, Nuclear Engineering',
INSERT INTO infra.yhteystieto VALUES(109, 'heikki.purhonen@lut.fi', 88, '+358 40 8224 984', 'Director', 'Heikki', 'Purhonen', NULL, 'Tutkimusjohtaja, koordinaattori', NULL); -- NextGenTH" 'LUT School of Energy Systems, Nuclear Engineering',
INSERT INTO infra.yhteystieto VALUES(101, 'paula.eerola@helsinki.fi', 4, '+358 294 150 520', 'Director, professor', 'Paula ', 'Eerola', 'https://www.hip.fi/', NULL, NULL); -- CERN" 'Helsinki Institute of Physics',
INSERT INTO infra.yhteystieto VALUES(102, 'antti.vaihkonen@helsinki.fi', 4, '+358 294 150 557', 'Research coordinator', 'Antti', 'Väihkönen', 'https://www.hip.fi/', NULL, NULL); -- CERN" 'Helsinki Institute of Physics',
INSERT INTO infra.yhteystieto VALUES(103, 'paula.eerola@helsinki.fi', 4, '+358 294 150 594', 'Director, professor', 'Paula ', 'Eerola', 'https://www.hip.fi/', NULL, NULL); -- FAIR" 'Helsinki Institute of Physics',
INSERT INTO infra.yhteystieto VALUES(104, 'antti.vaihkonen@helsinki.fi', 4, '+358 294 150 631', 'Research coordinator', 'Antti', 'Väihkönen', 'https://www.hip.fi/', NULL, NULL); -- FAIR" 'Helsinki Institute of Physics',
INSERT INTO infra.yhteystieto VALUES(105, 'administracion@not.iac.es', NULL, '+34 922 181 114', NULL, NULL, NULL, 'http://www.not.iac.es/general/contact.php', 'Hallinto-osoite', 'Administration contact address'); -- NOT" 'Nordic Optical Telescope',
INSERT INTO infra.yhteystieto VALUES(106, 'sami.heinasmaki@aka.fi', 71, '+358 29\A0533 5045', 'Tiedeasiantuntija', 'Sami', 'Heinäsmäki', 'http://www.aka.fi/', 'Kansallinen edustaja NOTSA-neuvostossa', 'National representative in the NOTSA council'); -- NOT" 'Suomen Akatemia',
INSERT INTO infra.yhteystieto VALUES(107, 'pekka.lehtovuori@csc.fi', NULL, '+358 50 381 9723', 'Johtaja', 'Pekka ', 'Lehtovuori', NULL, NULL, NULL); -- NeIC" 'CSC - Tieteen tietotekniikan keskus Oy',
INSERT INTO infra.yhteystieto VALUES(108, 'gudmund.host@nordforsk.org', NULL, '+47 958 16846', 'Director', 'Gudmund', 'Höst', NULL, NULL, NULL); -- NeIC" 'NeIC/Nordforsk'


/*
table_data_palvelu.sql

PALVELU-TAULU: lista kaikista palveluista
INSERT INTO infra.palvelu VALUES(PALVELU_ID,NIMI,NAME,KUVAUS,DESCRIPTION,URLEN,URLFI,PAIKKATYYPPI,KATUOSOITE,KAUPUNKI,LAT,LON);  -- comment
PALVELU_ID - BIGINT(20): juokseva numero, kannan sisäinen, uniikki, identifioi palvelun
NIMI - VARCHAR(80): suomenkielinen nimi palvelulle
NAME - VARCHAR(80): englanninkielinen nimi palvelulle
KUVAUS - VARCHAR(300): suomenkielinen kuvaus palvelulle
DESCRIPTION - VARCHAR(300): englanninkielinen kuvaus palvelulle
URLEN - VARCHAR(300): url palvelun englanninkielisille sivuille/pidempään kuvaukseen
URLFI - VARCHAR(300): url palvelun suomenkielisille sivuille/pidempään kuvaukseen
PAIKKATYYPPI - TINYINT(4): palvelun paikkaan liittyvä luonne, arvot 11-13 11=virtuaalinen, 12=hajautettu, 13=paikkasidonnainen
KATUOSOITE - VARCHAR(120): palvelun fyysinen sijainti: kadunnimi, numero jne.
KAUPUNKI - VARCHAR(45): palvelun fyysinen sijainti: kaupungin nimi
LAT - DOUBLE(21,18): palvelun fyysisen sijainnin leveysaste, esim. "18.1234567" tai "1.45", max 18 desimaalia
LON - DOUBLE(21,18): palvelun fyysisen sijainnin pituusaste, esim. "18.1234567" tai "1.45", max 18 desimaalia
*/

INSERT INTO infra.palvelu VALUES(1,NULL,'ESS Online Analysis',NULL,NULL,'http://nesstar.ess.nsd.uib.no/webview/',NULL,11,NULL,NULL,NULL,NULL);  -- ESS
INSERT INTO infra.palvelu VALUES(2,NULL,'ESS Cumulative Data Wizard',NULL,NULL,'http://www.europeansocialsurvey.org/downloadwizard/',NULL,11,NULL,NULL,NULL,NULL);  -- ESS
INSERT INTO infra.palvelu VALUES(3,NULL,'ESS Bibliography',NULL,NULL,'http://www.europeansocialsurvey.org/bibliography/',NULL,11,NULL,NULL,NULL,NULL);  -- ESS
INSERT INTO infra.palvelu VALUES(4,NULL,'ESS Multilevel Data',NULL,NULL,'http://www.europeansocialsurvey.org/data/multilevel/',NULL,11,NULL,NULL,NULL,NULL);  -- ESS
INSERT INTO infra.palvelu VALUES(5,NULL,'ESS EduNet',NULL,NULL,'http://essedunet.nsd.uib.no/',NULL,11,NULL,NULL,NULL,NULL);  -- ESS

INSERT INTO infra.palvelu VALUES(6,'Kielipankki','The Language Bank of Finland','Kielipankki on FIN-CLARIN-konsortion kielivarojen tutkimuksen palvelukokonaisuus. Palvelu koostuu kattavasta joukosta teksti- ja puheaineistoja sekä niiden tutkimiseen soveltuvista ohjelmistoista tehokkaassa laiteympäristössä. Tutkimusyksiköt ylläpitävät aineistonsa ympäri maan ja sijoittavat ne pääsääntöisesti tarjottaviksi muiden tutkijoiden käyttöön Kielipankin kautta.','FIN-CLARIN will ensure that all the researchers in Finland have access to any European CLARIN-compatible language resources. Likewise, the researchers in other countries will be provided access to the Finnish resources.','http://www.kielipankki.fi/language-bank/','http://www.kielipankki.fi',11,NULL,NULL,NULL,NULL);  -- FIN-CLARIN
INSERT INTO infra.palvelu VALUES(7,'Tieteen termipankki','Bank of Finnish Terminology in Arts and Sciences',NULL,NULL,'http://tieteentermipankki.fi/wiki/Termipankki:Etusivu/en','http://tieteentermipankki.fi/wiki/Termipankki:Etusivu/fi',11,NULL,NULL,NULL,NULL);  -- FIN-CLARIN

INSERT INTO infra.palvelu VALUES(8,'Verkkoaineistojen hankinta','Acquisition of electronic publications','Konsortio, joka hankkii keskitetysti tieteellisiä e-lehtiä, e-kirjoja, hakuteoksia ja tietokantoja','Consortium acquiring centrally scholarly journals, books, reference books and databases in electronic format','http://www.nationallibrary.fi/en/libraries/finelib.html','http://wiki.helsinki.fi/display/FinELib/FinELib-aineistot',11,'Kaikukatu 4','Helsinki',60.182538,24.96031);  -- FinELib

INSERT INTO infra.palvelu VALUES(9,'Finna.fi','Finna.fi','Finna.fi tuo Suomen museoiden, kirjastojen ja arkistojen aineistoja kaikkien saataville yhdestä palvelusta.','Finna.fi provides free access to material from Finnish museums, libraries and archives.','https://www.finna.fi/?lng=en-gb','https://www.finna.fi/?lng=fi',11,NULL,NULL,NULL,NULL);  -- Finna
-- lopussa id:llä 243

INSERT INTO infra.palvelu VALUES(10,'Aineistokatalogi','Data catalogue','Aineistokatalogi on rekisterien ja mikroaineistojen metatietojen hakupalvelu, josta saa tietoja käytettävissä olevista rekisteritietovarannoista rekisteri- ja muuttujatasoisesti. Palvelu on internet-pohjainen ja se on kaikille avoin. Aineistokatalogista käyttöluvan hakija voi viedä listauksen valitsemistaan rekistereistä ja muuttujista Käyttölupien sähköiseen hakupalveluun.','The data catalogue is a web-based open search service that includes descriptive information on governmental registers and micro level data files that can be used for research purposes. The metadata is as specific as possible both on the level of depicting the registers, data files and the variables. The researcher can send a listing of the registers and variables chosen in the data catalogue to the Joint permit service in order to apply for permission of use the data.',NULL,NULL,11,NULL,NULL,NULL,NULL);  -- FMAS
INSERT INTO infra.palvelu VALUES(11,'Käyttölupien sähköinen hakupalvelu','Joint permit service','Käyttölupien hakupalvelu on sähköinen asiointipalvelu tutkijoille ja viranomaisille. Sen kautta tutkijat voivat hakea rekisteritietojen käyttölupia viranomaisilta periaatteella yksi hakemus per yksi tutkimus. Hakija voi seurata hakemuksen käsittelyn etenemistä eri viranomaisilla. Kukin viranomainen käsittelee käyttölupahakemusta erillisenä prosessina ja tekee oman päätöksen. Palvelu on avoin kaikille tutkijoille, mutta palvelun käyttö edellyttää tunnistautumista.','The joint permit service is a centralized digital service through which researchers can apply for permits to use register data. Only one application per study will be needed as the researcher(s) can ask for permit to use data from several different organizations simultaneously by the same interactive digital application form.',NULL,NULL,11,NULL,NULL,NULL,NULL);  -- FMAS
INSERT INTO infra.palvelu VALUES(12,'Etätyöpöytä','Remote Access System','Etätyöpöytä on käyttölupiin perustuvien aineistojen yhdistelyyn ja analysointiin tarkoitettu tietoturvallinen palvelu. Viranomaiset toimittavat etätyöpöydälle aineistoja, joissa suorat tunnisteet on korvattu hankekohtaisilla pseudotunnisteilla. Tutkija pystyy kirjautumaan palveluun omalta työpisteeltään käsitelläkseen eri lähteistä saatavia aineistoja. Kirjautumisessa käytetään vahvaa tunnistautumista. Työpöytä on kapasiteetiltaan ja ohjelmistoltaan hyvin varusteltu.','The remote access system consists of a restricted remote desktop environment, including services and applications for processing and analyzing data sets. Register keeping authorities upload data from which the direct identifiers, that reveal the person, enterprise or other unit, have been substituted with project specific pseudo numbers. The researcher logs on to the remote desktop from his own desktop using strong authentication in order to access and link data from different sources. Several statistical programs are available in the environment, e.g. SAS, SPSS, STATA, R.','http://tilastokeskus.fi/tup/mikroaineistot/etakaytto_en.html','http://tilastokeskus.fi/tup/mikroaineistot/etakaytto.html',11,NULL,NULL,NULL,NULL);  -- FMAS
INSERT INTO infra.palvelu VALUES(13,'Informaatio- ja tukipalvelu','Information and support service','Informaatio- ja tukipalvelu tarjoaa tietoa rekisteritutkimuksen mahdollisuuksista ja toteuttamistavoista sekä tuki- ja koulutuspalveluja tutkijoille. Palveluun tulee webportaali, jonka kautta tutkijat saavat tietoa FMAS-palvelukokonaisuudesta, mutta myös monipuolista tietoa rekisteritutkimuksen mahdollisuuksista ja toteuttamistavoista. Portaalin tarkoituksena on myös tukea tutkijoiden verkostoitumista julkaisemalla tietoa koulutuksista, ajankohtaisista tapahtumista ja uusista tutkimuksista. Palvelu on avoin kaikille.','Information and support service will provide wide-ranging information and support on register-based research and promote the networking of researchers. The main channel to circulate information on possibilities for register-based research and guidelines on applying for data will be the FMAS web-portal. From the portal, the researchers will get guidance on e.g. data management during the whole research process, legislation, ethical issues, and applicability of open data principles in sensitive and confidential data. The portal will also contain methodological information Further, the portal will support the networking of researchers by giving information on relevant training courses, seminars, and other events, as well as new register based researches.',NULL,NULL,11,NULL,NULL,NULL,NULL);  -- FMAS

INSERT INTO infra.palvelu VALUES(14,'Palveluportaali Aila','Aila Data Service','Palveluportaali Ailasta ovat saatavissa Yhteiskuntatieteelliseen tietoarkistoon arkistoidut tutkimusaineistot sekä niiden kattavat suomen- ja englanninkieliset kuvailutiedot. Kaikki voivat selata ja hakea aineistoja, lukea kuvailutietoja ja ladata avoimia aineistoja. Rekisteröitymällä pääset lataamaan maksutta käyttöehdoiltaan rajattuja aineistoja.','Aila provides access to datasets archived at the Finnish Social Science Data Archive and their study descriptions in Finnish and English. All users can browse and search data, read study descriptions and download open access data. By registering, users can download data which have access conditions. Services are free of charge.','https://services.fsd.uta.fi/?lang=en','https://services.fsd.uta.fi/',11,NULL,NULL,NULL,NULL);  -- FSD&CESSDA & TTA
INSERT INTO infra.palvelu VALUES(15,'Aineistonhallinnan käsikirja','Data Management Guidelines','Aineistonhallinnan käsikirja on tarkoitettu tutkijoille aineistonhallinnan avuksi tutkimuksen suunnittelusta sen päättymiseen ja aineiston avaamiseen saakka. Käsikirja sisältää ohjeita muun muassa aineistonhallinnan suunnittelusta; aineistoja koskevista sopimuksista ja oikeuksista; tutkittavien informoinnista; tiedostomuodoista ja ohjelmistoista; aineiston käsittelystä; tunnisteellisuudesta ja anonymisoinnista; kuvailusta ja metadatasta; tiedostojen ja muun materiaalin säilyttämisestä.','The Data Management Guidelines is an open guidebook for researchers on data management for the whole research data life cycle. In this Internet-based guidebook there are instructions and information about data management and planning; copyright and agreements; informing research participants; data formats and software; data processing; anonymization and personal data; data description and metadata; physical data storage.','http://www.fsd.uta.fi/aineistonhallinta/en/','http://www.fsd.uta.fi/aineistonhallinta/',11,NULL,NULL,NULL,NULL);  -- FSD&CESSDA
INSERT INTO infra.palvelu VALUES(16,'Menetelmäopetuksen tietovaranto','Research Methods Web Resource','Menetelmäopetuksen tietovaranto (MOTV) on kaikille avoin suomenkielinen tutkimusmenetelmien oppimisympäristö. Se sisältää erilliset osiot kvantitatiivisen ja kvalitatiivisen tutkimuksen menetelmistä.','Research methods web resource (MOTV in Finnish) is an environment for teaching and learning quantitative and qualitative research methods of the social and behavioural sciences. It contains separate sections for quantitative and qualitative research methods. The service is provided in Finnish only.','http://www.fsd.uta.fi/menetelmaopetus/englex.html','http://www.fsd.uta.fi/menetelmaopetus/',11,NULL,NULL,NULL,NULL);  -- FSD&CESSDA
INSERT INTO infra.palvelu VALUES(17,'Demokratiaindikaattorit','Democracy Indicators','Demokratiaindikaattorit seuraavat suomalaisen demokratian tilaa ja kehitystä. Indikaattorien aihealueita: vaali- ja puoluedemokratia; osallistuva demokratia; järjestöosallistuminen; käsitykset kansalaisuudesta ja omista vaikutusmahdollisuuksista; asenteet poliittisia instituutioita ja toimijoita kohtaan; informoidun kansalaisuuden kriteerit. Indikaattorit perustuvat korkealaatuisiin kyselyaineistoihin ja rekistereihin. Keskeisimpiä ovat eduskuntavaalien jälkeen kerättävät kansallisten vaalitutkimusten data-aineistot.','Democracy indicators monitor the state and development of Finnish democracy. They cover the following topics: election and party democracy; participatory democracy and social capital; NGO participation; citizens'' views on citizenship and their own opportunities to influence; attitudes towards political institutions and actors; criteria of informed citizenship. The comprehensive and reliable democracy indicators are based on high quality survey data and registers, especially on election studies in connection with parliamentary elections.','http://www.vaalitutkimus.fi/en/demokratiaindikaattorit.html','http://www.vaalitutkimus.fi/fi/demokratiaindikaattorit.html',11,NULL,NULL,NULL,NULL);  -- FSD&CESSDA
INSERT INTO infra.palvelu VALUES(18,'Pohtiva - Poliittisten ohjelmien tietovaranto','Pohtiva - Finnish Party Agenda Database','POHTIVA-tietovarantoon on koottu suomalaisten puolueiden voimassa olevia ja entisiä ohjelmia sekä muita keskeisiä poliittisia tekstejä 1800-luvulta lähtien. Ohjelmia voi selata puoluettain tai muin ehdoin järjestettynä ja niihin voi kohdistaa sanahakuja.','POHTIVA is an open resource which contains manifestos of Finnish political parties since 1800s. The service is available in Finnish only. Manifestos may be in any language they were originally published, mainly Finnish and Swedish.',NULL,'http://www.fsd.uta.fi/pohtiva/',11,NULL,NULL,NULL,NULL);  -- FSD&CESSDA

-- INSERT INTO infra.palvelu VALUES(19,'Avoimen tieteen kansalliset palvelut','Open Science and Research Initiative''s Services for Researchers',NULL,NULL,'http://openscience.fi/services','http://avointiede.fi/palvelut',11,NULL,NULL,LAT,LON);  -- TTA&KDK-PAS
-- TODO: muista linkata AILA myös TTA:n alle, samoja tietoja ei kannata kahdentaa
-- INSERT INTO infra.palvelu VALUES(PALVELU_ID,'ATT - Palveluportaali Aila','ATT - Aila data service portal','Palveluportaali Ailasta löytyvät Yhteiskuntatieteelliseen tietoarkistoon arkistoidut tutkimusaineistot sekä niiden kattavat suomen- ja englanninkieliset kuvailutiedot. Kaikki voivat selata ja hakea aineistoja, lukea kuvailutietoja ja ladata avoimia aineistoja. Rekisteröitymällä pääset lataamaan maksutta käyttöehdoiltaan rajattuja aineistoja.','Aila provides access to datasets archived at the Finnish Social Science Data Archive and their study descriptions in Finnish and English. All users can browse and search data, read study descriptions and download open access data. By registering, users can download data which have access conditions. Services are free of charge.','https://services.fsd.uta.fi/?lang=en','https://services.fsd.uta.fi/',11,NULL,NULL,LAT,LON);  -- TTA&KDK-PAS
INSERT INTO infra.palvelu VALUES(20,'Avointen aineistojen julkaisualusta AVAA','AVAA open data publishing portal','AVAA on avointen tutkimusaineistojen julkaisualusta. Palvelu on suunnattu sekä aineistojen avaajille että avointen aineistojen jatkohyödyntäjille. AVAA-portaali tarjoaa tutkimusaineistojen hyödyntäjälle pääsyn aineistoihin ja työkaluihin, joilla aineistoja voidaan hakea, ladata, hyödyntää ja yhdistellä. AVAA edistää eri tieteenalojen tutkimusdatan avointa saatavuutta.','AVAA is an open data publishing platform for research data. It serves both the producers and users of open data. AVAA offers applications for the use of open data, such as downloading and analysis by means of different visualizations. AVAA furthers the availability of research data in different disciplines.','http://avaa.tdata.fi/en','http://avaa.tdata.fi/',11,NULL,NULL,NULL,NULL);  -- TTA&KDK-PAS
INSERT INTO infra.palvelu VALUES(21,'Tutkimusaineistojen hakupalvelu Etsin','Etsin research data finder','Etsin on tutkimusdatan hakupalvelu, joka sisältää tutkimusaineistoja kuvailevia tietoja eli metatietoja. Tutkija, tutkimusryhmä tai organisaatio voi Etsimen avulla julkaista tiedot omista aineistoistaan ja tarjota niitä laajempaan käyttöön. Kuvailutietojen perusteella käyttäjät voivat etsiä aineistoja ja arvioida löytämiensä aineistojen käyttökelpoisuutta tarpeisiinsa.','Etsin is a research data finder that contains descriptive information – that is, metadata – on research datasets. In the service you can search and find data from various fields of research. A researcher, research group or organisation can use Etsin to publish information on their datasets and offer them for wider use. The metadata contained in Etsin makes it easy for anyone to discover the datasets.  Etsin assigns a permanent URN identifier to datasets, making it possible to link to the dataset and gather merit through its publication and use.','http://etsin.avointiede.fi/en','http://etsin.avointiede.fi/',11,NULL,NULL,NULL,NULL);  -- TTA&KDK-PAS
-- INSERT INTO infra.palvelu VALUES(22,'ATT - Sanasto- ja ontologiapalvelu Finto','ATT - FINTO infra.thesaurus and ontology service','FINTO infra.on suomalainen sanasto- ja ontologiapalvelu, joka mahdollistaa sanastojen julkaisun ja selailun. Palvelu tarjoaa myös rajapinnat sanastojen ja ontologioiden hyödyntämiseen muissa ohjelmistoissa.','FINTO infra.is a Finnish thesaurus and ontology service, which enables both the publication and browsing of vocabularies. The service also offers interfaces for integrating the thesauri and ontologies INTO infra.other applications and systems.','http://finto.fi/en/','http://finto.fi/fi/',11,NULL,NULL,LAT,LON);  -- TTA&KDK-PAS
INSERT INTO infra.palvelu VALUES(23,'Tutkimusaineistojen säilytyspalvelu IDA','IDA research data storage service','IDA on tutkimusaineiston säilytyspalvelu suomalaisen tutkimusjärjestelmän toimijoille. IDA mahdollistaa tutkimuksen tuottamien aineistojen ja niihin liittyvän metatiedon turvallisen säilytyksen. Pääsy aineistoon voidaan myöntää projektiryhmän sisällä tai laajemmin. Palvelu on tarkoitettu valmiille tutkimusaineistoille, sekä raakadatalle että aineistokokonaisuuksille. Aineistojen omistajat päättävät itse aineistojensa avoimuudesta ja käyttöpolitiikasta.','IDA is a storage service for research data to actors in the Finnish research system. IDA enables the safe storage of research datasets and related metadata. Access to the data may be granted within the research project or for a wider group of users. The service is intended for stable research data, both raw data and processed datasets. Owners of the data decide on the openness and usage policies for their own data.','http://openscience.fi/ida','http://avointiede.fi/ida',11,NULL,NULL,NULL,NULL);  -- TTA&KDK-PAS
INSERT INTO infra.palvelu VALUES(24,'Käyttövaltuuspalvelu REMS','REMS Resource Entitlement Management System','REMS on sovellus tutkimusaineistojen käyttölupien hakuun ja hallintaan. Palvelun avulla tutkija voi hakea käyttölupaa aineistoon. Aineiston omistaja saa hakemuksen hyväksyttäväkseen ja voi tarkastalle jo myönnettyjä käyttöoikeuksia.','REMS provides tools to design application forms and workflows for items requiring authorization. REMS can be used by end user to apply access rights. Users controlling workflow may use REMS to administer the application as well as already granted access rights.','https://reetta.csc.fi','https://reetta.csc.fi',11,NULL,NULL,NULL,NULL);  -- comment
-- INSERT INTO infra.palvelu VALUES(24,'ATT - Doria julkaisuarkistopalvelu','ATT - Doria publication archive','Doria sisältää yliopistojen ja tutkimuslaitosten aineistoja sekä Kansalliskirjaston omia digitoituja kokoelmia.','Doria is a multi-institutional repository maintained by the National Library of Finland.','https://www.doria.fi/','https://www.doria.fi/',11,NULL,NULL,LAT,LON);  -- TTA&KDK-PAS
-- INSERT INTO infra.palvelu VALUES(25,'ATT - Theseus julkaisuarkistopalvelu','ATT - Theseus publication archive','Theseus-julkaisuarkisto sisältää ammattikorkeakoulujen opinnäytetöitä sekä julkaisuja.','Theseus provides online access to theses and publications from the Finnish Universities of Applied Sciences. Researchers can read entire theses and publications and utilise them in their own research and development work – or just to get acquainted with theses written by graduates of the Universities of Applied Sciences or universities'' publications.','http://www.theseus.fi/','http://www.theseus.fi/',11,NULL,NULL,LAT,LON);  -- TTA&KDK-PAS
-- TODO: muista linkata Kielipankki myös TTA:n alle, samoja tietoja ei kannata kahdentaa
-- INSERT INTO infra.palvelu VALUES(PALVELU_ID,NIMI,'ATT - Language bank of Finland',KUVAUS,DESCRIPTION,'https://kitwiki.csc.fi/twiki/bin/view/FinCLARIN/KielipankkiHome',URLFI,PAIKKATYYPPI,KATUOSOITE,KAUPUNKI,LAT,LON);  -- TTA&KDK-PAS
-- INSERT INTO infra.palvelu VALUES(26,'ATT - Tutkimusinfrastruktuurien tietopankki','ATT - Data bank on research infrastructures','Tutkimusinfrastruktuurien tietopankki on verkkopalvelu, joka kuvailee tutkimusinfrastruktuurien palveluita ja edistää tutkimusinfrastruktuurien yhteiskäyttöä ja avoimuutta sekä resurssien tehokasta käyttöä.','Research infrastructure databank is a web service that describes the services of RI''s and promotes openness and resource sharing.',NULL,NULL,11,NULL,NULL,LAT,LON);  -- TTA&KDK-PAS
-- INSERT INTO infra.palvelu VALUES(27,'ATT - Tutkimusten tulosten pitkäaikaissaatavuus (PAS)','ATT - Digital Preservation Solution for Research Data (PAS)','Tutkimusaineistojen hyödynnettävyyden kannalta pitkäaikaissaatavuus tarkoittaa erityisesti sisällön ymmärrettävyyden varmistamista ja sen vaatimien säilytysmenetelmien soveltamista. Tällöin voidaan taata, että tulevat käyttäjät pystyvät avaamaan aineistot, tulkitsemaan sisällöt ja hyödyntämään niitä kyseisenä aikakautena käytössä olevilla välineillä. Tavoitteena on, että vuonna 2017 Tutkimuksen tulosten pitkäaikaisaatavuus on täysimittaisessa toiminnassa.','The long-term preservation solution for research data is currently being developed and will be in use in 2017. The solution is built together with the digital preservation of cultural heritage data. The goal is to reduce redundancy of cultural heritage and research data management, distribution and storage functions. A joint long-term preservation solution for digital data produces high-quality services cost-efficiently and allows for the diverse use of digital data.',NULL,NULL,11,NULL,NULL,LAT,LON);  -- TTA&KDK-PAS
-- INSERT INTO infra.palvelu VALUES(28,'ATT - Aineistonhallintasuunnitelmatyökalu Tuuli','ATT - Tuuli data management planning tool','Tuuli-projektin tavoitteena on kehittää ja ottaa käyttöön Suomen tutkimusorganisaatioille yhteinen työkalu datanhallintasuunnitelmien laadintaan. Aineistonhallintasuunnitelmatyökalu (dmpTuuli) perustuu avoimen lähdekoodin ratkaisuun. Projekti toteutetaan käyttäjälähtöisesti ja käyttäjät otetaan mukaan työkalun suunnitteluun heti projektin alkuvaiheessa käyttäjäkeskeisen tietojärjestelmäsuunnittelun periaatteiden mukaisesti.',NULL,NULL,'http://portti.avointiede.fi/tutkimusdata/tuuli-tyokalu-tutkimuksen-datanhallinnan-suunnitteluun',11,NULL,NULL,LAT,LON);  -- TTA&KDK-PAS
INSERT INTO infra.palvelu VALUES(29,'Kansallisen digitaalisen kirjaston pitkäaikaissäilytyspalvelu (KDK:n PAS-palvelu)','Digital Preservation Service of National Digital Library (NDL’s Digital Preservation Service)','Kansallisen digitaalisen kirjaston pitkäaikaissäilytyspalvelu (KDK:n PAS-palvelu), säilyttää digitoidut ja alkujaan digitaaliset kulttuuriperintöaineistot myös tuleville sukupolville ja mahdollistaa aineistojen pitkäaikaisen hyödyntämisen. Pitkäaikaissäilytyspalvelun ei pelkästään säilyttä bittejä, joista digitaaliset aineistot koostuvat, vaan turvaa myös niiden ymmärrettävyyden säilymisen. Tämä mahdollistaa aineistojen helpon ja joustavan hyödyntämisen hyvin erilaisiin tarkoituksiin myös tulevaisuudessa.','Digital Preservation Service of National Digital Library is preserving digital cultural heritage in Finland for future generations. Service is enabling long-term availability and usability of preserved digital assets.','http://www.kdk.fi/index.php/en/long-term-preservation','http://www.kdk.fi/index.php/fi/pitkaaikaissailytys',11,NULL,NULL,NULL,NULL);  -- TTA&KDK-PAS

INSERT INTO infra.palvelu VALUES(30,'EISCAT_3D','EISCAT_3D',NULL,'EISCAT_3D is a three-dimensional imaging radar to be located in the northernmost parts of Europe. It will be making continuous measurements of the geospace environment and its coupling to the Earth''s atmosphere from its location in the auroral zone at the southern edge of the northern polar vortex.','https://eiscat3d.se//node',NULL,12,NULL,'Huippuvuoret',77.874973,20.975182);  -- EISCAT_3D, paikkatieto hajautetulle: Huippuvuoret, Norja, Ruotsi ja Suomi
INSERT INTO infra.palvelu VALUES(31,'EISCAT','EISCAT',NULL,'EISCAT is being used as a coherent scatter radar for studying instabilities in the ionosphere, as well as for investigating the structure and dynamics of the middle atmosphere and as a diagnostic instrument in ionospheric modification experiments with the Heating facility.','https://www.eiscat.se/',NULL,12,NULL,'Huippuvuoret',77.874973,20.975182);  -- EISCAT_3D, paikkatieto hajautetulle: Huippuvuoret, Norja, Ruotsi ja Suomi
INSERT INTO infra.palvelu VALUES(32,'RTG','Real Time Graphs (RTG)',NULL,NULL,'http://www.eiscat.se/raw/rtg/rtg.cgi',NULL,11,NULL,NULL,NULL,NULL); -- EISCAT_3D
INSERT INTO infra.palvelu VALUES(33,NULL,'Analysed data',NULL,NULL,'https://www.eiscat.se/groups/datahandling/Analysed-data',NULL,11,NULL,NULL,NULL,NULL); -- EISCAT_3D
INSERT INTO infra.palvelu VALUES(34,NULL,'Realtime Madrigal data',NULL,NULL,'https://www.eiscat.se/realtime/',NULL,11,NULL,NULL,NULL,NULL); -- EISCAT_3D
INSERT INTO infra.palvelu VALUES(35,NULL,'Dynasonde data',NULL,NULL,'http://www.eiscat.uit.no/dynasond.html',NULL,11,NULL,NULL,NULL,NULL);  -- EISCAT_3D
INSERT INTO infra.palvelu VALUES(36,NULL,'ESPAS',NULL,'ESPAS is a data infrastructure facilitating access to observations, models and predictions of the near-Earth space environment extending from the Earth''s atmosphere up to the outer radiation belts.','https://www.espas-fp7.eu/portal/',NULL,11,NULL,NULL,NULL,NULL); -- EISCAT_3D

INSERT INTO infra.palvelu VALUES(37,'RIDE','RIDE',NULL,'R.I.D.E. is an acronym which stands for Research Infrastrucure Database for EPOS. This database is a Database of Research Infrastructure participating to EPOS European Project, containing information about Resaerch Infrastructures but NOT scientific data (waveforms, images etc.)','http://www.epos-eu.org/ride/',NULL,11,NULL,NULL,NULL,NULL); -- FIN-EPOS

INSERT INTO infra.palvelu VALUES(38,'Alg@line','Alg@aline',NULL,'Alg@line network in the Baltic Sea monitors the state of the sea and detects algal blooms. Several millions of data points are collected annually from the Baltic Sea, using a fleet of ferries operated by shipping companies.','http://www.finmari-infrastructure.fi/ferrybox/','http://www.jarviwiki.fi/wiki/Algaline',12,NULL,NULL,NULL,NULL); -- FINMARI
INSERT INTO infra.palvelu VALUES(39,'Järvi ja meri Wiki','Lake and Sea Wiki','Järviwiki on Suomen järvien oma wiki eli verkkopalvelu, jota rakennetaan ja julkaistaan käyttäjien yhteistyöllä. Järviwikistä löytyy perustiedot kaikista yli 1 hehtaarin kokoisesta järvestämme sekä valmiit työkalut, joilla käyttäjät voivat jakaa mm. valokuvia ja havaintoja.','Järviwiki (alias Lakewiki) is a web service which is built and maintained in cooperation by authorities and common people. In Järviwiki there is basic information on each Finnish lake over 1 ha in extent and tools for sharing ie. observations and pictures.','http://www.jarviwiki.fi/wiki/Algaline','http://www.jarviwiki.fi/wiki/Main_page',11,NULL,NULL,NULL,NULL); -- FINMARI
INSERT INTO infra.palvelu VALUES(40,NULL,'Argo floats',NULL,'FMI operates three Argo floats in the Baltic Sea, two in the Bothnian Sea and one in the Gotland Basin. The Argo floats have been adapted to shallow water conditions.','http://www.finmari-infrastructure.fi/autonomous-platforms/argo-floats/',NULL,12,NULL,NULL,NULL,NULL); -- FINMARI
INSERT INTO infra.palvelu VALUES(41,NULL,'Ice buoys',NULL,'FMI uses GPS-Iridium ice drift buoys (MetOcean) to measure sea ice drift in the Baltic Sea. A buoy tracks its coordinates, air pressure and sea surface temperuture (when in open water) every 3 hrs.','http://www.finmari-infrastructure.fi/autonomous-platforms/ice-buoys/',NULL,12,'Baltic sea',NULL,58.487952,19.863281); -- FINMARI, hajautettu?
INSERT INTO infra.palvelu VALUES(42,NULL,'Wave buoys',NULL,'Finnish Meteorological Institute has four operational wave buoys in the Baltic Sea. Wave measurements are also made in other areas during research campaigns. Wave buoys provide observations of significant wave height,, wave direction and period. Also sea surface temperature is measured by the wave buoys.In addition, FMI has one online Acoustic Doppler Current Profiler (ADCP) measuring waves.','http://www.finmari-infrastructure.fi/autonomous-platforms/wave-buoys/',NULL,12,'Baltic sea',NULL,58.487952,19.863281); -- FINMARI
INSERT INTO infra.palvelu VALUES(43,NULL,'Profiling buoys',NULL,'In collaboration with Turku University of Applied Sciences, FINMARI partners UTU, FMI, and SYKE-MRC currently maintain a profiling archipelago buoy near Seili station, for continuous measurement of basic physical, chemical, and fluorescence parameters of the water column.','http://www.finmari-infrastructure.fi/autonomous-platforms/profiling-buoys/',NULL,12,'Archipelago sea',NULL,59.934493,21.811659); -- FINMARI, hajutettu?
INSERT INTO infra.palvelu VALUES(44,NULL,'Gliders',NULL,'The new glider FMI purchased in summer 2015 measures temperature, salinity, oxygen, chlorophyll, turbidity and organic carbon compounds (CDOM) in the water. The glider is equipped with a propeller for improved operability.','http://www.finmari-infrastructure.fi/autonomous-platforms/gliders/',NULL,12,NULL,NULL,NULL,NULL); -- FINMARI, hajautettu
INSERT INTO infra.palvelu VALUES(45,'Husö-ÅAU','Husö-ÅAU',NULL,'The station functions as the base for aquatic studies, but also botanical, mycological and entomological studies are conducted. The station laboratory provides space and equipment for experimental aquatic ecology, laboratory analysis, biological sampling as well as field investigations of coastal areas and lakes.','http://www.finmari-infrastructure.fi/field-stations/huso-aau/',NULL,13,'Bergövägen 713, AX-22220 Emkarby, Åland Islands','Åland Islands',60.279989,19.827893); -- FINMARI
INSERT INTO infra.palvelu VALUES(46,'Seili - UTU','Seili-UTU',NULL,'The focus of the Seili station, has been on long-term monitoring of the brackish water environment and statistical time series modeling, supported with experimental laboratory facilities.','http://www.finmari-infrastructure.fi/field-stations/seili-utu/',NULL,13,NULL,'Seili Island',60.238462,21.960638); -- FINMARI
INSERT INTO infra.palvelu VALUES(47,'Tvärminne - UHEL','Tvärminne - UHEL',NULL,'Tvärminne Zoological Station (TZS) is a marine station located at the entrance to the Gulf of Finland in the Baltic Sea. Despite its name of historical origin, it serves as a centre for a large variety of high quality biological and ecological research, carries out environmental monitoring, and offers facilities for field courses, symposia and seminars, also in non-biological disciplines.','http://www.finmari-infrastructure.fi/field-stations/tvarminne-uhel/',NULL,13,'J.A. Palménin tie 260, 10900 HANKO','Hanko',59.843162,23.24403); -- FINMARI
INSERT INTO infra.palvelu VALUES(48,'Utö - FMI','Utö - FMI',NULL,'FMI started meteorological observations on the island in 1881. Marine research facilities were built in 2012-2014, and first continuous measurements were started in 2014-2015.','http://www.finmari-infrastructure.fi/field-stations/uto-fmi/',NULL,13,'Utö Island','Utö Island',59.780015,21.375962); -- FINMARI
INSERT INTO infra.palvelu VALUES(49,'Fennica','Fennica',NULL,'MSV Fennica is a multifunctional vessel based on a modified icebreaker design with diesel-electric propulsion. The vessel is specially designed for a wide range of offshore related work. Availability to FINMARI: Negotiations on the utilization of ice-breaker platforms during their chartered assignments need to be initiated with Arctia Shipping Ltd well in advance to the intended campaigns.','http://www.finmari-infrastructure.fi/icebreakers/fennica/',NULL,13,NULL,NULL,NULL,NULL); -- FINMARI
INSERT INTO infra.palvelu VALUES(50,'Nordica','Nordica',NULL,'MSV Nordica is a multifunctional vessel based on a modified icebreaker design with diesel-electric propulsion. The vessel is specially designed for a wide range of offshore related work. Availability to FINMARI: Negotiations on the utilization of ice-breaker platforms during their chartered assignments need to be initiated with Arctia Shipping Ltd well in advance to the intended campaigns.','http://www.finmari-infrastructure.fi/icebreakers/nordica/',NULL,13,NULL,NULL,NULL,NULL); -- FINMARI
INSERT INTO infra.palvelu VALUES(51,NULL,'SYKE-MRC Marine Ecology Laboratory',NULL,'SYKE MRC-laboratory in the Kumpula Campus area, Helsinki, has up-to-date basic and advanced laboratory facilities for experimental marine ecology research, including flow cytometer, FlowCAM, microscopes, spectrofluorometers, plate readers, spectrophotometer with integrating sphere, FRR fluorometers, controllable LED panels, nutrient analyzers, and isotope laboratory.','http://www.finmari-infrastructure.fi/laboratories/syke-mrc-marine-ecology-laborato/',NULL,13,NULL,'Helsinki',60.173324,24.941025); -- FINMARI
INSERT INTO infra.palvelu VALUES(52,NULL,'Tvärminne Laboratory',NULL,'The laboratory at Tvärminne Zoological Station offers excellent instrumentation for modern chemical and biological research, including facilities for water analyses, microscopy, isotope studies (class C) and basic molecular work.','http://www.finmari-infrastructure.fi/laboratories/tvarminne-laboratory/',NULL,13,'J.A. Palménin tie 260, 10900 HANKO','Hanko',59.843162,23.24403); -- FINMARI
INSERT INTO infra.palvelu VALUES(53,NULL,'Seili Laboratory',NULL,'The Archipelago Research Institute''s laboratory at Seili field station involves basic instrumentation for geological, chemical and biological research, for sediment and water analyses, and microscopy. Seili-UTU has several indoor thermo-constant rooms, wet labs with running seawater, light and temperature regulated flow-through aquaria for experimental ecological set-ups, and corresponding outdoor experimental aquaria facilities, all with flow-through seawater.','http://www.finmari-infrastructure.fi/laboratories/seili-laboratory/',NULL,13,NULL,'Seili Island',60.238462,21.960638); -- FINMARI
INSERT INTO infra.palvelu VALUES(54,NULL,'Husö Laboratory',NULL,'The laboratory at Husö Biological Station offers adequate instrumentation for basic chemical and biological research, including facilities for water analyses and microscopy. The laboratory services include e.g., analyses of nutrients, chlorophyll, turbidity, oxygen.','http://www.finmari-infrastructure.fi/laboratories/huso-laboratory/',NULL,13,'Bergövägen 713, AX-22220 Emkarby, Åland Islands','Åland Islands',60.279989,19.827893); -- FINMARI
INSERT INTO infra.palvelu VALUES(55,'Aranda','Aranda',NULL,'Aranda is a modern, ice-reinforced research vessel owned by SYKE. The vessel is adapted to year-round multidisciplinary marine research, including biology, physics, chemistry and geology of the sea. The well-equipped laboratories and advanced computer systems facilitate sample treatment and data analysis under way.','http://www.finmari-infrastructure.fi/research-vessels/aranda/',NULL,13,NULL,NULL,NULL,NULL); -- FINMARI
INSERT INTO infra.palvelu VALUES(56,'Aurelia','Aurelia',NULL,'The vessel hosts small wet and dry labs and is equipped with standard hydrographic and marine biological research and sampling equipment (incl. CTD, sediment corers and grabs, ADCP-profiler, on-line chlorophyll fluorometer, Meridata digital sonar system and other sonars), weather station, differential GPS, Navi Fisher navigating system.','http://www.finmari-infrastructure.fi/research-vessels/aurelia/',NULL,13,NULL,NULL,NULL,NULL); -- FINMARI
INSERT INTO infra.palvelu VALUES(57,'Geomari','Geomari',NULL,'R/V Geomari is aluminium-body catamaran built in 2003 by Mobimar Oy. It is equipped for seafloor mapping and research with seismic signal equipment (250-1300 Hz), a Klein 3000 Sidescan Sonar (100/500 kHz), research echosounder (MD 28 kHz), Chirp sonar (3 – 9 kHz), multibeam sonar (Atlas Fansweep 20 200 kHz), and seabed sediment sampling equipment.','http://www.finmari-infrastructure.fi/research-vessels/geomari/',NULL,13,NULL,NULL,NULL,NULL); -- FINMARI
INSERT INTO infra.palvelu VALUES(58,'Muikku',NULL,NULL,'Muikku is a research vessel adapted to multidisciplinary marine research almost around the year. The instrumentation enables detailed investigations of the state of aquatic environments in the Gulf of Finland and the Finnish Archipelago.','http://www.finmari-infrastructure.fi/research-vessels/muikku/',NULL,13,NULL,NULL,NULL,NULL); -- FINMARI
INSERT INTO infra.palvelu VALUES(59,'Saduria','Saduria',NULL,'The vessel has a small laboratory (wet and dry bench) and carries standard sampling equipment such as water samplers, plankton nets, sediment corers and grabs, dredges and trawls, and handheld probes (CTD, oxygen). It has capability for small-scale moorings and deployments. The crew consists of a skipper and a deckhand.','http://www.finmari-infrastructure.fi/research-vessels/saduria/',NULL,13,NULL,NULL,NULL,NULL); -- FINMARI

INSERT INTO infra.palvelu VALUES(60,'Pallas','Pallas','Pallas on luokan 1 ilmakehäasema ja osa Maailman ilmatieteen järjestön (WMO) Global Atmosphere Watch (GAW) monitorointiverkon Pallas-Sodankylä-asemaa. Pallaksella, joka sijaitsee Pallas-Yllästunturin kansallispuiston puhtaassa ympäristössä, havainnoidaan kasvihuonekaasujen, muiden hivenkaasujen ja aerosolien pitoisuuksia ilmakehän alaosassa, koska paikalliset päästöt eivät häiritse mitttauksia. Pallaksen asema edustaa Pohjois-Euroopan boreaalista vyöhykettä. Pallaksen alueella tehdään myös ympärivuotisia ekosysteemikohtaisia kasvihuonekaasujen mikrometeorologisia mittauksia lähde-nielu termien arvioimiseksi.','Monitoring station of Pallas is a Class 1 Atmosphere station and part of the Pallas-Sodankylä Global Atmosphere Watch (GAW) monitoring station of the World Meteorological Organization (WMO). In the non-polluted environment of Pallas, located in the Pallas-Yllästunturi national park, we monitor concentrations of greenhouse and other trace gases and aerosols. In this network Pallas represent boreal zone of the northern part of Europe.  In Pallas we measure year-round sinks and sources of greenhouse gases by dominant ecosystem types using micrometeorological methods.','http://en.ilmatieteenlaitos.fi/GHG-measurement-sites#Pallas_Sammaltunturi',NULL,13,'Pallaksentie 1961, 99300','Muonio',68.031287,24.150083); -- ICOS (Suomi)
INSERT INTO infra.palvelu VALUES(61,'Puijo','Puijo','Puijon luokan 2 ilmakehäasema on Ilmatieteen laitoksen ja Itä-Suomen yliopiston (Sovelletun fysiikan laitos) yhteistyössä ylläpitämä asema, jolla erityistutkimuskohteena ovat aerosoli-pilvi-ilmasto -vuorovaikutukset. Puijon mittausasema kuuluu SMEAR-verkostoon ja se sijaitsee Puijon näkötornin huipulla 306 m merenpinnan yläpuolella ja 224 m ympäröivän järvenpinnan yläpuolella. Puijolla mitataan kasvihuonekaasujen lisäksi useita aerosolihiukkasten ominaisuuksia (kokojakauma, pitoisuus, optiset ominaisuudet, kemiallinen koostumus), pilvipisaroiden ominaisuuksia (kokojakauma, vesipitoisuus) ja sääparametreja. Puijon mittausaseman lähellä on päästölähteitä (kaukolämpövoimala, sellutehdas, tieverkosto, asuinalueet) tietyllä sektorilla (välillä pohjoinen–itä–lounas). Sektorilla lounas–länsi-pohjoinen taas paikallisia päästölähteitä on vähän ja tältä sektorilta tulevaa ilmamassaa voidaan pitää taustailmana. Siten Puijolla voidaan tutkia erilaisten päästöjen vaikutusta aerosoli-pilvi-ilmasto -vuorovaikutukseen.','Puijo Class 2 Atmosphere station is a joint station of Finnish Meteorological Institute (FMI) and University of Kuopio (Department of Applied Physics), especially for studies of aerosol-cloud-climate interactions. The Puijo station is part of SMEAR station network, and it is located on top of an observation tower, at the height of 306 m above sea level and 224 m above surrounding lake level.  At Puijo, several aerosol and cloud properties (particle size distribution, concentration, optical properties, chemical composition; cloud droplet size distribution and liquid water content), as well as meteorological parameters, are measured. Around Puijo, there are several emission sources, such as a district heating plant, a paper mill, traffic routes, and residential areas, in certain directions (north–east–southwest). In the directions southwest–west–north there are few local emission sources, and thus air masses entering from these directions can be regarded as background air masses. Therefore, one can study the effect of emission sources on aerosol–cloud–climate interactions at Puijo.','http://en.ilmatieteenlaitos.fi/GHG-measurement-sites#Puijo',NULL,13,'Puijontie 135, 70300','Kuopio',62.909798,27.655564); -- ICOS (Suomi)
INSERT INTO infra.palvelu VALUES(62,'Hyytiälä','Hyytiälä','Hyytiälä on yhdistetty luokan 1 ekosysteemi- ja ilmakehäasema, joka mittaa kaikkia välttämättömiä ja tukevia ICOS-mittauksia. Asema sijaitsee Juupajoella Hyytiälän metsäaseman välittömässä läheisyydessä Etelä-Suomessa. Korkeassa tornissa (127 m) mitataan kasvihuonekaasujen pitoisuuksia, -voita ja meteorologisia suureita usealta korkeudelta. Matalammissa torneissa  havainnoidaan myös kasvihuonekaasujen voita, puiden toimintaa, ja niiden läheisyydessä maaperän toimintaa. Hyytiälä on myös osa SMEAR-asemaverkostoa.','Hyytiälä is Class 1 Ecosystem and Atmosphere station. The station is located close to the Hyytiälä Forestry Field Station in Juupajoki, Southern Finland. The station has several operation units to reach INTO infra.and above the tree canopy: a 127 m tall tower for greenhouse gas concentration, flux and meteorological measurements, shorter towers measure also fluxes and tree ecophysiology. Also soil processes are measured nearby. Hyytiälä is also a part of SMEAR station network.','http://www.atm.helsinki.fi/SMEAR/index.php/smear-ii',NULL,13,'Hyytiälän metsäasema, Hyytiäläntie 124','Korkeakoski',61.821062,24.309047); -- ICOS (Suomi)
-- kaksi palvelua lopussa id:t 188 ja 189
-- INSERT INTO infra.palvelu VALUES(PALVELU_ID,'Värriö','Värriö','Värriö on avustava ekosysteemiasema. Värriössä tutkitaan pohjoisen metsäekosysteemin toimintaa sekä ilmakehän prosesseja ja ilmansaasteiden kulkeutumista mittaamalla mm. kasvihuonekaasujen voita, meteorologisia suureita, hivenkaasujen pitoisuuksia ja ilmakehän pienhiukkasten muodostumista. Toimintansa vuonna 1991 aloittanut asema kuuluu Helsingin yliopiston Ilmakehätieteiden keskuksen hallintaan ja on osa vuonna 1967 perustettua Värriön tutkimusasema, joka sijaitsee Sallan kunnassa Värriön luonnonpuiston ympäröimänä. Tutkimusasemalla kerätään pitkiä havaintosarjoja mm. lumipeitteestä, fenologiasta, marja- ja käpysadoista ja linnuista ja hyönteisistä, joiden avulla seurataan pohjoisen metsä- ja tunturiluonnon muutoksia ja niihin vaikuttavia ilmastotekijöitä. Värriö on myös osa SMEAR-asemaverkostoa.','Värriö is an Associate Ecosystem station. Värriö incorporates research of the function and productivity of the subarctic forest ecosystem, atmospheric processes and air pollution and in the Arctic since 1991. Measurements at the station include greenhouse gas fluxes, meteorology, atmospheric trace gases and aerosol formation. The station belongs to the Institute for Atmospheric Research at the University of Helsinki and it is part of Värriö Subarctic Research Station which was founded in 1967. It is located in the Värriö Strict Nature Reserve in Eastern Lapland. The station has collected exceptionally long time series of the environment, including e.g. snow cover, phenology, berry and cone production, birds and insects, which reflect the changes in subarctic forests and fell ecosystems over decades. Värriö is also a part of SMEAR station network.','http://www.atm.helsinki.fi/SMEAR/index.php/smear-1','http://www.helsinki.fi/metsatieteet/varrio/',13,'Värriön tutkimusasema, Ainijärventie 114','Savukoski',67.761642,29.453345);  -- comment
-- INSERT INTO infra.palvelu VALUES(PALVELU_ID,'Kenttärova','Kenttärova','Kenttärova on avustava ekosysteemiasema. Mikrometeorologisten koko metsän vuomittausten lisäksi havainnoimme pitoisuuksia ilmakehässä ja maaperän kasvihuonekaasujen päästöjä. Paikalla on ilmatieteen laitoksen sääasema, jolla on havaittu useana vuonna Suomen korkein lumensyvyys. Kenttärova sijaitsee paksusammaleisessa kuusimetsässä Pallaksen mittauskeskittymässä 5 km etäisyydellä Pallaksesta. Kuusien korkeus on keskimäärin 15 m ja ikä 80-240 vuotta. Seassa on joitain hieskoivuja.','Kenttärova is an Associate Ecosystem station and located in the Pallas supersite. Micrometeorological carbon dioxide fluxes, greenhouse gas concentrations in and above the forest and soil emissions are monitored. There is a weather station of the Finnish Meteorological Institute at which, in many years, the highest snow depth in Finland has been recorded. The station is in a 80-240 year old Norway spruce forest. Average height of the spruce trees is 15 m. Soil is podzolic till.','http://en.ilmatieteenlaitos.fi/GHG-measurement-sites#Pallas_Kenttarova',NULL,13,'Pallaksentie 1961, 99300','Muonio',68.031287,24.150083);  -- comment
INSERT INTO infra.palvelu VALUES(63,'Utö','Utö','Utön luokan 2 ilmakehä- ja meritutkimusasema sijaitsee Utön saaressa uloimmassa saaristomeressä varsinaisen Itämeren pohjoisosassa. Saarella on ollut meteorologinen asema hyvin pitkään ja se oli ensimmäisiä ilmanlaadun monitorointiasemia. Asema tuottaa tietoa sekä ilmakehä- että meriverkostoon. Tarkat ilmapitoisuudet monitoroidaan mastosta 57m korkeudelta. Merihavainnot ja mikrometeorologiset vuot mitataan saaren länsiniemen kärjestä. Merihavaintoihin kuuluu kasvihuonekaasujen pitoisuudet merivedessä sekä useita biologisia, kemiallisia ja fysikaalisia muuttujia.','Utö Class 2 Atmosphere and Marine Research Station of the Finnish Meteorological Institute is located on Utö Island at the outermost edge of the Archipelago Sea, facing the Baltic proper. It has a long history as a meteorological and air pollution monitoring station. It is both an atmospheric site and oceanic site. Precise greenhouse gases are measured at 57 m high tower. Marine observations and micrometeorological fluxes are measured at a cape in the western part of the island. Marine observations include sea water concentrations of greenhouse gases and physical, biological and chemical parameters.','http://en.ilmatieteenlaitos.fi/GHG-measurement-sites#Uto',NULL,13,'Utö FI-21740','Parainen',59.779398,21.37795); -- ICOS (Suomi)
INSERT INTO infra.palvelu VALUES(64,'Sodankylä','Sodankylä','Sodankylä on luokan 1 ekosysteemiasema ja osa Maailman ilmatieteen järjestön (WMO) Global Atmosphere Watch (GAW) monitorointiverkon Pallas-Sodankylä-asemaa. Sodankylässä keskitytään kasvihuonekaasujen ekosysteemitaseiden, ilmakehän kokonaispitoisuuksien (TCCON-verkko) sekä pitoisuuksien vertikaalijakauman havainnointiin sekä monipuolisten meteorologisten muuttujien mittaamiseen. Sodankylän mittaukset ovat Arktisen tutkimuskeskuksen yhteydessä (http://fmiarc.fmi.fi/). Mittauskohteena on noin 100-vuotias männikkö, joka sijaitsee Kitisen joen muovaamalla karulla (Uliginosum-Vaccinium-Empetrum, UVET) hiekkakannaksella. Mikrometeorologisesti havainnoidun kaasunvaihdon lisäksi kasvihuonekaasujen pitoisuuksia mitataan metsän yläpuolella 48m korkeudelta. Mäntymetsän itäpuolella olevalla Halssinaapa-suolla mitataan mikrometeorologisesti kasvihuonekaasujen päästöjä ja nieluja.','Sodankylä is Class 1 Ecosystem station and part of the Pallas-Sodankylä Global Atmosphere Watch (GAW) monitoring station of the World Meteorological Organization (WMO). Sodankylä monitors greenhouse gas fluxes of a pine forest, together with total atmospheric concentrations (TCCON-network) and vertical distribution concentrations up to the stratosphere. Measurements are done in connection with the Arctic Research Center of FMI (http://fmiarc.fmi.fi/). Greenhouse gas fluxes of about 100-year old Scots pine forest are monitored on fluvial sandy Podzol close to river Kitinen. Forest type is nutrient poor, Uliginosum-Vaccinium-Empetrum UVET. In addition to fluxes, greenhouse gas concentrations are measured above the forest at a height of 48m. On a close-by Halssinaapa fen, greenhouse gas fluxes are measured as well on a year-round basis.','http://en.ilmatieteenlaitos.fi/GHG-measurement-sites#Sodankyla',NULL,13,'Lapin ilmatieteellinen tutkimuskeskus Tähteläntie 62, 99600','Sodankylä',67.365444,26.628586); -- ICOS (Suomi)
INSERT INTO infra.palvelu VALUES(65,'Siikaneva','Siikaneva','Siikanevan luokan 2 ekosysteemiasema sijaitsee lähes luonnontilaisella suolla Hyytiälän metsäaseman lähellä. Asemalla mitataan kasvihuonekaasujen voita, meteorologisia suureita sekä turpeen fysikaalisia suureita yhdessä ekologisten havaintojen kanssa.','Siikaneva is Class 2 Ecosystem station. The Siikaneva fen is a protected and nearly pristine large open peatland area close to the Hyytiälä Forestry Field Station. Measurements cover greenhouse gas fluxes, meteorological quantities, and physical quantities of peat together with ecological observations.','http://www.icos-infrastructure.fi/?q=node/11#Siikaneva',NULL,13,'Hyytiälän metsäasema, Hyytiäläntie 124','Korkeakoski',61.821062,24.309047); -- ICOS (Suomi)
INSERT INTO infra.palvelu VALUES(66,'Kaamanen','Kaamanen','Kaamanen on avustava ekosysteemiasema. Kaamasen suo on aapasuo, jossa vähäravinteisten jänteiden verkosto ympäröi ravinteikkaita rimpiä. Ilmastollisesti se on jo lähellä vyöhykettä, jossa voi esiintyä palsoja. Asemalla mitataan metaani- ja hiilidioksidivuota. Asemalta mitataan maailman pisintä aikasarjaa suon mikrometeorologisesta hiilidioksidivuosta.','The Associate Ecosystem site Kaamanen is located in a mesotrophic flark fen in northern Finland. It is climatologically close to the region where palsa formation may take place. The station monitors methane and carbon dioxide fluxes. The world’s longest record of micrometeorological carbon dioxide flux on a wetland is measured at Kaamanen.','http://en.ilmatieteenlaitos.fi/GHG-measurement-sites#Kaamanen',NULL,13,'Pässirovantie, 99910','Inari',69.139496,27.226585); -- ICOS (Suomi)
INSERT INTO infra.palvelu VALUES(67,'Lompolojänkkä','Lompolojänkkä','Lompolojänkkä on luokan 2 ekosysteemiasema. Lompolojänkän ravinteikas aapasuo sijaitsee Pallaksen mittauskeskittymässä 5 km etäisyydellä Sammaltunturista. Se on avoin sarasuo 150 km napapiirin pohjoispuolella. Mikrometeorologisten vuomittausten lisäksi pitoisuuksia havainnoidaan ilmakehässä ja maaperässä.','Lompolojänkkä is Class 2 Ecosystem station. As part of the Pallas supersite, greenhouse gas fluxes are monitored at a wetland called Lompolojänkkä located 5 km from the Pallas site. It is an open, nutrient-rich sedge fen. In addition to micrometeorological fluxes, concentrations in the atmosphere and soil are monitored as well.','http://en.ilmatieteenlaitos.fi/GHG-measurement-sites#Pallas_Lompolojankka',NULL,13,'Pallaksentie 1961, 99300','Muonio',68.031287,24.150083); -- ICOS (Suomi)
INSERT INTO infra.palvelu VALUES(68,'Kuivajärvi','Kuivajärvi','Kuivajärvi on avustava ekosysteemiasema. Kuivajärvellä mitataan kasvihuonekaasujen voita, meteorologisia suureita sekä fysikaalis-limnologisia suureita eri syvyyksiltä vedessä. Kuivajärven havainnot muodostavat maailman pisimmän jatkuvatoimisen vuoaikasarjan järviekosysteemeille. Myös purojen ja lähivaluma-alueen havainnointi sisältyvät Kuivajärven mittauksiin. Asema sijaitsee Hyytiälän metsäaseman välittömässä läheisyydessä. Kuivajärvi on myös osa SMEAR-asemaverkostoa.','Kuivajärvi is Associate Ecosystem station. Kuivajärvi lake station includes fluxes of greenhouse gases, meteorological quantities and physical-limnological quantities at several depths in the water. The observations at Kuivajärvi form the longest on-going flux series in the world for a lake ecosystem. Water quality measurements are also taken from the incoming and outgoing rivers and at the riparian zone. Kuivajärvi is also a part of SMEAR station network.','http://www.icos-infrastructure.fi/?q=node/11#Kuivajarvi',NULL,13,'Hyytiälän metsäasema, Hyytiäläntie 124','Korkeakoski',61.821062,24.309047); -- ICOS (Suomi)
INSERT INTO infra.palvelu VALUES(69,'Lettosuo','Lettosuo','Lettosuon avustava ekosysteemiasema sijaitsee Etelä-Suomessa Tammelassa. Mikrometeorologisen vuon lisäksi maaperän ja maakasvillisuuden kaasujenvaihtoa mitataan automaattikammioilla. Lettosuo oli luonnontilaisena ravinteikas osin puustoinen suo, joka ojitettiin metsänkasvatusta varten vuonna 1970. Nykyisin se on noin 20m korkea mänty ja hieskoivumetsä, jossa on runsaasti kuusta alikasvustona.','Lettosuo is Associate Ecosystem station in Tammela. In addition to micrometeorological fluxes, automated chambers monitor soil and ground flora gas exchange. Lettosuo fen was originally herb-rich tall sedge birch-pine fen which was drained for forestry in the early 1970. Tree stand is dominated by Scots pine and downy birch in the overstorey with a dense understorey of Norway spruce.','http://en.ilmatieteenlaitos.fi/GHG-measurement-sites#Lettosuo',NULL,13,'Mustijoentie, 31350','Tammela',60.64647,23.943917); -- ICOS (Suomi)
INSERT INTO infra.palvelu VALUES(70,'Kumpula','Kumpula','Kumpulan kaupunkiympäristön avustava ekosysteemiasema Helsingissä havainnoi kasvihuonekaasujen voita, meteorologiaa sekä kaupunkikasvillisuuden ekofysiologiaa. Asema kuuluu myös SMEAR-asemaverkostoon.','The urban Associate Ecosystem station in Kumpula, Helsinki, includes greenhouse gas fluxes, meteorological quantities and ecophysiology of urban vegetation. Kumpula is also a part of SMEAR station network.','http://en.ilmatieteenlaitos.fi/GHG-measurement-sites#Kumpula',NULL,13,'Erik Palménin aukio 1','Helsinki',60.203839,24.961707); -- ICOS (Suomi)



INSERT INTO infra.palvelu VALUES(71,'Hiilipuu','Carbon Tree','Hiilipuu on interaktiivinen sivusto, jossa voi seurata SMEAR II-asemalla kasvavan männyn toimintaa reaaliajassa, muokata ympäristöolosuhteita ja tutustua tarkemmin hiilensidonnan perusprosesseihin.  Hiilipuu-sivusto esittää dataa taiteellisen animaation ja perinteisempien kuvaajien keinoin. Sivusto on suunnattu laajalle yleisölle, erityisesti kouluille.','CarbonTree website presents both artistic animation and traditional graphs to visualize the real time uptake and release of carbon in a Scots pine forest at SMEAR II. Besides the on-line data, the web pages include interactivity: a user can change the state of the environmental factors and see the effect on the rate of CO2 exchange. Carbon Tree is targeted to wide audience, especially non-experts, general public and schools.','http://www.carbontree.fi/','http://www.hiilipuu.fi/',11,NULL,NULL,NULL,NULL); -- INAR RI
INSERT INTO infra.palvelu VALUES(72,'SMEAR I','SMEAR I','SMEAR I perustettiin vuonna 1991 Värriön tutkimusasemalle mittaamaan Itä-Lapin saastelaskeumaa, joka tuli Kuolan niemimaan kaivostoiminnasta ja teollisuudesta. Nykyään mittausaktiivisuus asemalla on kasvanut kattamaan ilmansaasteiden lisäksi monipuolisesti sää-, kaasu- ja partikkelimittauksia sekä puiden ekofysiologisia mittauksia. Lisäksi Värriön tutkimusasema tuottaa biologista perustietoa subarktisen luonnon vuodenkierrosta ja sen kautta ilmastonmuutoksen vaikutuksista koko toimintansa ajalta (1967 lähtien).','The SMEAR I measuring station was set up in 1991 at Värriö Subarctic Research Station to measure the transported air pollution to Eastern Lapland from the mining and industry in the Kola- peninsula in Russia. Today measuring activity on the station has increased, together with the SMEAR II station to cover ecophysiology, weather, gas and particle measurements in addition to the air pollutants measurements. In addition to that, the Värriö Subarctic Station provides basic data on many ecological variables, linking to the effects of climate change since the start of the station in 1967.','http://www.atm.helsinki.fi/SMEAR/index.php/smear-1',NULL,13,NULL,'Savukoski',67.292419,28.158546); -- INAR RI
INSERT INTO infra.palvelu VALUES(73,'SMEAR II','SMEAR II','Asema sijaitsee 54-vuotiaassa (2015) mäntymetsässä Juupajoella. Asemalla on useita mittausyksiköitä metsikön sisällä ja latvuston yläpuolella: 128m korkea torni ilmakehä- ja virtausmittauksille, 18m pitkä torni säteily- ja virtausmittauksille, toinen vastaava torni puiden ekofysiologisille mittauksille, sekä 35m korkea torni aerosolimittauksille. Maaperä- ja maaperän vesi-mittauksia tehdään kahdella valuma-alueella, ja auringon säteilymittauksia aallonpituusalueella 280-800nm.','The station is situated in a 54-year-old (2015) Scots pine stand in Juupajoki. It has several operation units to reach INTO infra.and above the stand canopy: a 128 m high tower for atmospheric and flux measurements, one 18 m tower for irradiation and flux measurements, another for tree ecophysiology measurements and 35 m walk-up tower for aerosol measurements. We perform soil and soil-water measurements on two water catchment areas. In the vicinity of the station we measure solar irradiance from 280 to 800 nm with a radio spectrometer.','http://www.atm.helsinki.fi/SMEAR/index.php/smear-ii',NULL,13,NULL,'Juupajoki',61.796116,24.369975); -- INAR RI
INSERT INTO infra.palvelu VALUES(74,'SMEAR III','SMEAR III','SMEAR III asema aloitti ilmakehämittauksensa Helsingissä syksyllä 2004. SMEAR II aseman tarkoitus on tuottaa tietoa urbaanista ympäristöstä, missä ihmisen vaikutus on voimakas. Mittaukset kattavat aerosoli-dynamiikkaa, ilmakehäkemiaa, mikrometeorologiaa, sään seurantaa, ja puiden ekofysiologiaa. Asemaa operoivat yhdessä Helsingin yliopiston fysiikan-, kemian- ja metsätieteenlaitokset sekä Ilmatieteen laitos.','The SMEAR III station started in Helsinki in autumn 2004. The idea was to expand the versatile atmospheric measurements to an urban area where the anthropogenic impacts are more evident. The instrumentation covers aerosol dynamics, atmospheric chemistry, micrometeorology, weather monitoring and ecophysiology of trees growing in the urban environment. The most characteristic features of the station are its location at high latitude and the vicinity of sea. The station is operated by the Departments of Physical Sciences, Chemistry and Forest Ecology (University of Helsinki), and the Finnish Meteorological Institute (FMI).','http://www.atm.helsinki.fi/SMEAR/index.php/smear-iii',NULL,13,NULL,'Helsinki',60.173324,24.941025); -- INAR RI
INSERT INTO infra.palvelu VALUES(75,'SMEAR IV','SMEAR IV','SMEAR IV asema mittaa aerosolipartikkelien ja pilvien vuorovaikutusta. Mittaukset kattavat aerosolidynamiikkaa, pilvipisaroiden ominaisuuksia, optiikkaa, trace-kaasuja ja meteorologisia mittauksia. SMEAR IV sijaitsee kahdessa paikassa Puijon tornissa ja Savilahdella. Puijossa mittaukset tehdään 306 m ja Savilahdella 87 m merenpinnan yläpuolella. Asemaa operoi yhdessä Ilmatieteen laitoksen Kuopion yksikkö ja Aerosolifysiikan ryhmä Itä-Suomen yliopistosta.','At SMEAR IV station the idea is to study the interactions of aerosol particles and clouds. The instrumentation covers measurement of aerosol dynamics, cloud droplet properties, optical measurements, trace gases and meteorological parameters. The characteristic features at SMEAR IV are the elevated location in a semi-urban area and the site being frequently in cloud. The station is situated in two locations, Puijo and Savilahti. In Puijo, the measurements are made at the height of 306 m above sea level and 230 m above the surrounding lake level. The Savilahti site is at the Kuopio campus area of the UEF, approximately 2 km southwest from Puijo. The site is at the height of 87 m above sea level and 5 m above the surrounding lake level. The station is operated by the Atmospheric Observations group at the Kuopio Unit of Finnish Meteorological Institute (FMI) and the Aerosol Physics group at the Department of Applied Physics of the Kuopio campus of University of Eastern Finland (UEF).','http://www.atm.helsinki.fi/SMEAR/index.php/smear-iv',NULL,13,NULL,'Kuopio',62.893335,27.679338); -- INAR RI
INSERT INTO infra.palvelu VALUES(76,'SmartSMEAR','SmartSMEAR','SmartSMEAR on työkalu Helsingin yliopiston SMEAR-asemilla tuotetun mittausaineiston visualisointiin ja käyttöön. Aineisto käsittää jatkuvia ilmakehä-, ainevirtaus-, maaperä-, puiden fysiologia- ja vedenlaatumittauksia.','SmartSMEAR is data visualization and download tool for the database of continuous atmospheric, flux, soil, tree physiological and water quality measurements at SMEAR research stations of the University of Helsinki. Air mass back-trajectories are also provided for studying the connection between air mass movements and atmospheric observations at the stationary measurement sites.','http://avaa.tdata.fi/web/smart/smear','http://avaa.tdata.fi/web/smart/smear',11,NULL,NULL,NULL,NULL); -- INAR RI
INSERT INTO infra.palvelu VALUES(77,'Welgegundin mittausasema','Welgegund Measurement Station','Mittaukset kattavat aerosolien ja ionien kokojakauman, aerosolien optiset ominaisuudet, trace-kaasut, CO2-vuot, säteilyn ja vesitaseen sekä monipuoliset meteorologiset havainnot. Asemaa operoi yhteistyössä Helsingin yliopisto, Ilmatieteen laitos ja North-West Yliopisto (NWU).','The observations at the site include aerosol and ion size distribution measurements, aerosol optical properties, trace gases, CO2-fluxes, radiation and water balance, and comprehensive meteorological observations. The site is operated jointly by the North-West University (NWU), the University of Helsinki (UH) and the Finnish Meteorological Institute (FMI).','http://www.welgegund.org/',NULL,13,NULL,'South Africa',-30.559482,22.937506); -- INAR RI
INSERT INTO infra.palvelu VALUES(78,'Pallas-Sodankylä GAW asema','Pallas-Sodankylä GAW station','Pallas-Sodankylä GAW asema kuuluu globaaleihin GAW and GCW mittausverkostoihin. Asemalta kerätään aineistoa maaperän, lumen, kasvillisuuden ja ilmakehän prosesseista ja niiden vuorovaikutuksista. Asema keskittyy satelliittiaineiston keruuseen ja testaamiseen boreaalisessa ja sub-arktisessa ympäristössä.','The Pallas-Sodankylä infrastructure for satellite data CAL-VAL purposes forms a unique setup in boreal forest and sub-arctic terrestrial environment. The infrastructure is currently used as a primary test site for major space agencies including the European Space Agency (ESA), NASA and EUMETSAT. Additionally, this research infrastructure provides in situ data on soil-snow-vegetation- atmosphere processes as a primary site for various international networks including WMO Global Atmosphere Watch (GAW) and WMO Global Cryosphere Watch (GCW). The site is equipped with reference systems of global monitoring satellite instruments enabling the investigation of the feasibility of Earth Observation data to climate processes monitoring. This includes the monitoring of CO2 and CH4 fluxes and absolute concentrations.','http://fmigaw.fmi.fi/',NULL,13,'Pallastunturi','Muonio',68.1,24); -- INAR RI
-- lisää palveluita lopussa id:llä xxx

-- OGIIR - ei saatavilla olevia tietoja palveluista

INSERT INTO infra.palvelu VALUES(89,'Bioinformatiikka','Bioinformatics','Bioinformatiikkaverkoston keskeisimpinä tehtävinä on tarjota palveluja sekä bioalan tutkijoille (esim. tulosten analysointi, koejärjestelyt ja ohjelmistot) että bioinformaatikoille (esim. ohjelmointirajapinnat tiedostoihin, teknologioiden siirrot ja teknologiapalvelut).','The major objective of Bioinformatics Infrastructure network is to provide services for both bioscientists (e.g., data analysis, experimental design and software) and bioinformaticians (e.g., APIs to databases, technology transfer and technology platforms).','http://www.biocenter.fi/technology-platform-services/bioinformatics.html','http://www.biocenter.fi/biokeskus-suomi.html',12,NULL,NULL,NULL,NULL); -- Biokeskus Suomi
INSERT INTO infra.palvelu VALUES(90,'Biologinen kuvantaminen','Biological imaging','Biologinen kuvantaminen kattaa laaja-alaisesti mm. ionien ja erilaisten molekyylien ja solutyyppien visualisoinnin soluissa ja kudoksissa sekä niiden ei-invasiivinen kuvantaminen koe-eläimissä. Kuvantamismenetelmien merkitys bioalan tutkimukselle on kasvava etenkin siksi, että uusia tekniikoita ja merkkiaineita on kehitetty viime aikoina esim. elävien solujen kuvantamiselle käyttäen fluoresoivia proteiineja ja konfokaalimikroskopiaa sekä täysin uudenlaisia mikroskopiamenetelmiä.','Biological imaging ranges from the visualization of ions, different molecules and cell types in cells and tissues to the non-invasive imaging of full size animals. The importance of imaging has grown tremendously since the development of methods and markers for live cell imaging, such as green fluorescent proteins for confocal microscopy, as well as novel microscopic principles.','http://www.biocenter.fi/technology-platform-services/biological-imaging.html#EM','http://www.biocenter.fi/biokeskus-suomi.html',12,NULL,NULL,NULL,NULL); -- Biokeskus Suomi
INSERT INTO infra.palvelu VALUES(91,'Genominlaajuiset menetelmät','Genome-wide methods','Genominlaajuiset menetelmät kattavat mm. DNA:n ja RNA:n sekvensoinnin, RNA:n analysointimenetelmät ja laaja-alaiset geenien toimintojen seulonnat, ja ne ovat muuttaneet nopeasti ja perusteellisesti bio- ja lääketieteellisen tutkimuksen luonteen. Genetiikan/genomiikan ja genominlaajuisen biologian sekä geenien toiminnan säätelyn ja geeni-ilmentymisen tutkimusmenetelmiä on kehitetty tämän Biokeskus Suomen verkoston toimesta. Geenien vaimentamiseen ja yli-ilmentämiseen tarvittavat reagenssit ja kirjastot ovat myös kansallisesti saatavana, kustannuksiltaan edullisena palvelutoimintana.','Genome-wide methods, including DNA and RNA sequencing, RNA analyses, and high-throughput genetic screens have rapidly and profoundly changed basic biological science and biomedicine. Genetics/genomics and genome-scale biology services as well as gene expression/regulation services have been developed by this Biocenter Finland network. Cost-effective access to reagents and libraries to enable knockdowns or overexpression of genes together with high-throughput facilities are also provided as a national-scale service.','http://www.biocenter.fi/technology-platform-services/genome-wide-methods.html','http://www.biocenter.fi/biokeskus-suomi.html',12,NULL,NULL,NULL,NULL); -- Biokeskus Suomi
INSERT INTO infra.palvelu VALUES(92,'Malliorganismit','Model organisms','Muuntogeeniset hiiret ovat tämän hetken tärkeimmät malliorganismit ihmisen normaalien elintoimintojen ymmärtämiselle. Ne ovat myös arvokkaita sairauksien eläinmalleja, ja niillä on sen vuoksi erittäin tärkeä merkitys kehitettäessä ihmisen sairauksien uusia hoitomuotoja. Evoluutio on säilyttänyt organismien tärkeimmät fysiologiset mekanismit, ja siksi ei-imettäväiset koe-eläimet (mm. banaanikärpänen ja seeprakala) tarjoavat myös erinomaisen käyttökelpoiset mallit genomitutkimukselle ja ihmisen sairauksille, etenkin lyhyen elinkaarensa ja geeniensä muokkauksen helppouden vuoksi.','Gene-targeted mice are currently the most important model organisms to understand the molecular basis of health and disease in man. They serve as suitable disease models and have an important role in the development of novel therapies for human diseases. Most important physiological mechanisms have been conserved throughout evolution, and therefore, non-mammalian animal models (e.g., fruit fly and zebrafish) have a number of benefits, such as short developmental time and easiness for genetic manipulation, in studies of genome biology as it relates to human diseases.','http://www.biocenter.fi/technology-platform-services/model-organisms.html','http://www.biocenter.fi/biokeskus-suomi.html',12,NULL,NULL,NULL,NULL); -- Biokeskus Suomi
INSERT INTO infra.palvelu VALUES(93,'Proteomiikka ja metabolomiikka','Proteomics and metabolomics','Proteomiikka on bioalan tutkimuksen keskeinen teknologia, jonka avulla voidaan karakterisoida ja kvantitoida sekä ajallisesti että paikallisesti erilaisia proteiineja jokseenkin kaikissa biologisissa systeemeissä. Tällä teknologialla on myös mahdollista löytää ja kvantitoida erilaiset proteiinien translaation jälkeiset muokkaustapahtumat sekä tunnistaa proteiinien väliset vuorovaikutukset ja proteiinien erityisominaisuudet. Metabolomiikka käsittää puolestaan pienten molekyylien laaja-alaisen analytiikan sofistikoiduilla menetelmillä biologisista nesteistä ja kudoksista, ja sillä on merkittäviä sovellusalueita sekä bio- että lääketieteissä.','Proteomics is an essential technology in biosciences that enables characterization and temporal and spatial quantitation of proteins at various locations in practically all biological systems. It also affords measurement and discovery of post-translational protein modifications, protein-protein interactions and protein properties. Metabolomics, in turn, entails small molecule analytics that has applications in different fields of bio- and medical sciences. Wide range of metabolites in biological fluids and tissues can be measured by using sophisticated analytical technologies.','http://www.biocenter.fi/technology-platform-services/proteomics-and-metabolomics.html','http://www.biocenter.fi/biokeskus-suomi.html',12,NULL,NULL,NULL,NULL); -- Biokeskus Suomi
INSERT INTO infra.palvelu VALUES(94,'Kantasolut ja biomateriaalit','Stem cell and biomaterials','Kantasolututkimus on etenkin lääketieteessä erittäin nopeasti kehittyvä tieteenala. Jo tällä hetkellä kantasolututkimus on mahdollistanut uudet tutkimuksen lähestymistavat mm. tautimallien ja lääkkeiden kehittämiselle sekä kudosten regeneraation ja toiminnallisten kolmiulotteisten rakenteiden (organoidien) tutkimiselle. Ensisijainen toiminta keskittyy eri lähteistä olevien kantasolujen tuottamisen tieto-taitoon ja menetelmiin. Kantasolujen käyttöön perustuvien biomateriaali-implanttien ja organoidien kehitystyö on myös meneillä.','Stem cell research is a rapidly developing area of biomedicine. Recent stem cell technologies have enabled several new avenues for biomedical research, such as novel development of disease models and drugs, tissue regeneration and functional three-dimensional structures (organoids). Main efforts are directed towards obtaining knowledge and protocols to generate stem cells from different sources. The network aims also to develop adult stem cell-based tissue engineered biomaterial implants and organoids.','http://www.biocenter.fi/technology-platform-services/stem-cells-and-biomaterials.html','http://www.biocenter.fi/biokeskus-suomi.html',12,NULL,NULL,NULL,NULL); -- Biokeskus Suomi
INSERT INTO infra.palvelu VALUES(95,'Rakennebiologia','Structural biology','Rakennebiologia ja biofysiikka käsittävät laajan kokonaisuuden: proteiinien tuotosta niiden rakenteen selvittämiseen ja toimintamekanismien tietokonemallintamiseen. Tämän kansallisen verkoston toimintaan kuuluu neljä osa-aluetta, joiden kaikkien erityiskohteena on makromolekyylien rakenteen selvittäminen ja toimintamekanismien tutkiminen erilaisilla dynaamisilla spektroskopiatekniikoilla. Käytössä oleviin menetelmiin kuuluvat mm. röntgensädekristallografia, ydinmagneettinen resonanssispektroskopia (NMR), erilaiset muut dynaamiset biofysikaaliset menetelmät kuten korkean erotuskyvyn massaspektrometria ja elektronimikroskopia.','Structural biology and biophysics covers a wide range of topics, from protein production via structure determinations to biocomputational analysis. This national-scale network comprises four major disciplines, all focused on experimental determination of macromolecular structures and elucidation of mechanisms by various time-resolved techniques. They are X-ray crystallography, nuclear magnetic resonance (NMR) spectroscopy, other time-resolved biophysical techniques, including high-resolution mass spectrometry equipment, and electron microscopy.','http://www.biocenter.fi/technology-platform-services/structural-biology.html','http://www.biocenter.fi/biokeskus-suomi.html',12,NULL,NULL,NULL,NULL); -- Biokeskus Suomi
INSERT INTO infra.palvelu VALUES(96,'Translationaaliset teknologiat','Translational technologies','Teknologia-alustan yksi fokusalue on toimittaa tutkijoiden käyttöön web-pohjaiset digitoidut kudosnäytteet ja niihin liittyvät kliiniset ja fenotyyppitiedot. Palvelu voi tuottaa kudosleikkeet digitoidussa muodossa, web-pohjaisen mikroskopian skannatuille kudosleikkeille ja värjättyjen kudosleikkeiden kvantitatiivisen määrityksen sekä kudosleikkeen automaattisen, kuviotunnistukseen perustuvan rakenneluokituksen. Toinen fokusalue tarjoaa monipuolisia palveluita kemiallisten yhdisteiden eriasteisissa ja monipuolisissa seulonnoissa, mitkä käsittävät mm. lääkeaineiden herkkyyden ja resistenssin testausmenetelmät, tiedostoseulonnat, kemikaali-informatiikan, laajan kemikaalikokoelman vapaan saatavuuden, lääkeaineiden testauksen ja käyttäjäkoulutuksen.','The platform focuses in part on web-based access to digitized tissue samples and associated clinical/phenotypic data. Through the services of whole-slide tissue digitization, web-based viewing of scanned tissue samples and quantitative microscopy readout of tissue stainings, as well as automated, pattern recognition based morphological classification are provided. In addtition, coordinated services are provided in chemical screening – from low-to ultra high throughput – with a broad range of readouts, including such as drug sensitivity and resistance testing methodology, virtual screening, chemoinformatics, open access to a large national chemical collection, drug testing, and user base education.','http://www.biocenter.fi/technology-platform-services/translational-technologies.html','http://www.biocenter.fi/biokeskus-suomi.html',12,NULL,NULL,NULL,NULL); -- Biokeskus Suomi
INSERT INTO infra.palvelu VALUES(97,'Viruspohjainen geenien siirto','Viral gene transfer','Geeninsiirtotekniikat ovat tärkeitä geenien toiminnan ja uusien hoitomuotojen kehittämisen työkaluja. Tehokkaita geeninsiirtoja – joko lyhytaikaisia tai pysyviä – tarvitaan esim. uusien solulinjojen ja eläinmallien luomiseen. Viruksia käytetään laajalti vietäessä geenejä kohdennetusti haluttuihin solutyyppeihin tai haluttujen geenien toiminnan vaimentamisessa käyttäen esim. RNAi-teknologiaa. Tämä teknologia-alustan palvelut monien erilaisten viruspohjaisten vektoreiden tuottamisessa on toteutettu siten, että Biokeskus Suomen partnerit tuottavat tiedeyhteisön käyttöön kyseisiä virusvektoreita osaamisensa ja kokemuksensa perusteella tällä alalla.','Gene transfer techniques are important tools to study gene function and develop new therapies. Efficient transient and stable gene transfer methods are needed, for example, for generation of new cell lines or animal models. Viruses are largely used as the most efficient means to target and deliver genes INTO infra.appropriate cells or to silence gene function(s) by various methods, such as the RNAi technology. The Viral gene transfer technology platform has devised the division of tasks to produce a large number virus vectors for the use of the bioscience community by different Biocenter Finland partners according to their expertise and experience in this field.','http://www.biocenter.fi/technology-platform-services/viral-gene-transfer.html','http://www.biocenter.fi/biokeskus-suomi.html',12,NULL,NULL,NULL,NULL); -- Biokeskus Suomi

INSERT INTO infra.palvelu VALUES(98,NULL,'Department of biotechnology (University of Turku)',NULL,NULL,'http://www.biocity.turku.fi/research-programs/diagnostic-technologies-and-applications/',NULL,13,NULL,NULL,NULL,NULL); -- EATRIS (Suomi)
INSERT INTO infra.palvelu VALUES(99,'FIMM teknologiakeskus','FIMM Institute for Molecular Medicine Finland','Suomen molekyylilääketieteen instituutti (FIMM) on kansainvälinen tutkimuslaitos, jonka toiminta keskittyy sairauksien molekyylitason mekanismien selvittämiseen genetiikan ja lääketieteellisen systeemibiologian menetelmin.','Institute for Molecular Medicine Finland (FIMM) is an international research institute in Helsinki focusing on human genomics and personalized medicine. FIMM integrates molecular medicine research, Technology Centre and Biobanking Infrastructures “under one roof” and thereby promotes translational research and adoption of personalized medicine in health care.','https://www.fimm.fi/','https://www.fimm.fi/fi',13,NULL,NULL,NULL,NULL); -- EATRIS (Suomi)
INSERT INTO infra.palvelu VALUES(100,'Regea kudospankki ja solukeskus','Regea Cell and Tissue Center','Regean tavoitteena on edesauttaa kudossiirtojen ja kudosteknologisten hoitomuotojen yleistymistä ja siten mahdollistaa kudospuutoksista ja kudosten toiminnallisuuden ongelmista kärsivien potilaiden entistä tehokkaampi ja toimivampi hoito.','Regea Cell and Tissue Center is a clinical tissue bank that meets the requirements of the national legislation and EU directives. The tissue bank processes and supplies tissues (bone, tendon, amniotic membrane, sclera and cornea) for clinical use. Regea Cell and Tissue Center also produces adipose tissue derived stem cell products for the treatment of bone defects (so called ATMP products), following GMP guidelines.','http://www.regea.fi/index.php?l=en','http://www.regea.fi/',13,'Biokatu 12','Tampere',61.506938,23.814896); -- EATRIS (Suomi)
INSERT INTO infra.palvelu VALUES(101,'Turku PET keskus','Turku PET Centre',NULL,'Turku PET Centre is a Finnish National Research Institute for the use of short-lived positron emitting isotopes in the field of medical research. The Centre has two major functions, high quality scientific research and diagnostic service for the whole country.','http://www.turkupetcentre.fi/',NULL,13,'Kiinamyllynkatu 4-8','Turku',60.453384,22.289281); -- EATRIS (Suomi)
INSERT INTO infra.palvelu VALUES(102,'VTT','VTT','Teknologian tutkimuskeskus VTT Oy on kansallisella statuksella toimiva Pohjoismaiden johtava tutkimus- ja teknologiayhtiö. Tuotamme tutkimuksen ja tiedon kautta asiantuntijapalveluja kotimaisille ja kansainvälisille asiakkaillemme, liike-elämälle, julkiselle sektorille ja kumppaneillemme. Taustallamme on 73 vuotta tiedettä, huippututkimusta, tuloksia ja näyttöjä asiakkaidemme kilpailukyvyn kasvusta ja menestyksestä.','VTT Technical Research Centre of Finland Ltd is the leading research and technology company in the Nordic countries. VTT has a national mandate in Finland. We use our research and knowledge to provide expert services for our domestic and international customers and partners. We serve both private and public sectors.','http://www.vttresearch.com/','http://www.vtt.fi/',13,NULL,NULL,NULL,NULL); -- EATRIS (Suomi)
INSERT INTO infra.palvelu VALUES(103,NULL,'National virus vector Laboratory (University of Eastern Finland)',NULL,'National Virus Vector Laboratory provides excellent facility for production of adenoviral, lentiviral, AAV and baculoviral vectors for in vitro and in vivo work. Laboratory scale and larger scale production methods are available with quality controlled vector backbones. Unit operates one GMP suite and four vector laboratories which are dedicated for each of the vector type. Unit will also give technological support for the use of viral vectors including support for the application of permits required by gene technology law.','https://www2.uef.fi/fi/bck/national-virus-vector-laboratory',NULL,13,NULL,'Kuopio',62.893335,27.679338); -- EATRIS (Suomi)

INSERT INTO infra.palvelu VALUES(119,NULL,'Cell Imaging Core',NULL,'The Cell Imaging Core (CIC) is a centralized core facility where end users have access to instruments and where they receive the support needed to carry out conventional and advanced imaging techniques. The CIC also offers related technologies, such as flow cytometry and atomic force microscopy. The facility collaborates with various instrument and service providers on the Turku campus to be able to offer a wide range of state-of-the-art equipment openly to all researchers in a coordinated manner.','http://www.btk.fi/cell-imaging/front-page/',NULL,13,'Tykistökatu 6','Turku',60.449304,22.293225); -- EuBI (Suomi)
INSERT INTO infra.palvelu VALUES(120,'Turku PET keskus','Turku PET Centre',NULL,'Turku PET Centre is a Finnish National Research Institute for the use of short-lived positron emitting isotopes in the field of medical research. The Centre has two major functions, high quality scientific research and diagnostic service for the whole country.','http://www.turkupetcentre.fi/',NULL,13,'Kiinamyllynkatu 4-8','Turku',60.453384,22.289281); -- EuBI (Suomi)
INSERT INTO infra.palvelu VALUES(121,NULL,'Turku Centre for Disease Modelling',NULL,'TCDM holds know-how on mouse model generation, in vivo imaging in live mice and biomarker analyses, and expertise on phenotyping of the mouse models with a special reference on bone, cardiovascular, intestinal and thyroid diseases, obesity, oncology, reproduction, and on both pharmacological and dietary interventions on mouse models to challenge the phenotype.The phenotyping facilities are well supported by a well-structured tissue and cell imaging unit, with broad expertise on histology, immunohistochemistry and electron microscopy.','http://www.tcdm.fi/facilities-and-services/',NULL,13,'Kiinamyllynkatu 10','Turku',60.451821,22.292333); -- EuBI (Suomi)
INSERT INTO infra.palvelu VALUES(122,NULL,'Laboratory of Electon Microscopy (EM)',NULL,'EM laboratory is a core facility of the Medical faculty of the University of Turku and services are open for everyone who needs electron microscopy in their work. The laboratory offers all the services needed for electron microscopic studies: Specimen preparation, Imaging with electron microscopes, Consultation in questions related to EM.','http://www.utu.fi/en/units/med/units/em/Pages/home.aspx',NULL,13,'Kiinamyllynkatu 11','Turku',60.451686,22.288846); -- EuBI (Suomi)
INSERT INTO infra.palvelu VALUES(123,NULL,'BioImageXD',NULL,'BioImageXD is a multi-purpose post-processing tool for bioimaging data. The software offers one of the largest collections of tools available for processing, visualizing and analyzing multidimensional bioimages. It can be used for instance to visualize and animate complex 4D images, process and register image series, motiona tracking and quantitative analysis of various parameters, such as cellular internalization - also in high throughput. BioImageXD is open source and can be used freely, and services can be offered also in user training, analysis protocol definition and tailored analyses and feature development.','http://www.bioimagexd.net/',NULL,11,NULL,NULL,NULL,NULL); -- EuBI (Suomi)
-- INSERT INTO infra.palvelu VALUES(124,NULL,'Flowing Software',NULL,'Flowing Software is a project which combines high throughput data analysis with flowing usability. Easy-to-use visual interface ensures an effective data analysis with your personal computer!','http://www.flowingsoftware.com/',NULL,11,NULL,NULL,LAT,LON); -- EuBI (Suomi)
INSERT INTO infra.palvelu VALUES(125,NULL,'Asimov',NULL,NULL,'http://reservation.btk.fi/',NULL,11,NULL,NULL,NULL,NULL); -- EuBI (Suomi)

INSERT INTO infra.palvelu VALUES(126,NULL,'ECBD',NULL,'The European Chemical Biology Database (ECBD) is a prototype database, currently being developed for EU-OPENSCREEN. The purpose of ECBD is to store and integrate screening data from EU-OPENSCREEN partners and contributors.','https://www.eu-openscreen-data.eu/info/general',NULL,11,NULL,NULL,NULL,NULL); -- EU-OPENSCREEN (Suomi). HUOM description loppuu kesken
INSERT INTO infra.palvelu VALUES(127,NULL,'FIMM - Technology Center',NULL,'The FIMM Technology Centre operates in close collaboration with several Biocenter Finland infrastructure networks and is a key national core unit involved in European ESFRI Infrastructures.','https://www.fimm.fi/en/services/technology-centre',NULL,11,NULL,NULL,NULL,NULL); -- EU-OPENSCREEN (Suomi)
INSERT INTO infra.palvelu VALUES(128,NULL,'FIMM - Biopanking Infrastructure',NULL,NULL,'https://www.fimm.fi/en/services/biobanking-infrastructure',NULL,11,NULL,NULL,NULL,NULL); -- EU-OPENSCREEN (Suomi)

-- INSERT INTO infra.palvelu VALUES(129,NULL,'Test Catalog',NULL,'The FinGMice Test Catalog contains in vivo and ex vivo tests and analyses of mice available in Finland. Services are provided to all scientists using GM mice in their research projects.','http://www.fingmice.org/test-catalog.html',NULL,11,NULL,NULL,LAT,LON); -- INFRAFRONTIER (Suomi)
-- INSERT INTO infra.palvelu VALUES(130,NULL,'Biocenter Oulu Transgenic Core Facility',NULL,'Biocenter Oulu Transgenic Core Facility provides services in generation and archiving of gene modified mice.','http://www.oulu.fi/biocenter/tg-core',NULL,11,NULL,NULL,LAT,LON); -- INFRAFRONTIER (Suomi)
-- INSERT INTO infra.palvelu VALUES(131,'Muuntogeeniyksikkö','GM Mouse Unit','Helsingin yliopiston Koe-eläinkeskuksen muuntogeeniyksikkö tuottaa siirto- ja poistogeenisiin hiiriin liittyviä palveluja Helsingin yliopiston tutkijoille ja yliopiston ulkopuolisille asiakkaille.','GM mouse unit of the Laboratory Animal Center, University of Helsinki, provides services on gene modified mice for both researchers of the University of Helsinki and external customers.','http://www.helsinki.fi/gmmice/english/','http://www.helsinki.fi/gmmice/index.htm',13,NULL,'Helsinki',LAT,LON); -- INFRAFRONTIER (Suomi)
-- INSERT INTO infra.palvelu VALUES(132,NULL,'Turku Centre for Disease Modeling',NULL,'TCDM holds know-how on mouse model generation, in vivo imaging in live mice and biomarker analyses, and expertise on phenotyping of the mouse models with a special reference on bone, cardiovascular, intestinal and thyroid diseases, obesity, oncology, reproduction, and on both pharmacological and dietary interventions on mouse models to challenge the phenotype. The phenotyping facilities are well supported by a well-structured tissue and cell imaging unit, with broad expertise on histology, immunohistochemistry and electron microscopy.','http://www.tcdm.fi/facilities-and-services/',NULL,13,'Kiinamyllynkatu 10','Turku',LAT,LON); -- INFRAFRONTIER (Suomi)
INSERT INTO infra.palvelu VALUES(133,'Hiirten fenotyyppianalyysit','Phenotyping Services','INFRAFRONTIER-hiiriklinikoissa hiirten toiminnallisia ja molekulaarisia ominaisuuksia analysoidaan systemaattisia, laajamittaisia ja standardoituja menetelmiä käyttäen, jolloin saadaan kattava kuvaus hiirimutantin ominaisuuksista. Laajojen analyysien tulokset kootaan kaikkien saatavilla olevaan tietopankkiin, jonka kautta mm. sairauksiin vaikuttavia geenejä voidaan tunnistaa. Kiinnostava hiirikanta voidaan sitten tilata hiiripankista syvällisempään analyysiin tai käyttää soluja in vitro -kokeisiin. INFRAFRONTIER-kannat säilytetään EMMA-repositorioissa. Euroopan hiiriklinikat ovat mukana maailmanlaajuisessa IMPC-hankkeessa (International Mouse Phenotyping Consortium), jonka portaaliin (www.mousephenotype.org) analyysitiedot kerätään.','Systemic phenotyping is a high-throughput comprehensive, standardized functional and molecular characterization of mouse models, which allows to unravel all facets of complex mouse mutant phenotypes. The INFRAFRONTIER Research Infrastructure closely collaborates with and contributes to the International Mouse Phenotyping Consortium (IMPC). The IMPC is a federation of phenotyping projects to carry out systemic phenotyping of mouse lines for each of the approximately 20000 protein-coding genes in the mammalian genome in order to create an encyclopaedia of mammalian gene function. Mouse models generated and characterized by IMPC are stored in mouse repositories, and EMMA nodes serve as repositories of the European partners.','https://www.infrafrontier.eu/resources-and-services/free-charge-transnational-access-services',NULL,12,NULL,NULL,NULL,NULL); -- INFRAFRONTIER (Suomi)
INSERT INTO infra.palvelu VALUES(134,'Euroopan hiiripankki EMMA','European Mouse Mutant Archive EMMA','Tutkijat ilmoittavat säilöttävän hiirikannan tiedot www.infrafrontier.eu -sivun kautta. Tiedot tarkistetaan ja talletetaan avoimeen tietokantaan. Tutkijoiden luovuttamista hiiristä kerätään EMMA-yksiköissä alkioita ja/tai sukusoluja, jotka säilytetään nestetypessä. Tutkija tilaa syväjäädytettyä materiaalia tai siitä tuotettuja hiiriä em. sivuston kautta.\n
Kaikkiin työvaiheisiin sisältyy laatukontrolleja säilytettävän ja tuotettavan materiaalin korkean laadun takaamiseksi. Kaikissa yksiköissä noudatetaan samoja standardeja ja koulutettu henkilökunta vastaa palveluista, mikä takaa eläinten hyvinvoinnin Toimintaan kuuluu myös menetelmien kehitystyö ja aiheeseen liittyvät kurssit.','EMMA archives mutant strains and distributes them to requesting researchers. EMMA also hosts courses in cryopreservation to promote the use and dissemination of frozen embryos and spermatozoa. Dissemination of knowledge is further fostered by a dedicated resource database. EMMA welcomes submission of mutant mouse strains from all over the world, archives free of charge and facilitates global distribution.','https://www.infrafrontier.eu/resources-and-services/access-emma-mouse-resources',NULL,11,NULL,NULL,NULL,NULL); -- INFRAFRONTIER (Suomi), paikkatyyppejä useita
-- INSERT INTO infra.palvelu VALUES(135,NULL,'INFRAFRONTIER-I3 TA-mouse phenotyping Service',NULL,'The EC FP7 funded INFRAFRONTIER-I3 project (2013 – 2016) supports European customers with a free of charge mouse phenotyping service. A total of 22 mouse mutant lines can be characterised through a broad based primary phenotyping pipeline in all the major adult organ systems and most areas of major human disease.','https://www.infrafrontier.eu/resources-and-services/free-charge-transnational-access-services/infrafrontier-i3-ta-mouse-0',NULL,12,NULL,NULL,LAT,LON); -- INFRAFRONTIER (Suomi)
INSERT INTO infra.palvelu VALUES(136,'Koulutus ja neuvonta','Training and consulting services','INFRAFRONTIER:n EMMA-yksiköt järjestävät kursseja alkioiden ja sukusolujen syväjäädytykseen ja materiaalin käsittelyyn, ja hiiriklinikat erilaisiin analyysimenetelmiin ja tulosten analysointiin. Myös yksilöllistä ohjausta annetaan, ja toimintaan kuuluvat myös luennot ja tiedotus eri tasoilla. Kaikkiin koulutuksiin sisältyy ohjausta eläinten asianmukaiseen käsittelyyn ja eläinten hyvinvoinnin huomioimiseen kaikissa työvaiheissa.','The INFRAFRONTIER Research Infrastructure and its partners offer a wide range of training opportunities and consulting services. The cryo courses cover state-of-the-art techniques in cryobiology and also more general topics such as handling of experimental animals. In addition, INFRAFRONTIER organizes courses on state-of-the-art phenotyping technologies. The courses are open to the whole scientific community with a specific interest in mouse models and target both scientists and technicians. Animal welfare aspects are an important component of the course programs.','https://www.infrafrontier.eu/resources-and-services/training-and-consulting-services',NULL,11,NULL,NULL,NULL,NULL); -- INFRAFRONTIER (Suomi)

INSERT INTO infra.palvelu VALUES(137,'Palveluhakemisto','Platform catalogue','Instruct-keskukset tarjoavat pääsyn huipputason laitteisiin ja teknologioihin, jotka jaetaan neljään pääkategoriaan: näytteiden valmistus, biofysikaalinen karakterisointi, rakennemääritys ja datan analysointi. Näitä toimintoja varten Instruct-keskuksissa on yhteensä 185 erilaista palvelualustaa. Instruct-keskukset tarjoavat tutkijoiden käyttöön alan uusimmat erikoislaitteet. Tutkijat, joilla on rajalliset tiedot rakennebiologian menetelmistä, saavat koulutusta ja tukea kokeiden suunnitteluun, tulosten keräämiseen ja niiden analysointiin. Pääsyä voi hakea verkossa jatkuvasti auki olevassa haussa (www.structuralbiology.eu/update/submit-proposal).','Instruct Centres provide access to cutting edge instruments and technologies for sample preparation, biophysical characterization, and structure determination as well as data analysis. For these activities 185 platforms are currently available at Instruct Centres. Instruct Centres offer the latest high specification instrumentation and make these accessible to researchers with limited background in structural methods by providing training and support for experimental design, data collection and data analysis. Online applications for access can be submitted at any time (www.structuralbiology.eu/update/submit-proposal).','http://www.structuralbiology.eu/update/platform-catalogue',NULL,12,NULL,NULL,NULL,NULL); -- Instruct (Suomi)
INSERT INTO infra.palvelu VALUES(138,'Näytteiden valmistus','Sample production','Korkeatasoisten näytteiden valmistus on tärkeä edellytys rakenne- ja molekyylibiologisiin tutkimuksiin kuten myös bioteknisiin ja lääketieteellisiin sovelluksiin. Näytteiden valmistus on erityisen haastavaa tutkittaessa suuria makromolekyylikomplekseja, kuten viruksia. Instruct tarjoaa huipputasoisen infrastruktuurin biomolekyylien ja niiden kompleksien tuottoa sekä puhdistamista varten eukaryootti- ja prokaryoottisysteemeissä.','Preparation of high quality samples is an essential prelude for structural and molecular biology studies, as well as for biotechnology and drug discovery application, which can be particularly challenging in the case of large macromolecular complexes, such as viruses. Instruct offers state-of-the-art infrastructures for the production and purification of biomolecules and their complexes in prokaryotic and eukaryotic systems.','http://www.structuralbiology.eu/update/platform-category/sample-production',NULL,12,NULL,NULL,NULL,NULL); -- Instruct (Suomi)
INSERT INTO infra.palvelu VALUES(139,'Koulutus','Training','Instructin tarjoamat opetuskurssit ja työpajat on tarkoitettu eritasoisille rakennebiologiasta kiinnostuneille opiskelijoille (pääasiassa jatko-opiskelijat), tutkijatohtoreille, tekniselle henkilökunnalle, kokeneille rakennebiologeille, jotka pyrkivät käyttämään uusia menetelmiä tutkimuksissaan, sekä teollisuudessa työskenteleville tutkijoille. Opetus suunnitellaan kattamaan edellä mainittujen ryhmien tarpeet. Lisäksi kursseilla pyritään mahdollisuuksien mukaan tarjoamaan käytännön kokemusta sekä mahdollisuus työskennellä omien näytteiden parissa, mikä edesauttaa uusien tutkimushankkeiden käynnistymistä ja tukee jo olemassa olevia hankkeita. Kurssien tavoitteena on mm. standardoida sekä edistää eri menetelmiä yhdistäviä lähestymistapoja rakennebiologian alalla. Instruct-keskusten henkilökunta antaa käytännön opastusta ja koulutusta vieraileville tutkijoille. Instructilla on myös työharjoitteluohjelma (internship), joka mahdollistaa jopa 6 kuukauden mittaisen harjoittelujakson Instruct-keskuksissa.','Instruct’s training courses and workshops target researchers from the structural biology community at several levels: students (mainly doctoral), postdoctoral researchers, facility technicians, experienced structural biologists exploring new approaches for their research, and industrial researchers. Programmes are structured around the needs of these communities and provide the opportunity for hands-on experience and where possible, the ability to work with their own materials to kick-start or expand an existing research project. Courses aim to introduce a degree of standardisation in methodologies, and promote an integrative approach in the structural biology field. The visiting scientists get hands on support and training on site provided by the Instruct Centre personnel. There is also an internship program providing up to 6 months visits to selected Instruct Centres.','http://www.structuralbiology.eu/support/your-career/your-career-training-courses',NULL,12,NULL,NULL,NULL,NULL); -- Instruct (Suomi)
INSERT INTO infra.palvelu VALUES(140,'Virusten ja Makromolekyylikompleksien Tuotantokeskus','Instruct Centre for Virus and Macromolecular Complex Production','ICVIR-keskus tuottaa suuria määriä puhtaita viruksia ja makromoleyylikomplekseja niiden rakenteen ja toiminnan tutkimista varten. Tavallisesti tuotto ja puhdistus tehdään ultrasentrifugointimenetelmin. ICVIR-keskuksella on seitsemän ultrasentrifugia ja neljä korkeanopeuksisista sentrifugia sekä gradienttien valmistus- ja fraktiointilaitteistot. ICVIR-keskuksessa kehitetään myös uusia viruspuhdistusmenetelmiä käyttäen kenttävirtausfraktiointia ja monoliittikromatografiaa yhteistyössä valmistajien kanssa (Postnova ja BiaSeparations). Keskuksen tarjoamia menetelmiä voidaan käyttää erilaisina yhdistelminä suurien makromolekyylikompleksien, kuten virusten, puhdistamisessa. ICVIR-keskuksen vierailijat saavat tukea ja koulutusta keskuksen henkilökunnalta.','ICVIR Centre produces high amounts of pure viruses and large macromolecular complexes for functional and structural studies using traditional ultracentrifugation methods. The platform is equipped with seven ultra and four superspeed centrifuges as well as gradient making and fractionation instrumentation. We also develop new methods for virus purification using Asymmetric Flow Field Flow Fractionation (AF4) and Monolithic chromatography in co-operation with the manufacturers (Postnova and Biaseparations, respectively). These methods can be used in different combinations to purify large macromolecular complexes, such as viruses. Users are supported and trained by the ICVIR personnel.','https://www.structuralbiology.eu/update/centre/centre-for-virus-production',NULL,13,'Viikinkaari 9B, 00014','Helsinki',60.226948,25.013985); -- Instruct (Suomi)

INSERT INTO infra.palvelu VALUES(141,'Kansallinen kasvien fenotyyppaus -infrastruktuuri','National Plant Phenotyping Infrastructure',NULL,'The facility consists of motorised plant transportation and maintenance, such as weighing and watering, in combination with imaging tools for RGB, thermoluminescense and chlorophyll fluorescence. These tools allow comprehensive analysis of plant growth and physiology.','http://blogs.helsinki.fi/nappi-blog/about/','http://blogs.helsinki.fi/nappi-blog/info-suomeksi/',13,NULL,'Helsinki',60.173324,24.941025); -- NaPPI

INSERT INTO infra.palvelu VALUES(142,NULL,'NVVL',NULL,'National Virus Vector Laboratory provides excellent facility for production of adenoviral, lentiviral, AAV and baculoviral vectors for in vitro and in vivo work. Laboratory scale and larger scale production methods are available with quality controlled vector backbones and cell banks. Unit operates one GMP suite and four vector laboratories which are dedicated for each of the vector type. Unit will also give technological support for the use of viral vectors including support for the application of permits required by gene technology law.','http://www2.uef.fi/fi/bck/national-virus-vector-laboratory',NULL,13,NULL,'Kuopio',62.893335,27.679338); -- NVVL

INSERT INTO infra.palvelu VALUES(143,NULL,'Beamlines',NULL,'At current, 14 beamlines are funded for the MAX IV facility: Eight at the 3GeV ring, five at the 1.5GeV ring and one at the short pulse facility (SPF) at the MAX IV linac. The number of beamlines accepting external users will be ramped up during the period 2016 to 2018 from an expected six late 2016 to 14 late 2018. Information on the methods and status of construction/commissioning of the individual beamlines are found on the MAX IV Laboratory webpage. The beamlines will provide experimental capabilities to support a multitude of scientific disciplines including physics, chemistry, materials science, environmental sciences, bioscience and medicine.\n
Access to experimental time at the beamlines at MAX IV will be awarded via a peer review process where proposals are evaluated by expert committees consisting of international experts. Proposals will be judged on their scientific excellence and feasibility. There is no charge for beamtime for an approved proposal but a demand that the results are published. Proprietary research with no demand for publication of results will be possible against a fee. In some cases also privileged access will be available to consortia that have made major contributions to the development and funding of MAX IV.','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- comment
INSERT INTO infra.palvelu VALUES(144,NULL,'Beamline #1 - FemtoMAX (2016)',NULL,'Energy Range: 1.8 - 20 keV - Method/Applications: Femtosecond visible/X-ray pump/probe diffraction (XRD) and spectroscopy (EXAFS) on solids (later liquids/gases) for material science, and basic solid state, atomic and molecular physics','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- comment
INSERT INTO infra.palvelu VALUES(145,NULL,'Beamline #2 - NanoMax (2016)',NULL,'Energy Range: 5 - 30 keV - Method/Applications: Nanometer resolution imaging / coherent diffraction for the study of nano-materials and natural nano-structures','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- comment
INSERT INTO infra.palvelu VALUES(146,NULL,'Beamline #3 - BALDER (2016)',NULL,'Energy Range: 4 - 40 keV - Hard X-ray absorption and emission spectroscopy with focus on in-situ studies in material and environmental sciences.','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- comment
INSERT INTO infra.palvelu VALUES(147,NULL,'Beamline #4 - BioMAX (2016)',NULL,'Energy Range: 5 - 25 keV - Highly automated macromolecular crystallography for biochemical and pharmaceutical research and development','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- comment
INSERT INTO infra.palvelu VALUES(148,NULL,'Beamline #5 - VERITAS (2016)',NULL,'Energy Range: 275 eV - 1500 eV, R 50000 at 400 eV - Soft X-ray absorption spectroscopy and resonant scattering for research in atomic and molecular physics, correlated materials, and condensed state physics','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- comment
INSERT INTO infra.palvelu VALUES(149,NULL,'Beamline #6 - HIPPIE (2016)',NULL,'Energy Range: 263 eV - 2000 eV, R 40000 at 400 eV - Near ambient pressure photoelectron spectroscopy (ESCA / resonant) for catalysis, corrosion, surface and interface chemistry, and energy research','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- comment
-- lisää MAX IV palveluita id:llä 190 - 201

INSERT INTO infra.palvelu VALUES(150,'Micronova (Puhdastila nano- ja mikrovalmistukseen)','Micronova (Nanofabrication Cleanroom)','OtaNano – Micronova on mikro- ja nanoteknologian valmistukseen tarkoitettu avoimen käyttöoikeuden (open access) puhdastila. Valmistus- ja mittauslaitteistoja voidaan antaa käyttöön yliopistoille, tutkimuslaitoksille ja yrityksille sopimuksen mukaan. Micronovan puhdastila ja mittauslaboratoriot tarjoavat mahdollisuudet useisiin eri valmistus- ja mittausprosesseihin. Pääosassa valmistusprosesseja ovat pii- tai kvartsikiekot tai -sirut. Pudastilan pinta-ala on 2600 m2 ja se on jaettu osiin. Luokittelu lähtee litografia-alueen ISO4:stä – suurin osa puhdastila-alueesta on ISO5 luokkaa ja analyysilaboratorio ja pukeutumisalue ovat ISO6 luokkaa.\n
Varsinaisen puhdastilan lisäksi tarjolla on myös erillisiä tiloja esim. mikro-pakkaukselle ja muille ”back-end” prosesseille sekä laboratoriot MOVPE, MBE ja muille ohutkalvo prosesseille.\n
Palvelut, joita OtaNano – Micronova tarjoaa ulkopuolisille voidaan jakaa seuraavasti: 1) Valmistus- ja mittalaitteiden käyttö. Lähtökohtaisesti asiakkaan oma henkilöstö käyttää laitteita, mutta tietyissä tapauksissa myös paikallinen henkilöstö voi tukea tässä. 2) Pienen mittakaavan massavalmistus, prototypointi ja mittauspalvelut 3) Puhdastilan vuokraus asiakkaan omien laitteiden sijoituspaikaksi.','OtaNano - Micronova Nanofabrication Cleanroom is an open access facility. Process and measurement equipment can be used according to separate agreements by other universities, research institutes and companies. The Micronova Nanofabrication Cleanroom and Laboratories provide the necessary facilities for a large number of processes. Mainly processes are run on silicon or quartz wafers. The cleanroom covers an area of 2 600 m2 with clean areas dedicated to various processing and analysis activities. The classification ranges from ISO4 in lithography and CMOS-sections, ISO5 in most processing areas to ISO6 in areas dedicated to measurements and gowning.\n
In addition to this main cleanroom there are laboratories with built-in cleanrooms for micro packaging and back-end processes as well as well-equipped and controlled labs for MOVPE, MBE and other thin film processes.\n
The services provided by Micronova Nanofabrication Centre to external users include: 1) Use of processing and measurement equipment. The equipment is used primarily by the customer’s personnel or by Nanofab staff in certain cases. 2) Small-scale processing, prototyping and measurement services 3) Renting of cleanroom space to customer with own, dedicated equipment.','http://www.otanano.fi/en/facilities/micro_and_nanofabrication/','http://www.otanano.fi/en/facilities/micro_and_nanofabrication/',13,'Tietotie 3','Espoo',60.184779,24.817167); -- OMN/Otanano
INSERT INTO infra.palvelu VALUES(151,'OtaNano - puhdastilakoulutus','OtaNano - Cleanroom Training','Puhdastilan käyttöluvan saamiseksi, käyttäjä tarvitsee peruskoulutuksen puhdastilan käyttöön, turvallisuuskoulutuksen ja opastuksen kemikaalien turvallisesta käytöstä (ns. kemikaalikoulutus). Puhdastila- ja kemikaalikoulutus ovat erilliset koulutukset, jotka kumpikin sisältävät itsenäisen esitehtävän, jota seuraa puolen päivän luento- ja harjoituskurssi.','In order to get access to the cleanroom a new user needs basic cleanroom training, safety training and information about the use of chemicals (so called chemical training). The cleanroom and chemical training are separate courses which include independent pre-work followed by half-a-day interactive lectures and hands-on teaching and learning.','http://www.otanano.fi/en/training','http://www.otanano.fi/en/training',13,'Tietotie 3','Espoo',60.184779,24.817167); -- OMN/OtaNano
INSERT INTO infra.palvelu VALUES(152,'OtaNano - Kylmälaboratorio','OtaNano - Low Temperature Laboratory','OtaNano – Kylmälaboratorio pitää sisällään kattavan tutkimusinfrastruktuurin matalien lämpötilojen ja nanoelektroniikan tutkimukseen. Laitekanta sisältää yhdeksän kryostaattia alle 1 K:n lämpötiloissa tapahtuvaan tutkimukseen, kaksi ydin demagnetisaatio jäähdytintä alle mK:n lämpötiloihin sekä muita tutkimuslaitteita mm. microRaman ja atomivoimamikroskooppi (AFM) näytteiden tutkimukseen. Näytteenvalmistukseen on tarjolla elektronisuihkulitografia, jolla päästään 50 nm resoluutioon puoli-puhtaissa tiloissa.\n
Laitekanta muodostaa arvokkaan kokonaisuuden sekä tutkijoille että yrityksille, jotka työskentelevät kryogeenisten sovellutusten parissa.\n
OtaNano – Kylmälaboratorio on yksi harvoista maailman kylmä-fysiikan keskuksista. Johtava asema maailmassa perustuu jatkuvaan ultra-matalan lämpötilan laitteiden valmistukseen ja kehittämiseen.','OtaNano – Low Temperature Laboratory houses a large variety of research facilities for low-temperature and nanoelectronics research. The installations include nine dilution refrigerators for sub 1 K research, two nuclear demagnetization cryostats for sub mK research, and facilities, such as a microRaman setup and an atomic force microscope, for characterizing samples after fabrication. For sample preparation, e-beam lithography can be carried out down to 50 nm resolution in a semi-clean-room environment.\n
The facilities are a valuable asset for physicists, as well as for small high-tech companies working with cryogenic applications.\n
OtaNano - Low Temperature Laboratory is one of the world centers in ultra-low temperature physics and technology. The leading position is based on vigorous in-house development and construction of sub-mK refrigerators.','http://www.otanano.fi/en/facilities/low_temperature_measurements/','http://www.otanano.fi/en/facilities/low_temperature_measurements/',13,'Puumiehenkuja 2 B','Espoo',60.186899,24.824852); -- OMN/Otanon
INSERT INTO infra.palvelu VALUES(153,'OtaNano – Kylmälaboratorio koulutus','OtaNano - Low temperature laboratory Training','Turvallisuus- ja peruskoulutukset ovat edellytys laitteiden käytölle. Kursseja järjestetään tarpeen mukaan.','The safety and basic training courses are mandatory before getting the access to use the facilities. The courses arranged by demand.','http://www.otanano.fi/en/training','http://www.otanano.fi/en/training',13,'Puumiehenkuja 2 B','Espoo',60.186899,24.824852); -- OMN/otanano
INSERT INTO infra.palvelu VALUES(154,'OtaNano - Nanomikroskopiakeskus','OtaNano - Nanomicroscopy Center','OtaNano – Nanomikroskopiakeskus tarjoaa korkean resolution mikroskopiaa. Laitekanta koostuu Suomen ainoasta alle Ångströmin resoluution omaavasta läpivalaisumikroskoopista (TEM), neste-helium jäähdytteisestä cryo-TEM:stä, kryogeenisistä tunnelointielektronimikroskoopeista (STM), elektronimikroskoopeista (SEM), atomivoimamikroskoopeista (AFM) ja röntgen-säde sirontalaitteistoista (SAXS/WAXS).','OtaNano - Nanomicroscopy Center provides a high resolution microscopy to all users. The instruments include the only sub-Ångström transmission electron microscope (TEM) in Finland, a liquid helium cooled cryo-TEM, cryo scanning tunneling microscopes (STM), scanning electron microscopes (SEM), atomic force microcopes (AFM), and X-ray scattering equipment (SAXS/WAXS).','http://www.otanano.fi/en/facilities/nanomicroscopy/','http://www.otanano.fi/en/facilities/nanomicroscopy/',13,'Puumiehenkuja 2','Espoo',60.186899,24.824852); -- OMN/otanano
INSERT INTO infra.palvelu VALUES(155,'OtaNano – Nanomikroskopia koulutus','OtaNano - Nanomicroscopy center Training','TEMiä, SEMiä tai AFMää käyttävät tutkijat koulutetaan yleensä käyttämään laitteita itsenäisesti. Yrityksille on mahdollista tarjota kuvantamista maksullisena palveluna – myös tutkimusyhteistyö on mahdollista.\n
Joka kevät järjestetään kurssi ”Nanomateriaalien mikroskopia” (Microscopy of Nanomaterials), joka on tarkoitettu Aallon tohtoriopiskelijoille. Sekä luennoille (5 op) että laboratoriokurssille (5 op) osallistuminen on helppo tapa saada käyttöoikeudet mikroskooppeihin.','Researchers using TEM, SEM, or AFM are typically trained to operate the microscopes on their own and there are no dedicated operators. There are also options for paid service for companies and research collaboration for interesting joint projects.\n
Every spring we arrange a course called Microscopy of Nanomaterials, which is aimed for doctoral students at Aalto. Participating on both lecture course (5 cr) and lab course (5 cr) provides a facile way to get permissions to use basic TEM, SEM, and AFM.','http://www.otanano.fi/en/training','http://www.otanano.fi/en/training',13,'Puumiehenkuja 2','Espoo',60.186899,24.824852); -- OMN/otanano

INSERT INTO infra.palvelu VALUES(160,'XBI','XBI','XBI tarjoaa eurooppalaisen XFELin biologisille käyttäjille laboratorion ja laitteiston näytteiden valmistukseen ja karakterisointiin ennen XFEL-mittauksia. XBI mahdollistaa monenlaisten biologisten näytteiden - aina yksittäisistä biomolekyyleistä kokonaisiin soluihin - valmistuksen niin sarjakristallografiamittauksiin kuin yksittäispartikkelien kuvantamiseen. Pääsy myönnetään vertaisarvioidun haun perusteella ja ainoastaan yhteydessä myönnettyyn XFEL-mittausaikaan.','XBI will provide the biological users of the European XFEL facilities for sample preparation and characterization before delivery INTO infra.the beam. A broad range of sample types from single biomolecules to entire cells for both serial crystallography as well as single particle imaging will be supported. Access will be provided based on peer review and only in connection with beam time at the European XFEL.','http://www.xfel.eu/research/possibilities/','http://www.xfel.eu/research/possibilities/',13,'Albert-Einsterin-Ring 19, 22761','Hamburg',53.57661,9.88811); -- XFEL ja XBI (Suomi)

INSERT INTO infra.palvelu VALUES(161,NULL,'BIOECONOMY',NULL,'Bioeconomy infrastucture contains research facilities of Aalto University and VTT in the fields of process chemistry, industrial biotechnology and material sciences aiming to bio-based chemicals, fuels, materials and fibre products.','http://www.bioeconomyinfra.fi/',NULL,12,NULL,NULL,NULL,NULL); -- BIOECONOMY
INSERT INTO infra.palvelu VALUES(162,NULL,'VTT Facilities',NULL,'VTT Bioeconomy infrastructure contains the selected research infrastructures from VTT’s business area Solutions for natural resources and environment. The infrastructures located at Espoo, Jyväskylä, Rajamäki and Tampere serve development of chemicals, fuels, fibre products and materials from renewable biomass utilizing biotechnical, chemical and thermal processing technologies.','http://www.vttresearch.com/services/business-essentials/pilot-plants-and-r-d-infra',NULL,13,NULL,NULL,NULL,NULL); -- BIOECONOMY
INSERT INTO infra.palvelu VALUES(163,NULL,'AALTO Facilities',NULL,'Aalto Bioeconomy contains the selected research infrastructures at the departments of Forest Products Technology and Biotechnology and Chemical Technology for development of chemicals, fuels, fibre products and materials from renewable biomass utilizing biotechnical, chemical and thermal processing technologies.','http://bioeconomy.aalto.fi/en/equipment/',NULL,13,NULL,NULL,NULL,NULL); -- BIOECONOMY

INSERT INTO infra.palvelu VALUES(164,'Cherenkov-teleskooppijärjestelmä','Cherenkov Telescope Array',NULL,'The CTA project is an initiative to build the next generation ground-based very high energy gamma-ray instrument. It will serve as an open observatory to a wide astrophysics community and will provide a deep insight INTO infra.the non-thermal high-energy universe.','https://portal.cta-observatory.org/Pages/Home.aspx','http://www.astro.utu.fi/research/CTA/',13,NULL,NULL,NULL,NULL); -- CTA (Suomi)

INSERT INTO infra.palvelu VALUES(166,'Kiihdytinlaitteistojen tarjoamat ionisuihkut','Ion beams delivered by the accelerator facilities','JYFL-ACCLABin käytössä on kolme kiihdytintä: kahdella ns. ECR-ionilähteellä varustettu K=130MeV raskasionisyklotroni, K=30MeV suuren intensiteetin kevytionisyklotroni, sekä 1.7 MV Pelletron-lineaarikiihdytin. Niillä voidaan tuottaa ionisuihkuja protonista kultaioneihin laajalla energia-alueella modernin ydin- ja materiaalifysiikan tutkimukseen ja sovelluksiin.','The accelerator resources at JYFL-ACCLAB consist of a K130 cyclotron equipped with two ECR ion sources and a multi-cusp ion source, a new K30 light-ion cyclotron and a 1.7 MV Pelletron accelerator, delivering a wide range of stable-ion beams (from p to Au) suitable for modern nuclear and materials physics research and applications.','https://www.jyu.fi/fysiikka/en/research/accelerator/accelerator','https://www.jyu.fi/fysiikka/tutkimus/kiihdytin/ionilahteet/ionisuihkutietokanta',13,'Survontie 9','Jyväskylä',62.228295,25.738243); -- JYFL-ACCLAB
INSERT INTO infra.palvelu VALUES(167,'RADEF säteilytyslaitteisto','RADEF irradiation facility','RADEF laitteistolla tutkitaan energeettisten keveiden ja raskaiden ionien aiheuttamia säteilyefektejä puolijohdekomponenteissa. Laitteisto on Euroopan Avaruusjärjestön akkreditoima.','RADiation Effects Facility (RADEF) is for studies of single-event effects (SEE) in electronics. It is also available for various radiation hardness tests of materials, sensors and detectors with light ions and heavy-ion beam cocktails delivered by the K=130 cyclotron. The facility is accredited by the European Space Agency (ESA).','https://www.jyu.fi/fysiikka/en/research/accelerator/radef','https://www.jyu.fi/fysiikka/tutkimus/kiihdytin/index_html/teollsov',13,'Survontie 9','Jyväskylä',62.228295,25.738243); -- JYFL-ACCLAB
INSERT INTO infra.palvelu VALUES(168,'Pelletron kiihyttimen ioinisuihkusovellukset','Ion-beam applications at the Pelletron accelerator','1,7 MV:n Pelletron-kiihdyttimestä saatavia ionisuihkuja käytetään materiaalipintojen tutkimiseen ja muokkaukseen. Systeemiin kuuluu ionien takaisinsirontamittauslaitteisto (Rutherford Back Scattering, RBS), ioniherätteistä röntgenemissiota hyödyntävä mittauslaitteisto (Particle Induced X-ray Emission, PIXE) ja lentoaika-energia-spektrometri (Time-of-Flight Elastic Recoil Detection Analysis, TOF-ERDA) varustettuina moderneilla hiukkas- ja säteilynilmaisimilla.','The Pelletron accelerator delivers low-energy light- an heavy-ion beams to beam lines for the modification and characterisation of materials.  The beam lines are equipped with modern instruments for Rutherford Back Scattering (RBS), Particle Induced X-ray Emission (PIXE) and Time-of-Flight Elastic Recoil Detection Analysis (TOF-ERDA).','https://www.jyu.fi/fysiikka/en/research/accelerator/index_html/research/accelerator/abasedmat/','https://www.jyu.fi/fysiikka/tutkimus/kiihdytin/index_html/matfys',13,'Survontie 9','Jyväskylä',62.228295,25.738243); -- JYFL-ACCLAB
INSERT INTO infra.palvelu VALUES(169,'IGISOL ioniohjainlaitteisto','IGISOL ion-guide facility','IGISOLista saadaan matalaenergisiä lyhytikäisiä radioaktiivisten ionien suihkuja. Ioneja voidaan tutkia ioniloukkujen ja lasereiden avulla. Ioneja voidaan käyttää myös moniin sovelluksiin.','IGISOL delivers various species of cooled and bunched radioactive ion beams to beam lines equipped with ion traps for accurate nuclear-mass measurements, detector systems for exotic decay modes and laser-spectroscopy systems for hyperfine-structure studies. Radioactive beams from IGISOL are also used for applications, such as studies of atomistic transport processes in nanoscale solids.','https://www.jyu.fi/fysiikka/en/research/accelerator/index_html/research/accelerator/igisol','https://www.jyu.fi/fysiikka/tutkimus/kiihdytin/index_html/igisol',13,'Survontie 9','Jyväskylä',62.228295,25.738243); -- JYFL-ACCLAB
INSERT INTO infra.palvelu VALUES(170,'Rekyylinerottimet','Recoil separators','RITU- ja MARA rekyylinerottimet yhdessä niiden kohtio- ja fokusalueiden ilmaisinsysteemien kanssa ovat maailman tehokkaimpia protonirikkaiden ja superraskaiden alkuaineiden in-beam spektroskopian tutkimusvälineitä.','The RITU gas-filled recoil separator and the MARA separator with detector arrays at their target area (JUROGAM or SAGE array) and the focal plane spectrometers are the most efficient systems in the world for in-beam spectroscopic studies of proton-rich and super-heavy nuclei.','https://www.jyu.fi/fysiikka/en/research/accelerator/nucspec','https://www.jyu.fi/fysiikka/tutkimus/kiihdytin/index_html/ydinspektroskopia',13,'Survontie 9','Jyväskylä',62.228295,25.738243); -- JYFL-ACCLAB

INSERT INTO infra.palvelu VALUES(173,'PRACEn suurteholaskentaresurssit','PRACE Resources','PRACEn eurooppalaisen suurteholaskentainfrastruktuurin kautta tutkijoilla on pääsy maailmanluokan laskentaresursseihin. PRACE tarjoaa myös asiantuntija-apua tutkijoille PRACEen kuuluvien kansallisten keskusten kautta.','The PRACE RI provides access to distributed persistent pan-European world class HPC computing and data management resources and services. Expertise in efficient use of the resources is available through participating centers throughout Europe.','http://www.prace-ri.eu/prace-resources/',NULL,12,NULL,NULL,NULL,NULL); -- PRACE (Suomi)
INSERT INTO infra.palvelu VALUES(174,'Koulutuspalvelut','Education and training','PRACElla on kuusi koulutuskeskusta (PRACE Advanced Training Center), joissa koulutetaan tutkijoita käyttämään PRACEn tarjoamia laskentaresursseja tehokkaasti. CSC on yksi PRACEn koulutuskeskuksista, ja muut viisi ovat: Barcelona Supercomputing Center (Espanja), CINECA – Consorzio Interuniversitario (Italia), EPCC at the University of Edinburgh (UK), Gauss Centre for Supercomputing (Saksa) ja Maison de la Simulation (Ranska).','The aim of PRACE RI Training is to provide a sustained, high-quality training and education service for the European HPC community through seasonal schools, workshops and scientific and industrial seminars, in order to effectively exploit the unprecedented capabilities of HPC resources of RI. PRACE currently has six Advanced Training Centres (PATCs) which provide top-class education and training opportunities for computational scientists in Europe. PATCs are located at: Barcelona Supercomputing Center (Spain), CINECA – Consorzio Interuniversitario (Italy), CSC – IT Center for Science Ltd (Finland), EPCC at the University of Edinburgh (UK), Gauss Centre for Supercomputing (Germany) and Maison de la Simulation (France).','http://www.prace-ri.eu/trainings',NULL,12,NULL,NULL,NULL,NULL); -- PRACE (Suomi)

INSERT INTO infra.palvelu VALUES(175,'Suomen grid- ja pilvilaskennan infrastruktuuri','Finnish Grid and Cloud Infrastructure','FGCI toimii alustana grid- ja pilvilaskentateknologioiden kehittämiselle nykyisen tietojenkäsittelytieteen tutkimuksen tarpeisiin, mutta palvelee myös kaikkia tieteenaloja, jotka tarvitsevat laskentaresursseja Suomessa, edistäen kansallista ja kansainvälistä yhteistyötä.','The FGCI will serve as a platform for development of grid and cloud computing technologies within current computer science research, and at the same time serve all other fields of science needing computational resources in Finland, promoting both national and international collaboration.','https://www.csc.fi/-/fgci','https://www.csc.fi/fi/-/fgci?_82_languageId=fi_FI',11,NULL,NULL,NULL,NULL); -- FGCI

INSERT INTO infra.palvelu VALUES(176,'Aerosolifysiikan laboratorio / Itä-Suomen yliopisto','Aerosol physics laboratory / Univ. of Eastern Finland','Laboratoriossa on kattava valikoima mittausvälineitä ja –menetelmiä aerosolien ominaisuuksien, pilvien kondensaatioytimien ominaisuuksien ja niiden pilvenmuodostuskyvyn analysointiin. Lisäksi voidaan analysoida vesihöyryn vuorovaikutusta. Käytössä on myös ainutlaatuinen kasvi/sumu/reaktio kammio SOA muodostuksen ja ominaisuuksien tutkimiseen.','Aerosol physics laboratory at UEF has an extensive selection of measurement devices and methodologies to analyze the composition of cloud condensation nuclei sized particles and also to relate the composition to the cloud forming ability of the particles. The laboratory has standard aerosol research instruments (e.g. particle sizers, etc.) and specific instruments for aerosol composition and water vapor interaction studies (HR-TOF-AMS, PTRMS for VOC analyses, hygroscopicity, organic and volatility TDMAs, CCNc). The group has also new methods developed for the particle phase studies in its use. Furthermore, a unique plant/smog/reaction chamber (1-9 m3) facility is available for SOA formation and properties studies.','https://www2.uef.fi/fi/aerosol',NULL,13,NULL,'Kuopio',62.893335,27.679338);  -- INAR RI
INSERT INTO infra.palvelu VALUES(177,'Tutkalaboratorio / Helsingin yliopisto','Radar laboratory / University of Helsinki','Laboratoriossa on useita säätutkia, joita käytetään pilvien ja sadannan tutkimiseen. Laboratoriota käytetään myös uusien mittaustekniikoiden ja –laitteiden testaamiseen ja kehittämiseen.','Dual-polarization weather radars. University of Helsinki owns a state-of-the-art dual-polarization weather radars and a Doppler radar. The dual-polarization weather radar is located on the roof of the Department of Physics building at the university Kumpula campus. The Doppler radar is a relocatable system that is currently being upgraded to the state-of-the-art. The radars are used to study cloud and precipitation processes. Due to the location of the dual-polarization radar, it is also used to study impact of precipitation on pluvial floods, and chemical transport in the rainfall runoff. The weather radar research infrastructure is used for development and testing of novel measurement methodologies within the Finnish Strategic Centre for Science, Technology and Innovation (CLEEN) Measurement, Monitoring and Environmental Efficiency Assessment (MMEA) research program.','http://www.physics.helsinki.fi/tutkimus/atm/english/research/radar.html',NULL,13,NULL,'Helsinki',60.173324,24.941025);  -- INAR RI
INSERT INTO infra.palvelu VALUES(178,'Kasviekofysiologian laboratorio / Helsingin yliopisto','Plant ecophysiology laboratory / University of Helsinki','Ekofysiologialaboratoriossa on kasvatuskammioita, kasvualusta- järjestelmiä, isotooppianalyysivalmius, sekä monipuolisesti erilaisia kasviekofysiologian mittauslaitteita, joilla voidaan analysoida kasvien erilaisia stressivasteita, fotosynteesiä, vedenkuljetusta, sokeridynamiikkaa, ravinnetaloutta, rakennetta jne.','The ecophysiological laboratory is equipped with growth chambers and microcosms that enable separate process analyses from the above- and below canopy compartments. Experiments with stable and non-stable isotopes can be performed. The laboratory is equipped with a comprehensive set of portable and bench instruments for plant ecophysiological research (IRGAs, osmometer, thermal camera, GC, HPLC, C/N analyzer).','http://www.helsinki.fi/metsaymparisto/research/en/index.html',NULL,13,NULL,'Helsinki',60.173324,24.941025);  -- INAR RI
INSERT INTO infra.palvelu VALUES(179,'Ilmatieteen laitoksen aerosolilaboratorio ja analyyttinen laboratorio','FMI aerosol and analytical laboratories','Ilmatieteen laitoksen aerosolilaboratoriossa tutkitaan aerosolipartikkelien muodostusta ja kasvua nukleaatioprosessien kautta. Analyyttisessä laboratoriossa käytetään kromatografia-tekniikoita.','In the aerosol laboratory, there is experimental facility to study formation and growth of aerosol particles through nucleation of different atmospherically relevant gas phase species like water- sulphuric acid or watersulphuric acid- ammonia, in different environmental conditions. This facility can be used to understand fundamental processes of nucleation and to complement the field work. In the analytical laboratory is specialized on in-situ measurements using chromatographic techniques. The instrumentation includes two ion-chromatographs for inorganic aerosol and gas measurements (MARGA), with one and two sample boxes. The instrument with two sample boxes is for flux measurements. The instrumentation includes also on-line gas-chromatographs with mass- and FID- detectors and gas-, ion- and liquid-chromatographs in the laboratory. Analysis of HONO, HNO3, NH3/NH4+, VOCs, VON and PAH are particularly important to the proposal.',NULL,NULL,13,NULL,NULL,NULL,NULL);  -- INAR RI
INSERT INTO infra.palvelu VALUES(180,'Kaukokartoitusinfrastruktuuri','Remote sensing infrastructures','Kaukokartoitusaineisto ja –tuotteet pitävät sisällään maailmanlaajuisia satelliitti-ilmastosarjoja, joista Ilmatieteen laitos on tuottanut olennaisia ilmastomuuttujia, ja maasta kerättyä kaukokartoitusaineistoa kuten sää- ja pilvitutka-aineistoa (IL ja Helsingin yliopisto). Erityisesti Sodankylä-Pallas-asema on erityisen arvokas testialusta satelliittiaineistolle, koska siellä on monipuoliset satelliitti-referenssimittaukset maasta käsin maaperä-lumi-kasvillisuus-ilmakehä systeemille.','The remote sensing data and products include global/large scale Climate Data Records on selected Essential Climate Variables produced and further developed by FMI. Additional data include weather/cloud radar and other ground-based remote sensing observations from a suite of instruments operated by FMI and Univ. of Helsinki. The Sodankylä-Pallas super-site designed for Earth Observation satellite CAL-VAL purposes is a globally unique testbed providing integrated observations on soil-snow-vegetation-atmosphere system (e.g. CO2/CH4 fluxes), combined with monitoring data from ground-based reference systems of satellite-borne instruments. In addition, sun-induced fluorescence, photochemical reflectance index, and normalized difference vegetation index (NDVI) are measured over the canopy in SMEAR-II station. This optical data is used as proxy of photosynthetic variables, to construct optical data driven models, and for Cal-Val activities for satellite products.',NULL,NULL,12,NULL,NULL,NULL,NULL);  -- INAR RI
INSERT INTO infra.palvelu VALUES(181,'Aerosolifysiikan laboratorio / TUT','Aerosol Physics Laboratory / Tampere University of Technology','Tampereen Teknisen yliopiston aerosolifysiikan laboratoriossa mitataan pienhiukkaspäästöjä, ilmakehän aerosoleja, ja nanopartikkeleita. Mittauksia suoritetaan sekä laboratoriossa että luonnossa, minkä lisäksi käytetään analyyseissa apuna mallinnusta. Laboratorion varustukseen kuuluu myös iikkuva yksikkö, joka mittaa aerosoleja ja liikenteen päästöjä.','The Aerosol Physics Laboratory at Tampere University of Technology measures fine particle emissions, atmospheric aerosols, and nanoparticle synthesis and nanocoatings. Atmospheric research concentrates on applying developed in-house techniques for ambient observations, including boreal forests, and studying the effect of technological development on utomotive emissions aerosols in the field and laboratory. Atmospheric studies consist of field measurement activities and modelling. The group owns a wide range of nanoparticle characterization, size distribution measurement, and bioaerosol detection systems and is expert in exhausts dilution mimicking realistic atmospheric dilution. The group is extending its measurement infrastructure to include a mobile unit for measurement of atmospheric aerosol and traffic emissions, to increase the linking of the emissions and atmospheric research.',NULL,NULL,13,NULL,'Tampere',61.498151,23.761025);  -- INAR RI
INSERT INTO infra.palvelu VALUES(182,'Analyyttisen kemian laboratorio / Helsingin yliopisto','Laboratory of Analytical Chemistry / Univ.Helsinki','Helsingin yliopiston analyyttisen kemian laboratorio kehittää luotettavia, herkkiä ja koko-erottelevia analyysimenetelmiä ultrapienille aerosoleille. Laboratoriossa on useita kaupallisia sekä itsekehitettyjä mittausvälineitä ilmakehän pienhiukkasille.','The development of size selective collection and sensitive and reliable analysis methods for the elucidation of the chemical composition of ultrafine atmospheric aerosols (<50 nm) and the analysis of specific target compounds. The Laboratory has a wide range of modern commercial and self-modified/self-constructed instruments including some novel techniques (aerosol mass spectrometry, portable gas chromatography -mass spectrometry, multidimensional chromatographic techniques, size-selective sampling, mass spectrometric detections for chromatography).','http://www.helsinki.fi/kemia/analyyttinen/',NULL,13,NULL,'Helsinki',60.173324,24.941025);  -- INAR RI
INSERT INTO infra.palvelu VALUES(183,'Lentomittaukset','Airborne platforms','IL:n ja Aalto-yliopisto:n yhteinen SHORT SC-7 Skyvan, ja Helsingin yliopiston CESSNA 172 ovat ilmakehän tutkimuskäyttöön varustettuja lentokoneita.','FMI together with Aalto University have upgraded Aalto University’s SHORT SC-7 Skyvan aircraft (Short Brothers and Harland Ltd, Northern Ireland, UK) to research purposes. It has max operating distance of 1370 km and height of 3 km, equipped with infra for recording of precise position and speed with the onboard instruments connected to BMI Isokinetic Inlet System. Automated inlet system with transmission efficiency > 90% for < 10 μm. It is equipped with anti-icing system, Pitot tube for airspeed measurements and isokinetic flow control, incl. flow rate, pressure and temperature measurements of sample flow; data obtained in 1 Hz resolution. UHEL operates CESSNA 172 capable of measuring aerosol particles > 1.5 nm up to 3.5 km altitude. Payload incl. e.g. Particle Size Magnifier, SMPS and CPC battery.',NULL,NULL,12,NULL,NULL,NULL,NULL);  -- INAR RI
INSERT INTO infra.palvelu VALUES(184,'Aerosoli- ja ilmakehäfysiikan laboratorio / Helsingin yliopisto','Aerosol and atmospheric physics laboratory / Univ. Helsinki','Helsingin yliopiston aerosoli- ja ilmakehäfysiikan laboratorio keskittyy analysoimaan kaikkein pienimpien aerosolipartikkeleiden ja niiden esiasteiden syntyä ja ominaisuuksia erilaisten massa- ja ionispektometrien, partikkelilaskurien, ja aerosolipartikkelien hydroskopisuutta ja haihtuvuutta mittaavien laitteiden avulla.','The work in this laboratory focuses on a wide range of instrumental techniques for comprehensive physical and chemical characterization of aerosol particles and their precursors. The laboratory is instrumented with a variety of mass spectrometers, particle counters, ion spectrometers, particle generators, and equipment for analyzing the hygroscopicity and volatility of aerosol particles of all sizes (1-1000 nm). A specific aim has been to generate and characterize aerosol particles and clusters in the sub-3 nm range, where very few instruments are able to measure. This expertise has been utilized for improving and calibrating new state-of-the-art mass spectrometers, which in turn has facilitated many groundbreaking research findings in the laboratory during recent years.',NULL,NULL,13,NULL,'Helsinki',60.173324,24.941025);  -- INAR RI
INSERT INTO infra.palvelu VALUES(185,'CRAICC asemaverkosto','CRAICC station network','Pohjoismainen huippuyksikkö CRAICC isännöi arktisella ja boreaalisella alueella 18 mittausasemaa, joilla tehdään sekä jatkuvaa mittausta että intensiivisiä mittauskampanjoita ilmakehän, ekosysteemien ja niiden vuorovaikutusten sekä ihmisten ja yhteiskunnan vaikutusten analysoimiseksi. Mittausasemat toimivat kansainvälisten mittausohjeistusten mukaisesti.','The Nordic Center of Excellence CRAICC (coordinated by UHEL) hosts 18 measurement stations covering ecosystems from high arctic to boreal locations, where continuous measurements and intensive campaigns are performed. The stations are equipped with up-to-date instruments and run according to internationally established measurement protocols. The stations have a comprehensive education program, which is efficiently utilized in organizing e.g. summer and winter schools. The large number of stations enables comparisons between different environments. The NCoE CRAICC aims at clarifying the feedbacks between atmosphere, cryosphere and biosphere processes, including the roles of society and associated human activities as part of the interactions and feedback mechanisms acting on the Arctic climate system. The measurements at the stations focus on the role played by short-lived pollutants and aerosol-cloud interactions and their linkages with cryospheric changes.','https://www.atm.helsinki.fi/craicc/',NULL,12,NULL,NULL,NULL,NULL);  -- INAR RI
INSERT INTO infra.palvelu VALUES(186,'ANAEE','AnaEE (Analysis and Experimentation on Ecosystems)','AnaEE on valmisteluvaiheessa oleva eurooppalainen, kokeellisen ekosysteemitutkimuksen infrastruktuuri, joka luo puitteet ekosysteemien tilan, ympäristön ja maankäytön muutosten analysointiin, havainnointiin ja ennustamiseen. Valmisteluvaiheessa (2012-2016) on mukana 14 partneria 10 maasta (Belgia, Italia, Norja, Ranska, Ruotsi, Suomi, Tanska, Tšekki, Turkki, UK), ja sitä rahoittaa Euroopan komission seitsemäs puiteohjelma (FP7). Suomalaisena partnerina toimii Helsingin yliopisto, joka myös koordinoi Suomen kansallista AnaEE-hanketta. Varsinaisen toiminnan kaavaillaan alkavan vuonna 2018, jota edeltää parivuotinen rakennusvaihe.','AnaEE is a European infrastructure for experimental ecosystem research in its preparatory phase. AnaEE will create a framework to analyse, observe and predict the changes in the climate, environment, ecosystems and land use. 14 partners from 10 countries (Belgium, Czech Republic, Denmark, Finland, France, Italy, Norway, Sweden, Turkey, UK) are involved in the preparatory phase (2012-2016) funded by the European Commission’s 7th Framework Programme (FP7). The Finnish Partner is the University of Helsinki which is also coordinating the national AnaEE community. The full operation of the AnaEE infrastructure is envisaged to take place in 2018, preceded by a two-year construction phase.','http://blogs.helsinki.fi/anaee-suomi/en/','http://blogs.helsinki.fi/anaee-suomi/?page_id=2',12,NULL,NULL,NULL,NULL);  -- INAR RI
INSERT INTO infra.palvelu VALUES(187,'ACTRIS','ACTRIS (Aerosols, Clouds, and Trace gases Research InfraStructure Network)','ACTRIS-Suomi on ilmakehän pienhiukkasten, pilviin liittyvien suureiden kuten vesipitoisuus (jää ja neste olomuodot) ja lyhytikäisten hivenkaasujen havainnointiin ja ymmärtämiseen perustuva tutkimusinfrastruktuurihanke. ACTRIS-Suomi on tällä hetkellä osa CNRS:n (Ranska) ja CNR:n (Italia) koordinoimaa EU-FP7-ACTRIS - ”Aerosols, Clouds, and Trace gases Research Infrastructure Network” infrastruktuurihanketta, jonka pitkän tähtäimen suunnitelmaa on perustaa pysyvä, standardisoitu eurooppalainen mittausverkosto. ACTRIS tutkimusinfrastruktuuriin liittyviä kansallisia asemia (SMEAR asemat, Sammaltunturin mittausasema) hoitavat Suomessa Helsingin yliopisto ja Ilmatieteen laitos.','ACTRIS Finland is a research infrastructure that focuses on observing and understanding atmospheric aerosols, cloud properties (e.g. different forms of water) and short-lived trace gases. ACTRIS Finland is at the moment part of EU-FP7-Actris project coordinated by CNRS (France) and CNR (Italy). The aim for EU-FP7-Actris is to establish a permanent, standardized observation network. ACTRIS Finland stations (SMEAR stations, Sammaltunturi station) are operated by University of Helsinki and Finnish Meteorological Institute.','http://www.atm.helsinki.fi/actris/','http://www.atm.helsinki.fi/actris/',12,NULL,NULL,NULL,NULL);  -- INAR RI

INSERT INTO infra.palvelu VALUES(188,'Värriö','Värriö','Värriö on avustava ekosysteemiasema. Värriössä tutkitaan pohjoisen metsäekosysteemin toimintaa sekä ilmakehän prosesseja ja ilmansaasteiden kulkeutumista mittaamalla mm. kasvihuonekaasujen voita, meteorologisia suureita, hivenkaasujen pitoisuuksia ja ilmakehän pienhiukkasten muodostumista. Toimintansa vuonna 1991 aloittanut asema kuuluu Helsingin yliopiston Ilmakehätieteiden keskuksen hallintaan ja on osa vuonna 1967 perustettua Värriön tutkimusasema, joka sijaitsee Sallan kunnassa Värriön luonnonpuiston ympäröimänä. Tutkimusasemalla kerätään pitkiä havaintosarjoja mm. lumipeitteestä, fenologiasta, marja- ja käpysadoista ja linnuista ja hyönteisistä, joiden avulla seurataan pohjoisen metsä- ja tunturiluonnon muutoksia ja niihin vaikuttavia ilmastotekijöitä. Värriö on myös osa SMEAR-asemaverkostoa.','Värriö is an Associate Ecosystem station. Värriö incorporates research of the function and productivity of the subarctic forest ecosystem, atmospheric processes and air pollution and in the Arctic since 1991. Measurements at the station include greenhouse gas fluxes, meteorology, atmospheric trace gases and aerosol formation. The station belongs to the Institute for Atmospheric Research at the University of Helsinki and it is part of Värriö Subarctic Research Station which was founded in 1967. It is located in the Värriö Strict Nature Reserve in Eastern Lapland. The station has collected exceptionally long time series of the environment, including e.g. snow cover, phenology, berry and cone production, birds and insects, which reflect the changes in subarctic forests and fell ecosystems over decades. Värriö is also a part of SMEAR station network.','http://www.atm.helsinki.fi/SMEAR/index.php/smear-1','http://www.helsinki.fi/metsatieteet/varrio/',13,'Värriön tutkimusasema, Ainijärventie 114','Savukoski',67.761642,29.453345);  -- ICOS
INSERT INTO infra.palvelu VALUES(189,'Kenttärova','Kenttärova','Kenttärova on avustava ekosysteemiasema. Mikrometeorologisten koko metsän vuomittausten lisäksi havainnoimme pitoisuuksia ilmakehässä ja maaperän kasvihuonekaasujen päästöjä. Paikalla on ilmatieteen laitoksen sääasema, jolla on havaittu useana vuonna Suomen korkein lumensyvyys. Kenttärova sijaitsee paksusammaleisessa kuusimetsässä Pallaksen mittauskeskittymässä 5 km etäisyydellä Pallaksesta. Kuusien korkeus on keskimäärin 15 m ja ikä 80-240 vuotta. Seassa on joitain hieskoivuja.','Kenttärova is an Associate Ecosystem station and located in the Pallas supersite. Micrometeorological carbon dioxide fluxes, greenhouse gas concentrations in and above the forest and soil emissions are monitored. There is a weather station of the Finnish Meteorological Institute at which, in many years, the highest snow depth in Finland has been recorded. The station is in a 80-240 year old Norway spruce forest. Average height of the spruce trees is 15 m. Soil is podzolic till.','http://en.ilmatieteenlaitos.fi/GHG-measurement-sites#Pallas_Kenttarova',NULL,13,'Pallaksentie 1961, 99300','Muonio',68.031287,24.150083);  -- ICOS

INSERT INTO infra.palvelu VALUES(190,NULL,'Beamline #7 - ARPES (2017)',NULL,'Energy Range: 10 eV - 1000 eV, R 100000 < 100 eV - Angle resolved photoelectron spectroscopy for research in correlated materials, and condensed state physics','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- MAX IV
INSERT INTO infra.palvelu VALUES(191,NULL,'Beamline #8 - FinEstBeaMS (2017)',NULL,'Energy Range: 4.3 eV - 1000 eV, R > 5000 full range - XPS, XAS, coincidence,  luminescence for molecular materials research. Functional surfaces, environmental molecules and nanoparticles.','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- MAX IV
INSERT INTO infra.palvelu VALUES(192,NULL,'Beamline #9 - SPECIES (2017)',NULL,'Energy Range: 21 eV - 1500 eV, R 10000 full range - Near ambient pressure photoelectron spectroscopy, soft X-ray absorption spectroscopy and resonant scattering for solid state, atomic and molecular physics and chemistry','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- MAX IV
INSERT INTO infra.palvelu VALUES(193,NULL,'Beamline #10 - FlexPES (2017)',NULL,'Energy Range: 40 eV - 1500 eV, R 10000 full range - Photoelectron spectroscopy, soft X-ray absorption spectroscopy and luminescence for solid state, atomic and molecular physics and chemistry','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- MAX IV
INSERT INTO infra.palvelu VALUES(194,NULL,'Beamline #11 - MAXPEEM (2017)',NULL,'Energy Range: 21 eV - 1500 eV, R > 5000 full range - Photoelectron microscopy for catalysis, corrosion, and surface science','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- MAX IV
INSERT INTO infra.palvelu VALUES(195,NULL,'Beamline #12 - CoSAXS (2018)',NULL,'Energy Range: 4 - 20 keV - Small / Wide angle scattering for research in material science as well as solid state physics, chemistry and biology','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- MAX IV
INSERT INTO infra.palvelu VALUES(196,NULL,'Beamline #13 - SoftiMAX (2018)',NULL,'Energy Range: 275 eV - 1500 eV - Scanning tunneling X-ray microscopy and coherent scattering techniques luminescence for solid state, atomic and molecular physics and chemistry and biology','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- MAX IV
INSERT INTO infra.palvelu VALUES(197,NULL,'Beamline #14 - DanMAX (2018)',NULL,'Energy Range: 10 - 35 keV - X-ray diffraction and imaging for solid state, atomic and molecular physics and chemistry and biology','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- MAX IV
INSERT INTO infra.palvelu VALUES(198,NULL,'High throughput macromolecular diffraction',NULL,'A high throughput macromolecular diffraction facility offering possibilities for remote operation as well as mail-in service will be implemented','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- MAX IV
INSERT INTO infra.palvelu VALUES(199,NULL,'Training and education',NULL,'MAX IV Laboratory will implement a training and education program aimed at increasing the knowledge and competence on synchrotron light methods and their specific implementations at the MAX IV facility. The program will be developed in collaboration with other actors with MAX IV Laboratory taking a major role in coordination and planning of the activities. The MAX IV education and training program will include courses and other training efforts including web-based such focusing on general as well as beamline/method/science area specific training and education. The program will be managed as part of the MAX IV Users Office activities.','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- MAX IV
INSERT INTO infra.palvelu VALUES(200,NULL,'MAX IV Users Office',NULL,'The MAX IV Laboratory Users Office will be responsible for the services and processes needed by existing and potential external users of the laboratory. This includes the coordinating processes for submission of proposals for beamtime, the evaluation of these proposals, and the scheduling and organization of beamtime for the successful proposals. The Users Office will also provide assistance to the users regarding travel and accommodation. The Users office will also coordinate and arrange necessary training and education for existing and potential user communities.','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- MAX IV
INSERT INTO infra.palvelu VALUES(201,NULL,'MAX IV ILO',NULL,'The MAX IV Laboratory Industrial Liaison Office (ILO) will be responsible for the services and processes needed by industrial users that wish to perform proprietary research at the facility. This includes coordinating the processes for guidance of industrial users, purchasing of beamtime at the facility, and scheduling and organization of the beamtime. The ILO will actively communicate the possibilities at MAX IV Laboratory to existing and potential industrial users and will also participate in the planning and execution of training programs focusing on industrial users.','https://www.maxlab.lu.se/maxiv',NULL,13,'Fotongatan 2','Lund',55.726451,13.234915);  -- MAX IV

-- INSERT INTO infra.palvelu VALUES(171,NULL,'E-services',NULL,NULL,'https://www.csc.fi/e-services',NULL,11,NULL,NULL,LAT,LON); -- CSC RI
-- INSERT INTO infra.palvelu VALUES(172,NULL,'All Services',NULL,NULL,'https://www.csc.fi/services/details',NULL,13,NULL,NULL,LAT,LON); -- CSC RI
INSERT INTO infra.palvelu VALUES(202,'Laskentapalvelut, Pouta-pilvipalvelut, ohjelmistot ja tietokannat','Computing Services, Pouta Cloud Services, Software and Databases','CSC:n kautta tutkijoiden käytettävissä on Pohjoismaiden tehokkain laskentaympäristö laskennallisen tieteen, tutkimuksen ja tuotekehityksen tarpeisiin. CSC tarjoaa tutkijoiden käyttöön noin 200 tieteellistä ohjelmistoa, niihin liittyvää koulutusta ja käytön tukea sekä pilvipalveluita. Opetus- ja kulttuuriministeriön kanssa tehdyn sopimuksen ansiosta palvelut ovat korkeakoulujen tutkijoille pääosin maksuttomia.','CSC maintains and develops a top-notch computing environment and modeling, computing, information services, and cloud services for universities, polytechnics, research institutions and industrial companies. Researchers can use the largest collection of scientific software and databases in Finland. Due to the agreement made with the Ministry of Education and Culture, services are mainly available free of charge to researchers at higher education institutions.','https://www.csc.fi/scientific-computing-and-software','https://www.csc.fi/tieteellinen-laskenta-ja-ohjelmistot',11,NULL,NULL,NULL,NULL);  -- CSC RI
INSERT INTO infra.palvelu VALUES(203,'Funet-palvelut','Funet Network Services','Funet (Finnish University and Research Network) on Suomen korkeakoulujen, tutkimuksen ja opetuksen tietoverkko. Funetissa on noin 80 tutkimusorganisaatiota ja noin 370 000 käyttäjää. CSC vastaa Funet-verkon toiminnasta ja kehittämisestä. Funet-tietoverkon kautta yliopistot, ammattikorkeakoulut ja julkiset tutkimuslaitokset saavat ruuhkattomat ja luotettavat tietoliikenneyhteydet toisiinsa, kansainvälisiin tutkimusverkkoihin ja yleiseen internetiin. Funetin palvelut ovat asiakkaiden käytössä omakustannushintaan osana vuotuista Funet-jäsenmaksua tai joidenkin palvelujen osalta erillislaskutettavina palveluina.','Funet (Finnish University and Research Network) is a high-speed data communications network serving the Finnish research community. It connects about 80 research organizations and about 370 000 users. CSC maintains and develops the Funet network.','https://www.csc.fi/funet-network-services','https://www.csc.fi/funet-palvelut',11,NULL,NULL,NULL,NULL);  -- CSC RI
INSERT INTO infra.palvelu VALUES(204,'Konesali- ja kapasiteettipalvelut','Datacenter and Capacity Services','CSC tarjoaa korkeakouluille ja valtionhallinnolle räätälöityjä, energiatehokkaita ja skaalautuvia konesali- ja infrastruktuuripalveluja. Konesalimme sijaitsevat Kajaanissa ja Espoossa. CSC:n konesalipalveluissa hyödynnetään uusinta teknologiaa.CSC:n konesaleilla on kansainvälinen ISO/IEC 27001 sertifiointi.','CSC provides higher-education institutions and the state administration with tailored, energy-efficient and scalable data centre and infrastructure services. Our data centres are located in Kajaani and Espoo. CSC data centre services markedly reduce the energy and maintenance costs of higher-education institution data centres. CSC data centre services employ state-of-the-art technology and CSC data centres have been awarded the international ISO/IEC 27001 certification.','https://www.csc.fi/datacenter-and-capacity-services','https://www.csc.fi/konesali-ja-kapasiteettipalvelut',11,NULL,NULL,NULL,NULL);  -- CSC RI

-- INSERT INTO infra.palvelu VALUES(104,'Pilvipalvelut biolääketieteelle',NULL,'CSC:n pilvipalvelu on organisaation paikallisen laskenta- ja tallennuspalvelun jatke. Uusi rajapinta auttaa eri tutkimuslaitosten IT-henkilöitä räätälöimään laskenta- ja tallennuspalvelut omalle organisaatiolle sopiviksi. Palvelu koteloi monimutkaiset ohjelmistoympäristöt toimivaksi kokonaisuudeksi, jolloin yksittäisen laboratorion ohjelmistot toimivat sujuvasti CSC:n laskentaklusterissa.',NULL,NULL,'http://www.elixir-finland.org/palvelut/pilvipohjainen-kayttoliittyma/',11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
-- INSERT INTO infra.palvelu VALUES(113,NULL,'IaaS - Pouta clous services',NULL,'CSC''s cloud computing platforms, cPouta and ePouta, offer high performance computing with superior flexibility and user experience via Infrastructure as a Service (IaaS).','https://research.csc.fi/en/cloud-computing',NULL,11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
INSERT INTO infra.palvelu VALUES(205,NULL,'cPouta, ePouta - CSC Infrastructure as a Service cloud for bio and health use cases',NULL,'1.	cPouta is targeted for research projects accessing cloud from the Internet.\n
2.	ePouta IaaS cloud is designed for sensitive data processing. In ePouta the virtual machines are not connected to Internet but connect to the user organisations own network via lightpath or MPLS routing. Private network is key part of the compute service design, as then data under processing does not leave the local user organization network. Service will be audited based on Finnish state governmental elevated security standard in the end of 2015.\n
Both of the clouds are operated based on CSC’s common production level service principles and monitored continuously. Cloud service level document as well as pricing is available. For high-availability web services hosting CSC VMware is employed (ISO27001 and security audited in national elevated security standard level). ELIXIR Finland services by CSC for ELIXIR can be used for international usage within CSC resource allocation principles. Large scale permanent usage requires a contract even for parties within Finland. All services are monitored and statistics of usage including surveys are produced (e.g. https://sui.csc.fi/web/guest/host-monitor).','https://research.csc.fi/cloud-computing',NULL,11,NULL,NULL,NULL,NULL);  -- ELIXIR
-- INSERT INTO infra.palvelu VALUES(105,'REMS','REMS',NULL,'REMS is an open source tool for management of access rights to electronic resources, such as research datasets. Applicants can use their federated user IDs to log in to REMS, fill in the data access application and agree to the dataset''s terms of use. The REMS system then circulates the application to the resource owner or designated representative for approval. REMS also produces the necessary reports on the applications and the granted data access rights.','https://confluence.csc.fi/display/REMS/Home',NULL,11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
INSERT INTO infra.palvelu VALUES(206,NULL,'REMS - ELIXIR authentication and authorisation infrastructure services',NULL,'REMS\n
ELIXIR Finland at CSC coordinates ELIXIR AAI architecture design and implementation process including Resource Entitlement Management System (REMS) tool for managing data access to the data sets that require individual access authorizations based on an application process. REMS is an open source tool for management of access rights to electronic resources, such as research datasets. Applicants can use their federated user IDs to log in to REMS, fill in the data access application and agree to the dataset''s terms of use. The REMS system then circulates the application to the resource owner or designated representative for approval. REMS also produces the necessary reports on the applications and the granted data access rights. REMS helpdesk responds to requests or issues. The REMS service deployment includes integration with the European Genome-phenome Archive (50 active users) and BBMRI Finland (110 active users).\n
Researcher Identity Management\n
The ELIXIR AAI architecture includes a service that allows users to link their academic, corporate or social media identity to an ELIXIR identity (so called proxy service). The ELIXIR identities will be enriched with attributes from reliable sources to for example describe that the ELIXIR identity holder belongs to a research project with data access rights, storage and computing resources dedicated from a particular ELIXIR service. The group membership will be managed using PERUN provided by the ELIXIR Czech Republic. The individual data access authorizations will be assigned to ELIXIR identity using ELIXIR Finland REMS service that has already been used in production with European Genome-phenome Archive (EGA) and the Finnish Biobanks (THL).\n
https://confluence.csc.fi/display/REMS/Home
https://www.ebi.ac.uk/ega/home
https://www.thl.fi/en/web/thlfi-en/topics/information-packages/thl-biobank/researchers','https://confluence.csc.fi/display/REMS/Home',NULL,11,NULL,NULL,NULL,NULL);  -- ELIXIR
-- INSERT INTO infra.palvelu VALUES(106,'HAKA','HAKA','Haka on Suomen käytetyin korkeakoulujen ja tutkimuslaitosten käyttäjätunnistusjärjestelmä, jolla on noin 290 000 loppukäyttäjää. Haka-käyttäjätunnistus on myös väylä yli 160 palveluun. Hakan palveluihin kirjaudutaan yli 11 miljoonaa kertaa vuodessa.','Haka is the identity federation for the Finnish higher-education and research institutions. Its 290,000 end users make it the most-used system of its kind. Haka identity federation also serves as a route to more than 160 services. Users log INTO infra.Haka services over 11 million times per year.','https://www.csc.fi/en/-/haka-kayttajatunnistusjarjestel-1?_82_languageId=en_US','https://www.csc.fi/-/haka-kayttajatunnistusjarjestel-1',11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
INSERT INTO infra.palvelu VALUES(207,'HAKA','HAKA',NULL,'Haka is the identity federation for the Finnish higher-education and research institutions. Its 290,000 end users make it the most-used system of its kind. Haka identity federation also serves as a route to more than 160 services. Users log INTO infra.Haka services over 11 million times per year.','https://www.csc.fi/en/-/haka-kayttajatunnistusjarjestel-1?_82_languageId=en_US','https://www.csc.fi/-/haka-kayttajatunnistusjarjestel-1',11,NULL,NULL,NULL,NULL);  -- ELIXIR
-- INSERT INTO infra.palvelu VALUES(107,'KALMAR2','KALMAR2','Kalmarin unioni on pohjoismaiden korkeakoulujen yhteinen käyttäjätunnistusjärjestelmä. Korkeakoulujen opiskelijat ja henkilökunta pääsevät yhdellä käyttäjätunnuksella ja salasanalla palveluihin myös muissa pohjoismaissa.','The Kalmar e-identity Union is a cross-Nordic authentication system for higher education and research. Students and staff members in a Nordic university or research institution can use a single username and password to access services in other Nordic countries.','https://www.kalmar2.org/kalmar2web/front_page.html','https://www.kalmar2.org/kalmar2web/etusivu.html',11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
INSERT INTO infra.palvelu VALUES(208,'KALMAR2','KALMAR2',NULL,'The Kalmar e-identity Union is a cross-Nordic authentication system for higher education and research. Students and staff members in a Nordic university or research institution can use a single username and password to access services in other Nordic countries.','https://www.kalmar2.org/kalmar2web/front_page.html','https://www.kalmar2.org/kalmar2web/etusivu.html',11,NULL,NULL,NULL,NULL);  -- ELIXIR
-- INSERT INTO infra.palvelu VALUES(108,'eduGAIN','eduGAIN',NULL,'eduGAIN interconnects identity federations around the world, simplifying access to content, services and resources for the global research and education community. eduGAIN enables the trustworthy exchange of information related to identity,, authentication and authorisation (AAI) by coordinating elements of the federations'' technical infrastructure and providing a policy framework that controls this information exchange.','http://services.geant.net/edugain/About_eduGAIN/Pages/Home.aspx',NULL,11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
INSERT INTO infra.palvelu VALUES(209,'eduGAIN','eduGAIN',NULL,'eduGAIN interconnects identity federations around the world, simplifying access to content, services and resources for the global research and education community. eduGAIN enables the trustworthy exchange of information related to identity, authentication and authorisation (AAI) by coordinating elements of the federations'' technical infrastructure and providing a policy framework that controls this information exchange.','http://services.geant.net/edugain/About_eduGAIN/Pages/Home.aspx',NULL,11,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(210,NULL,'Large biological data mirroring (pilot)',NULL,'CSC replicates large important datasets like Ensembl from the EBML-EBI and other major archives to Finland to make them locally more accessible on the compute platforms.','http://bio.nic.funet.fi/pub/mirrors/',NULL,11,NULL,NULL,NULL,NULL);  -- ELIXIR
-- INSERT INTO infra.palvelu VALUES(110,'Biomedinfra','Biomedinfra','BBMRI.fi on eurooppalaisen BBMRI-verkoston kansallinen katto-organisaatio Suomessa. BBMRI:n päätavoitteena on kehittää tutkimusinfrastruktuuri, joka mahdollistaa näytekokoelmien ja niihin liittyvän tiedon korkeatasoisen tutkimuskäytön.','BBMRI.fi is the Finnish National Node of BBMRI. The major goal of BBMRI is to develop a research infrastructure that will facilitate high quality research use of comprehensive collections of biological samples and associated data.','http://bbmri.fi/','http://bbmri.fi/',11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
INSERT INTO infra.palvelu VALUES(211,'BBMRI.fi','BBMRI.fi',NULL,'BBMRI.fi is the Finnish National Node of BBMRI. The major goal of BBMRI is to develop a research infrastructure that will facilitate high quality research use of comprehensive collections of biological samples and associated data.','http://bbmri.fi/','http://bbmri.fi/',11,NULL,NULL,NULL,NULL);  -- ELIXIR
-- INSERT INTO infra.palvelu VALUES(117,'Koulutus',NULL,'ELIXIR tarjoaa koulutusmahdollisuuksia ympäri Eurooppaa. Suomen ELIXIR-keskus CSC järjestää monipuolisia bioinformatiikan kursseja, joissa opastetaan tietokantojen, ohjelmistojen ja pilvipohjaisten palvelujen käytössä. CSC:n asiantuntijat auttavat tutkijoita tietoteknisissä ongelmissa sekä neuvovat laskentamenetelmien ja niihin liittyvien ohjelmien käytössä ja kehittämisessä.',NULL,NULL,'http://www.elixir-finland.org/palvelut/koulutus/',11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
INSERT INTO infra.palvelu VALUES(212,NULL,'Researcher and Trainer Training in bioinformatics',NULL,'CSC organizes bioinformatics courses. In addition to training specific to bioinformatics, CSC organizes training events for a wider audience covering topics like R, Python, Linux and HPC. Many of the NGS courses use CSC’s Chipster platform (http://chipster.csc.fi) and the cPouta cloud infrastructure.  The Chipster platform is widely used internationally with local installations on several continents, and five of our NGS courses were run abroad. Other international activities include hosting the Data Carpentry hackathon and workshop, and involvement in GOBLET.',NULL,'https://www.csc.fi/training-services',11,NULL,NULL,NULL,NULL);  -- ELIXIR
-- INSERT INTO infra.palvelu VALUES(118,'Elixirin kansainväliset palvelut ja standardit',NULL,'ELIXIR rakennetaan eri puolilla Eurooppaa sijaitsevista biotieteiden keskuksista (Life Science Centers of Excellence). Nämä nk. ELIXIR-solmut yhdistetään nopeiden tietoliikenneyhteyksien avulla keskuspaikkaan Euroopan bioinformatiikkainstituuttiin (EMBL-EBI), joka sijaitsee Hinxtonissa, Britanniassa.',NULL,NULL,'http://www.elixir-finland.org/palvelut/elixirin-kansainvaliset-palvelut-ja-standardit/',11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
INSERT INTO infra.palvelu VALUES(213,NULL,'International standards for biological data and metadata','ELIXIR rakennetaan eri puolilla Eurooppaa sijaitsevista biotieteiden keskuksista (Life Science Centers of Excellence). Nämä nk. ELIXIR-solmut yhdistetään nopeiden tietoliikenneyhteyksien avulla keskuspaikkaan Euroopan bioinformatiikkainstituuttiin (EMBL-EBI), joka sijaitsee Hinxtonissa, Britanniassa.',NULL,'http://www.elixir-europe.org/services/standards',NULL,11,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(214,NULL,'Tools and Databases run by ELIXIR Nodes',NULL,'In the countries that have ratified the ELIXIR Consortium Agreement, ELIXIR Nodes are currently developing Collaboration Agreements with the ELIXIR Hub. These Collaboration Agreements will set out in detail the tools and databases to be carried out by that Node in the context of ELIXIR.\n
The list below show only the tools and databases from those ELIXIR Nodes where the Collaboration Agreement has been agreed. The list below will be continuously updated as Collaboration Agreements are signed. ELIXIR data resource are freely available for Finnish researchers, and recognised community-recognized data repositories supported by major scientific journals publishers such as Nature Publishing Group.',NULL,NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(215,NULL,'The European Nucleotide Archive (ENA)',NULL,'The European Nucleotide Archive (ENA), a member of the International Nucleotide Sequence Database Collaboration, contains all the nucleotide sequences in the public domain and consolidates data from EMBL-Bank, the European Trace Archive and the Sequence Read Archive.','http://wwwdev.ebi.ac.uk/ena',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(216,NULL,'UniProt',NULL,'UniProt produces and maintains automatic and manually curated annotation of all publicly available protein sequences and serves these to users through various interfaces. UniProt is the central hub in integration of biomolecular databases and a joint effort of EMBL-EBI with the SIB Swiss Institute of Bioinformatics and PIR in the USA.','http://www.uniprot.org/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(217,NULL,'Protein Data Bank in Europe (PDBe)',NULL,'The Protein Data Bank in Europe (PDBe) is the European part of the wwPDB for the collection, organisation and dissemination of data on biological macromolecular structures.','http://wwwdev.ebi.ac.uk/pdbe/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(218,NULL,'Pfam',NULL,'Pfam is a large collection of protein families, each represented by multiple sequence alignments and hidden Markov models (HMMs). Proteins are generally composed of one or more functional regions, commonly termed domains. Different combinations of domains give rise to the diverse range of proteins found in nature. The identification of domains that occur within proteins can therefore provide insights INTO infra.their function.','http://pfam.xfam.org/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(219,NULL,'Ensembl',NULL,'Ensembl produces and maintains automatic and manually curated annotation on selected eukaryotic genomes. It is integrated with several other important molecular resources, for example UniProt, and can be accessed programmatically or through a web browser. Ensembl is developed as a joint project between EMBL-EBI and the Wellcome Trust Sanger Institute.','http://www.ensembl.org/index.html',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(220,NULL,'Gene Ontology',NULL,'The Gene Ontology (GO) project is a collaborative effort to address the need for consistent descriptions of gene products across databases. The GO project has developed three structured, controlled vocabularies (ontologies) that describe gene products in terms of their associated biological processes, cellular components and molecular functions in a species-independent manner.','http://geneontology.org/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(221,NULL,'InterPro',NULL,'InterPro classifies proteins INTO infra.families and predicts the presence of important domains and sites.','http://wwwdev.ebi.ac.uk/interpro/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(223,NULL,'IntEnz',NULL,'IntEnz is a database of enzyme nomenclature that also provides enzyme classifications based on the nature of catalysed reactions. IntEnz is produced in collaboration with the SIB Swiss Institute of Bioinformatics.','http://wwwdev.ebi.ac.uk/intenz/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(224,NULL,'ArrayExpress',NULL,'ArrayExpress is a MIAME-standard compliant resource that stores functional genomics experiments performed using RNA-Seq/ChIP-Seq and array-based technologies.','http://wwwdev.ebi.ac.uk/arrayexpress/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(225,NULL,'ChEBI (Chemical Entities of Biological Interest)',NULL,'ChEBI (Chemical Entities of Biological Interest) is a dictionary of small molecular entities. It is manually annotated and provides a chemical ontology to describe small molecules, including their biological and chemical roles.','http://wwwdev.ebi.ac.uk/chebi/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(226,NULL,'IntAct',NULL,'IntAct provides a freely available, open source database system and analysis tools for molecular interaction data.','http://wwwdev.ebi.ac.uk/intact/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(227,NULL,'PRIDE (The Proteomics Identifications Database)',NULL,'PRIDE (The Proteomics Identifications Database) is a standards-compliant, public repository for proteomics data. It contains protein and peptide identifications and their associated supporting evidence.','http://wwwdev.ebi.ac.uk/pride',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(228,NULL,'Reactome',NULL,'Reactome is a free, open-source, curated and peer reviewed pathway database. Its goal is to provide intuitive bioinformatics tools for the visualization, interpretation and analysis of pathway knowledge to support basic research, genome analysis, modeling, systems biology and education.','http://www.reactome.org/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(229,NULL,'BioModels',NULL,'BioModels is a database of published mathematical models describing biological processes.','http://wwwdev.ebi.ac.uk/biomodels/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(230,NULL,'The European Genome-phenome Archive (EGA)',NULL,'The European Genome-phenome Archive (EGA) allows users to explore datasets from numerous genotype experiments including case-control, population and family studies that are supplied by a range of data providers.','https://wwwdev.ebi.ac.uk/ega/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(231,NULL,'The Ontology Lookup Service (OLS)',NULL,'The Ontology Lookup Service (OLS) provides a web service interface to query multiple ontologies from a single location with a unified output format.','http://wwwdev.ebi.ac.uk/ontology-lookup',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(232,NULL,'Ensembl Genomes',NULL,'Ensembl Genomes is a portal providing access to genome-scale data from bacteria, protists, fungi, plants and invertebrate metazoa, through a unified set of interactive and programmatic interfaces based on the Ensembl software platform.','http://ensemblgenomes.org/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(234,NULL,'Expression Atlas',NULL,'The Expression Atlas allows users to search for gene expression changes measured in various cell types, organism parts, and disease states. It represents a curated subset of the ArrayExpress and GEO Archive experiments.','http://wwwdev.ebi.ac.uk/gxa/home',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(235,NULL,'ChEMBL',NULL,'ChEMBL is a database of bioactive compounds that focuses on interactions between small molecules and their macromolecular targets, including medicinal chemistry, clinical development and therapeutics data.','http://wwwdev.ebi.ac.uk/chembl/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(236,NULL,'EBIMetagenomics',NULL,'EBIMetagenomics is an automated pipeline for the analysis and archiving of metagenomic data.','http://wwwdev.ebi.ac.uk/metagenomics',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(237,NULL,'Enzyme Portal',NULL,'The Enzyme Portal integrates publicly available information from: the UniProt Knowledgebase; the Protein Data Bank in Europe; Rhea, a database of enzyme- catalyzed reactions; Reactome; IntEnz, a resource with enzyme nomenclature information; ChEBI; ChEMBL; Cofactor and MACiE.','http://wwwdev.ebi.ac.uk/enzymeportal/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(238,NULL,'EuropePMC',NULL,'EuropePMC contains over 3 million full text life science research articles, of which over 900 000 are open access, and combines these with 30 million abstracts from PubMed and other sources. It also includes ORCIDs, article and data citation information, links to data, text-mining tools and grant information.','http://europepmc.org/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(239,NULL,'MetaboLights',NULL,'MetaboLights is a database for metabolomics experiments and derived information.','http://wwwdev.ebi.ac.uk/metabolights',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
INSERT INTO infra.palvelu VALUES(240,NULL,'Rfam database',NULL,'The Rfam database is a collection of RNA families, each represented by multiple sequence alignments, consensus secondary structures and covariance models (CMs).','http://rfam.xfam.org/',NULL,NULL,NULL,NULL,NULL,NULL);  -- ELIXIR
-- INSERT INTO infra.palvelu VALUES(109,'Datan hallinnointi',NULL,'Suomen ELIXIR-keskus tukee tietoteknisesti ”Suuren datan” hyödynnettävyyttä. Sellaista on Terveyden ja hyvinvoinnin laitoksen ja Suomen molekyylilääketieteen instituutin digitoiman suomalaisen populaation geenidatan käyttö lääketieteessä.',NULL,NULL,'http://www.elixir-finland.org/palvelut/datan-sailytys-ja-laskenta/',11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
-- INSERT INTO infra.palvelu VALUES(111,'Syöpägenomiatlas','Cancer genome atlas (TCGA)',NULL,'The Cancer Genome Atlas (TCGA) is a comprehensive and coordinated effort to accelerate our understanding of the molecular basis of cancer through the application of genome analysis technologies, including large-scale genome sequencing. TCGA is a joint effort of the National Cancer Institute (NCI) and the National Human Genome Research Institute (NHGRI), two of the 27 Institutes and Centers of the National Institutes of Health, U.S. Department of Health and Human Services.','http://cancergenome.nih.gov/abouttcga',NULL,11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
-- INSERT INTO infra.palvelu VALUES(112,NULL,'Hadoop',NULL,'The Apache Hadoop software library is a framework that allows for the distributed processing of large data sets across clusters of computers using simple programming models.','http://hadoop.apache.org/',NULL,11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
-- INSERT INTO infra.palvelu VALUES(114,'Virtuaalikoneet',NULL,'Suomen ELIXIR-keskus tukee biolääketieteellisten työkalujen kehittäjiä. Jos työkalusta tulee suosittu, sen skaalautuvuutta voidaan tukea keskuksen kautta. Virtuaalikoneissa voi olla erikoistuneita sekvenssianalytiikan työkaluja sekä työkaluja näytteiden digitoimiseen ja DNA-sirudatan analysoimiseen.',NULL,NULL,'http://www.elixir-finland.org/palvelut/virtuaaliset-koneet/',11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
-- INSERT INTO infra.palvelu VALUES(115,NULL,'WebMicroscope',NULL,'WebMicroscope serves as a platform for a wide range of applications and activities, including slide seminars, Quality Assurance projects, interactive educational material, research applications (Tissue Micro Array analysis), publication supplements and clinical services.','http://www.webmicroscope.net/',NULL,11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)
-- INSERT INTO infra.palvelu VALUES(116,NULL,'Chipster',NULL,'Chipster is a user-friendly analysis software for high-throughput data. It contains over 350 analysis tools for next generation sequencing (NGS), microarray, proteomics and sequence data. Users can save and share automatic analysis workflows, and visualize data interactively using a built-in genome browser and many other visualizations.','http://chipster.csc.fi/',NULL,11,NULL,NULL,LAT,LON); -- ELIXIR (Suomi)

-- INSERT INTO infra.palvelu VALUES(165,'Euclid-kosmologiamissio','Euclid Consortium',NULL,'The Euclid mission aims at understanding why the expansion of the Universe is accelerating and what is the nature of the source responsible for this acceleration which physicists refer to as dark energy.','http://www.euclid-ec.org/',NULL,12,NULL,NULL,LAT,LON); -- Euclid
INSERT INTO infra.palvelu VALUES(241,'Laitteisto ja menetelmät Euclidin datan analyysiin','The hardware and software for Euclid data analysis','Euclidin SGS sisältää laitteiston ja menetelmät Euclid-kollaboraation (yli 1000 tutkijaa) käyttöön Euclidin datan analysoimiseksi','The Euclid SGS consists of the infrastructure and software for Euclid data analysis to be performed by the Euclid collaboration (over 1000 scientists)','http://www.euclid-ec.org/',NULL,12,NULL,NULL,NULL,NULL);  -- comment
INSERT INTO infra.palvelu VALUES(242,'Euclidin datan jakaminen','Distribution of Euclid data','Euclidin data tulee avoimeen käyttöön vaiheittain alkaen vuodesta 2022','The Euclid data will become public for general use in stages beginning in 2022','http://www.euclid-ec.org/',NULL,12,NULL,NULL,NULL,NULL);  -- comment

INSERT INTO infra.palvelu VALUES(243,'Finna','Finna','Finna tarjoaa Opetus- ja kulttuuriministeriön hallinnonalaan kuuluville arkistoille, museoille ja kirjastoille palvelun, jonka avulla ne voivat luoda oman verkkokäyttöliittymän ja tarjota asiakkailleen aineistoja löydettäväksi. Myös aineistoihin liittyvät sähköiset palvelut pyritään integroimaan järjestelmään.','With Finna Finnish libraries, archives and museums can make their own online user interfaces and make their content discoverable and accessible. The additional goal is to integrate all content-related online services.','https://www.finna.fi/?lng=en-gb','https://www.finna.fi/',11,NULL,NULL,NULL,NULL);  -- Finna

INSERT INTO infra.palvelu VALUES(244,'www.bbmri.fi','www.bbmri.fi',NULL,'BBMRI.fi is a national node of BBMRI-ERIC operating with collaboration between national biobanks. The BBMRI.fi www-pages describe the network operation and goals and provides information on Finnish Biobanks, Key Personnel, working groups, information on ethical and legal issues as well as international activities of BBMRI-ERIC. Available tools for researchers include: Sample counter, IT-tools, and Laboratory services.','http://www.bbmri.fi','http://www.bbmri.fi/fi/',11,NULL,NULL,NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.palvelu VALUES(245,'Auria Biopankki','Auria Biobank',NULL,NULL,'https://www.auriabiopankki.fi/?lang=en','https://www.auriabiopankki.fi',NULL,NULL,NULL,NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.palvelu VALUES(246,'THL Biopankki','THL Biobank',NULL,NULL,'https://www.thl.fi/en/web/thlfi-en/topics/information-packages/thl-biobank','https://www.thl.fi/fi/aiheet/tietopaketit/thl-biopankki',NULL,NULL,NULL,NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.palvelu VALUES(247,'Hematologinen Biopankki','Hematological Biobank (FHRB Biobank)',NULL,NULL,'http://www.fhrb.fi/front-page.html','http://www.hematologinenbiopankki.fi/',NULL,NULL,NULL,NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.palvelu VALUES(248,'Helsingin Urologinen Biopankki (HUB Biopankki)','Helsinki Urological Biobank (HUB Biobank)',NULL,NULL,'http://www.hubbiobank.fi/en/','http://www.hubbiobank.fi/fi/',NULL,NULL,NULL,NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.palvelu VALUES(249,'Helsingin Biopankki','Helsinki Biobank (AMCH Biobank)',NULL,NULL,'http://www.amch.helsinki.fi/?q=en','http://www.amch.helsinki.fi/',NULL,NULL,NULL,NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.palvelu VALUES(250,'Pohjois-Suomen Biopankki Borealis','Northern Finland Biobank Borealis',NULL,NULL,'http://www.oulu.fi/mrc/node/20008','https://www.ppshp.fi/biopankki',NULL,NULL,NULL,NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.palvelu VALUES(251,'Tampereen Biopankki','Tampere Biobank',NULL,NULL,NULL,'http://www.tays.fi/biopankki',NULL,NULL,NULL,NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.palvelu VALUES(252,'Itä-Suomen Biopankki','Biobank of Eastern Finland',NULL,NULL,'http://www2.uef.fi/en/itasuomenbiopankki','http://www2.uef.fi/fi/itasuomenbiopankki',NULL,NULL,NULL,NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.palvelu VALUES(253,'Keski-Suomen Biopankki','Central Finland Biobank',NULL,NULL,NULL,'http://www.ksshp.fi/fi-FI/Ammattilaiselle/Biopankki',NULL,NULL,NULL,NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.palvelu VALUES(254, NULL, 'BBMRI-ERIC',NULL,'Seventeen Member States and one International Organisation have joined forces in establishing BBMRI-ERIC, which is one of the largest health Research Infrastructure in Europe today. BBMRI-ERIC primarily aims at establishing, operating, and developing a pan-European distributed research infrastructure of biobanks and biomolecular resources. This will facilitate the access to biological resources as well as biomedical facilities and support high-quality biomolecular and medical research.','http://www.bbmri-eric.eu',NULL,NULL,NULL,NULL,NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.palvelu VALUES(255, NULL, 'BBMRI-ERIC ELSI Common Services',NULL,NULL,'http://bbmri-eric.eu/elsi',NULL,NULL,NULL,NULL,NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.palvelu VALUES(256, NULL, 'BBMRI-ERIC Directory',NULL,NULL,'http://bbmri-eric.eu/bbmri-eric-directory',NULL,NULL,NULL,NULL,NULL,NULL);  -- BBMRI.fi
INSERT INTO infra.palvelu VALUES(257,NULL,'KITE availability database',NULL,'KITE is a catalog of Finnish sample collections and contains tools to browse and search for variables available in each sample collection. KITE is currently piloted by THL Biobank and by FIMM.','https://kite.fimm.fi/',NULL,11,'Biomedicum Helsinki','Helsinki',60.191246,24.906474); -- BBMRI.fi,Biopankki-infrastruktuuri
INSERT INTO infra.palvelu VALUES(258,NULL,'Nationalbiobanks.fi',NULL,'Nationalbiobanks.fi is a Finnish DNA sample collection catalog, which contains information on epidemiological and clinical Finnish sample collections, though the list is not comprehensive. The pages include short description of the sample collections, contact information, as well as information on genome-wide SNP genotyping studies involving these study collections.','http://www.bbmri.fi/researchers-tools/nationalbiobanks-fi/',NULL,11,'THL, Mannerheimintie 166','Helsinki',60.200852,24.899255); -- BBMRI.fi, Biopankki-infrastruktuuri
INSERT INTO infra.palvelu VALUES(259,NULL,'SamWise Biobank Database',NULL,'SamWise is an in house laboratory information management system (LIMS) and biobank database used at THL Biobank and is available for all BBMRI biobanks.  It stores subject- and sample-related data and metadata. In addition, it stores phenotype data and metadata and has a large set of tools for data import, export, search and modifications.','http://www.bbmri.fi/researchers-tools/it-tools/',NULL,11,'THL, Mannerheimintie 166','Helsinki',60.200852,24.899255); -- BBMRI.fi,Biopankki-infrastruktuuri
INSERT INTO infra.palvelu VALUES(260,NULL,'Resource Entitlement Management System (REMS)',NULL,'The Resource Entitlement Management System (REMS) is an electronic tool that manages access rights to research resources, such as research datasets. Applicants can use their federated identity as authentication to the REMS, complete the data access application, commit to license terms and submit the application to the appropriate resource. REMS is hosted by CSC / ELIXIR Finland','https://confluence.csc.fi/display/REMS/Home',NULL,11,'THL, Mannerheimintie 166','Helsinki',60.200852,24.899255); -- BBMRI.fi, Biopankki-infrastruktuuri
INSERT INTO infra.palvelu VALUES(261,'Biopankki-teknologiat (MIBI)','Meilahti Integrated Biobank Infrastructure (MIBI)','Meilahti Integrated Biobank Infrastructure (MIBI) tarjoaa useita erilaisia näytteidenkäsittely- ja varastointipalveluita.','MIBI, which offers a wide range of biobanking services for all interested research projects collecting samples and data, is now a leading biobanking infrastructure in Finland. Its experts can offer consultation on how to build a biobank (ethical, consent, legal, technological, informatics, funding and scientific advice) as well as give an overview of the wide technological capabilities that can make use of the sample collections.','https://www.fimm.fi/en/services/biobanking-facilities/mibi','http://www.bbmri.fi/fi/researchers-tools/biobank-technologies/',13,'Biomedicum Helsinki','Helsinki',60.191246,24.906474); -- BBMRI.fi


INSERT INTO infra.palvelu VALUES(262, 'Mittausaika', 'Beam time', 'Käyttöopastus (tarvittaessa) säteilylinjan valintaan ja määritelty määrä mittauskertoja. Mittausajan saanti perustuu kilpailuun ja vaatii hakemuksen.', 'Guidance (when needed) to choose the appropriate beamline and defined amount of shifts. Beam time is competed and requires an application. ', NULL, 'http://www.esrf.eu/UsersAndScience/UserGuide', 13, '71 avenue des Martyrs, 38000 ', 'Grenoble, France', '45.209208', '5.692709'); -- ESRF laitteistopainotteinen

INSERT INTO infra.palvelu VALUES(263, NULL, 'IODP', NULL, 'The IODP website contains information about the programme, application procedures, expeditions, IODP publications, databanks etc. ', NULL, 'https://www.iodp.org/', 11, NULL, NULL, NULL, NULL); -- IODP 'aineistopainotteinen'

INSERT INTO infra.palvelu VALUES(264, NULL, 'ECORD', NULL, 'The acronym ECORD stands for The European Consortium for Ocean Research Drilling. E.g. information about participating European countries, ECORD outreach and upcoming scientific missions is available. ', NULL, 'https://www.ecord.org/', 11, NULL, NULL, NULL, NULL); -- IODP 'aineistopainotteinen'

INSERT INTO infra.palvelu VALUES(265, NULL, 'IODP in Finland', NULL, 'IODP in Finland webpage contains information about past and ongoing IODP-related research in Finland.', NULL, 'http://iodpfinland.oulu.fi/index.html', 11, NULL, NULL, NULL, NULL); -- IODP 'aineistopainotteinen'

INSERT INTO infra.palvelu VALUES(266, 'Eliölajitietojen hakupalvelu: tietopalvelu, havaintojen hakupalvelu, luonnontieteellisten kokoelmien aineistojen hakupalvelu', 'Species information search service: search species-specific information, search occurrence records, search scientific collections', 'Palvelun avulla voi hakea suomalaista lajitietoa ja lajeista tallennettua havaintotietoa. Haettavat aineistot sisältävät harrastajien tallentamia, seuranta- ja kansalaistiedehankkeiden kautta kerättyjä ja tieteellisiin kokoelmanäytteisiin liittyviä havaintotietoja.', 'The search services provide Finnish species-specific information and occurrence records of observations. The data includes information and records compiled from various sources e.g. citizen science projects, scientific surveys and monitoring schemes and scientific collection.', 'http://laji.fi', 'http://species.fi', 11, 'Pohjoinen Rautatiekatu 13', 'Helsinki', '60.171244', '24.931513'); -- FinBIF 'aineistopainotteinen'

INSERT INTO infra.palvelu VALUES(267, 'Eliölajitietojen latauspalvelu', 'Species information upload service', 'Palvelun avulla voi ladata tai kopioida omaan tietokantaan haluamansa aineistot jatkojalostamista tai muuta käyttöä varten.', 'The download-service provides the option to make a personal copy of selected data for further analyses or other use.', 'http://laji.fi', 'http://species.fi', 11, 'Pohjoinen Rautatiekatu 13', 'Helsinki', '60.171244', '24.931513'); -- FinBIF 'aineistopainotteinen'

INSERT INTO infra.palvelu VALUES(268, 'Eliölajitietojen tallennus- ja jakopalvelu', 'Species information recording and download service', 'Palvelu tarjoaa tietokannan omien havaintotietojensa tallentamiseen ja hallintaan sekä väylän niiden jakamiseen laji.fi-sivuston kautta.', 'My observation -service provides the user with a database for their own observation records and collections and an option to share them through species.fi / laji.fi website.', 'http://laji.fi', 'http://species.fi', 11, 'Pohjoinen Rautatiekatu 13', 'Helsinki', '60.171244', '24.931513'); -- FinBIF 'aineistopainotteinen'

INSERT INTO infra.palvelu VALUES(269, 'Luonnontieteellisten kokoelmien digitointi', 'Digitisation of natural history collections', 'Palvelu tarjoaa mahdollisuuden luonnontieteellisille kokoelmayksiköille tilata digitointipalvelua tai tutkijoille tiettyjen näytteitten digitointia.', 'On-demand digitization of collections/specimens possible.', 'http://laji.fi', 'http://species.fi', 11, 'Pohjoinen Rautatiekatu 13', 'Helsinki', '60.171244', '24.931513'); -- FinBIF 'aineistopainotteinen'

INSERT INTO infra.palvelu VALUES(270, 'Tietojärjestelmä kokoelmanhallintaan', 'Collection data management system', 'Kokoelmanhallintajärjestelmä tarjotaan muiden kokoelmayksiköiden käyttöön.', 'Collection data management system offered for other natural history collections.', 'http://laji.fi', 'http://species.fi', 11, 'Pohjoinen Rautatiekatu 13', 'Helsinki', '60.171244', '24.931513'); -- FinBIF 'aineistopainotteinen'

INSERT INTO infra.palvelu VALUES(271, 'Maailmanlaajuisen lajitiedon julkaisu- ja hakupalvelu', 'Global Biodiversity Data Publishing and Usage', 'GBIF integroi lajitietoa käyttäen kaikkea käytettävissä olevaa dataa hyödyksi koostaen validoitua aikaan ja paikkaan sidottua lajitietoa. Aineistot sisältävät usein valtavasti muutakin tietoa, mutta kehittyneillä työkaluilla ja GBIF-standardeilla GBIF:n on mahdollista tuottaa aineistoja, jotka sisältävät satoja miljoonia eliölajihavaintoja kautta maailman.', 'GBIF is a research infrastructure for biodiversity data. In general, we integrate data by focusing on the specific elements that tie all this varied and variable information together: evidence that a verified source found a specific organism at a specific time and place. Most data include other details, but by using GBIF.org and its associated standards, tools and web services, we enable people to publish, discover and retrieve thousands of datasets containing hundreds of millions of species occurrences.', NULL, 'http://www.gbif.org/', 11, 'Universitetsparken 15, DK-2100', ' Copenhagen', '55.702781', '12.559663'); -- GBIF 'aineistopainotteinen'

INSERT INTO infra.palvelu VALUES(272, 'EMBL', 'EMBL', 'EMBL tarjoaa palveluita monissa core facility-yksiköissään Heidelbergissa ja tutkimusasemiensa yhteydessä sekä erityisesti bioinformatiikkapalveluita EBI-yksikön toimesta. Erittäin laajat palvelut life science -tutkijoille, yksityiskohtiin voi tutustua alla olevan url-linkin kautta.', 'EMBL core facilities and EBI bioinformatics services. Wide variety of services for life scientists, for details please see url below.', 'http://www.embl.de/services/index.html', 'http://www.embl.de/services/index.html', 13, NULL, NULL, NULL, NULL); -- EMBL  'laitteisto- ja palvelupainotteinen'

INSERT INTO infra.palvelu VALUES(273, NULL, 'Single-cell RNA-Seq with capture instruments', NULL, 'We offer high-throughput single-cell RNA-Seq services. Users will supply cells in suspension, from which single cells are captured. Sequencing libraries with unique molecular identifiers (UMIs) will be prepared. Libraries can then be sequenced on site, using the facilities of FIMM Technology Centre. Later services for STRT RNA-seq and whole transcsript sequencing will also be offered.', NULL, 'https://www.fimm.fi/en/services/technology-centre/single-cell-analytics', 13, 'Tukholmankatu 8', 'Helsinki', '60.191311', '24.903916'); -- SC-infra 'laitteistopainotteinen, palvelupainotteinen'

INSERT INTO infra.palvelu VALUES(274, NULL, 'Single-cell DNA-Seq', NULL, 'We offer medium-throughput services on 384 well plates to generate DNA sequencing libraries from single cells. Single-cell DNA sequencing from thousands of cells is currently not economical, but we will add high throughput single-cell DNA sequencing services (whole genome or whole exome) to our service list as soon as the technologies are mature enough for core lab environment.', NULL, 'https://www.fimm.fi/en/services/technology-centre/single-cell-analytics', 13, 'Tukholmankatu 8', 'Helsinki', '60.191311', '24.903916'); -- SC-infra 'laitteistopainotteinen, palvelupainotteinen'

INSERT INTO infra.palvelu VALUES(275, NULL, 'Targeted sequencing after capture of single cells', NULL, 'For targeted approaches (10Ð130 pre-selected transcripts) we will use a combination of FACS sorting on 384 -plates and Precise assays (Cellular Research).', NULL, 'https://www.fimm.fi/en/services/technology-centre/single-cell-analytics', 13, 'Tukholmankatu 8', 'Helsinki', '60.191311', '24.903916'); -- SC-infra 'laitteistopainotteinen, palvelupainotteinen'

INSERT INTO infra.palvelu VALUES(276, NULL, 'Single-cell capture, transcriptome and epigenome analysis', NULL, 'Our service enables capture and high-throughput characterization of transcriptomes and epigenomes of individual cells. Among the key instrumentation supporting transcriptome analysis is the new Chromium system by 10x Genomics. In a single experiment up to 48 000 cells can be captured and profiled simultaneously by 3''-mRNA-seq. In addition to the Chromium system, custom protocols enabling flexible either simultaneous or separate single cell analysis of transcriptomes and epigenomes of individual cells will be implemented in the unit. ', NULL, 'http://www.btk.fi/functional-genomics/services/functional-single-cell-genomics/', 13, 'Turku Centre for Biotechnology, Tykistökatu 6A, Biocity 5-7th floor', 'Turku', '60.449565', '22.292847'); -- SC-infra 'laitteistopainotteinen, palvelupainotteinen'

INSERT INTO infra.palvelu VALUES(277, NULL, 'Perturbation assays with Fluidigm Polaris', NULL, 'We will offer selection of single cells followed by perturbation of the cell in the Polaris. FACS instruments can be utilized if preselection before Polaris assay is required. In Polaris, selected cells can be challenged with variety of parameters and, for example, drug compounds, grown on selected matrixes, lysed, and reverse transcribed. After the treatment, libraries and sequencing will be performed in the genomics unit (BIDGEN). ', NULL, 'http://www.biocenter.helsinki.fi/bi/dnagen/', 13, 'Viikinkaari 9', 'Helsinki', '60.227098', '25.013952'); -- SC-infra 'laitteistopainotteinen, palvelupainotteinen'

INSERT INTO infra.palvelu VALUES(278, NULL, 'Single-cell RNA-Seq with DropSeq protocol', NULL, 'The DropSeq single cell RNAseq platform based on droplet microfluidics with barcoded beads has been purchased from Dolomite-Bio in May. Users will supply their cells in single cell suspension. We will perform the droplet based cell capture for up to 4000 barcoded cells per each 15 min run. We will optimize library preparation methods from any number of captured cells based on the customer''s request and desired sequencing depth. The libraries can then be prepared and sequenced on site, using the MiSeq/NextSeq service at the Biomedicum Functional Genomics Unit (HiLIFE Genomics Infrastructure) including data pre-processing and Drop-seq data analysis. ', NULL, 'http://www.helsinki.fi/fugu/Products/singlecell.shtml', 13, 'Haartmaninkatu 3', 'Helsinki', '60.190297', '24.909394'); -- SC-infra 'laitteistopainotteinen, palvelupainotteinen'

INSERT INTO infra.palvelu VALUES(279, NULL, 'Custom assays with DropSeq and index sorted plates with STRT', NULL, 'For FACS sorting of cells on indexed plates we will provide customers plates with suitable lysis buffer. In addition to scRNAseq, the subsequent 5'' tagging STRT library method will also be offered as very cost-efficient bulk RNAseq service. In 2017, we plan to upgrade our Dolomite device to allow simultaneous multi-sample capturing and set-up of protocols for high-throughput T- and B-cell receptor pairing. ', NULL, 'http://www.helsinki.fi/fugu/Products/singlecell.shtml', 13, 'Haartmaninkatu 3 ', 'Helsinki', '60.190297', '24.909394'); -- SC-infra 'laitteistopainotteinen, palvelupainotteinen'

-- INSERT INTO infra.palvelu VALUES(280, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 13, NULL, NULL, NULL, NULL, NULL); -- RAMI (ei kuvausta, vain paikkasidonnainen)

INSERT INTO infra.palvelu VALUES(280, 'Kuvantaminen heliumionimikroskoopilla', 'Imaging with helium ion microscope', 'Asiakkaan tuomien näytteiden kuvantaminen heliumionimikroskooppia käyttäen Jyväskylän yliopiston henkilökunnan toimesta Nanotiedekeskuksen puhdastilassa.', 'Imaging of the customer''s samples in the Nanoscience center clean room using helium ion microscope by University of Jyväskylä personnel.', NULL, NULL, 13, 'Survontie 9', 'Jyväskylä','62.228429', '25.738200'); -- HIM 'laitteistopainotteinen, palvelupainotteinen'

INSERT INTO infra.palvelu VALUES(282, 'ESO and FINCA', 'ESO and FINCA', 'ESO:n jäsenmaana tutkijoilla Suomessa on pääsy käyttämään kaikkia maailman huippuluokkaa olevia ESO:n havaintolaitteita. Havaintoaika ESO:n teleskoopeilla on kansainvälisesti hyvin kilpailtua, jonka perusteella vain parhaille, yleensä kansainvälisille yhteistyötutkimusprojekteille myönnetään aikaa. Suomi liittyi Euroopan eteläisen observatorion (ESO) jäseneksi 2004. Vuonna 2010 perustettu Suomen ESO-keskus (FINCA) on kansallinen tutkimuslaitos, joka koordinoi Suomen ESO-toimintaa, tekee yhteistyötä ESO-infrastruktuurin kanssa, harjoittaa ja edesauttaa tähtitieteen tutkimusta, teknologista kehitystyötä ja tutkijakoulutusta, sekä kannustaa ja toteuttaa tähtitieteen alan yhteistyötä Suomessa. ESO-keskus on Suomen tähtitieteen tärkein yhdistävä tekijä, ja siihen osallistuvat kaikki Suomen tähtitieteen tutkimusta harjoittavat yliopistot (Aalto, Helsinki, Oulu ja Turku). ', 'Finland became a member of the European Southern Observatory (ESO) in 2004. FINCA, founded in 2010, is a national research institute, which co-ordinates Finnish ESO-related activity, co-operates with the ESO infrastructure, practises and promotes research in astronomy, technological development, and researcher training, and fosters and implements astronomical co-operation in Finland. FINCA is the major unifying component in Finnish astronomy, supported by all the universities engaged in astronomical research in Finland (Aalto, Helsinki, Oulu and Turku).', 'http://www.utu.fi/fi/yksikot/finca/', 'http://www.utu.fi/en/units/finca/', NULL, NULL, NULL, NULL, NULL); -- ESO

INSERT INTO infra.palvelu VALUES(283, NULL, 'Thermal hydraulics experiment platform', NULL, 'NextGenTH provides a flexible platform for thermal hydraulics experiments that (1) demonstrate capabilities and characteristics behaviours of nuclear heat transport systems, in normal an abnormal operating conditions, stationary and dynamic, (2) verify the operational characteristic of components, such as passive heat exchangers or fluidic devices, that are envisioned for future nuclear reactor safety systems, or upgrades of present reactors, and (3) accurate dynamic measurement of 2D or 3D flow fields and local heat transfer in water-steam systems. ', NULL, NULL, 13, 'Skinnarilankatu 34', 'Lappeenranta', '61.065044', '28.092461'); -- NextGenTH  'palvelupainoitteinen, laitteistopainoitteinen',

-- INSERT INTO infra.palvelu VALUES(283, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL); -- CERN
--
-- INSERT INTO infra.palvelu VALUES(284, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL); -- FAIR

INSERT INTO infra.palvelu VALUES(284, 'Havaintoaika teleskoopille', 'Guidelines for applying observation time', 'Havaintoajan hakuohjeet', 'Guidelines for applying observation time', NULL, 'http://www.not.iac.es/observing/proposals/', 13, 'Rambla José Ana Fernández Pérez 7, local 5', 'E-38711 Breña Baja', '28.646290', '-17.769061'); -- NOT  'laitteistopainoitteinen'

INSERT INTO infra.palvelu VALUES(285, 'Pohjoismainen Tier 1', 'Nordic Tier-1', 'NeIC koordinoi kuuteen pohjoismaiseen keskukseen hajautetun CERNin datan säilöntään, hallintaan ja analysointiin tarvittavan Tier-1 keskuksen operointia. Tier-1 laskenta ja tallennus järjestelmät on kansallisesti rahoitettuja, eivät NeICn omistamia.', 'The first seeds of Nordic e-infrastructure collaboration date back to 2003 when the national research councils of Denmark, Finland, Norway and Sweden agreed to offer a shared Tier-1 facility to meet CERN''s demands for computing and storage of LHC outputs. The agreement was fundamental because no single Nordic country would have been large enough to offer a separate Tier-1 on its own. By coming together, four Nordic countries could participate in the world''s largest computing grid to handle LHC data outputs as implied by, but not included in, their membership fees. A legacy of the agreement between the research councils is that NeIC does not own the Tier-1 computing and storage hardware. Rather, hardware is funded nationally, integrated INTO infra.six computing centres and its operation is coordinated by NeIC.', 'https://neic.nordforsk.org/', 'https://neic.nordforsk.org/', 11, NULL, NULL, NULL, NULL); -- NeIC

INSERT INTO infra.palvelu VALUES(286, 'Yhteispohjoismaisten e-infrastruktuuri palveluiden kehityshankkeiden koordinointi', 'Coordination of join Nordic e-infrastructure service development projects', 'NeIC koordinoi useita yhteispohjoismaisia e-infrastruktuuri palveluiden kehitys hankkeita. Tällä hetkellä käynnissä ovat Pohjoismainen sensitiivisen datan e-infrastruktuuri (Tryggve), Pohjoismainen pilvilaskennan yhteistyö (Glenna), Pohjoismainen tieteellisten ohjelmistojen kehityksen infrastruktuuri (code refinery) ja Pohjoismaisen resurssin vaihdannan (Dellinger) kehitysprojektit.', 'NeIC coordinates several e-infrastructure service development projects with joint Nordic interest. Currently active projects are Nordic e-infrastructure for Sensitive data (Tryggve), Nordic cloud collaboration (Glenna), Nordic e-infrastructure for scientific software (code refinery), and Nordic sharing and exchange of e-infrastructure resources (Dellinger).', 'https://neic.nordforsk.org/', 'https://neic.nordforsk.org/', 11, NULL, NULL, NULL, NULL); -- NeIC



INSERT INTO infra.palvelutyyppi VALUES(1,1);  -- aineisto
INSERT INTO infra.palvelutyyppi VALUES(2,2);  -- palvelu
INSERT INTO infra.palvelutyyppi VALUES(3,3);  -- laitteisto


/*
table_data_infra_palvelut.sql

INFRA_PALVELUT-TAULU: yhdistää infran ja palvelut toisiinsa
INSERT INTO infra.infra_palvelut VALUES(INFRA_ID,PALVELU_ID);  -- comment
INFRA_ID - BIGINT(20): juokseva numero, kannan sisäinen, uniikki, linkki infra-tauluun
PALVELU_ID - BIGINT(20): juokseva numero, kannan sisäinen, uniikki, linkki palvelu-tauluun
*/
INSERT INTO infra.infra_palvelut VALUES(1,1);  -- ESS
INSERT INTO infra.infra_palvelut VALUES(1,2);  -- ESS
INSERT INTO infra.infra_palvelut VALUES(1,3);  -- ESS
INSERT INTO infra.infra_palvelut VALUES(1,4);  -- ESS
INSERT INTO infra.infra_palvelut VALUES(1,5);  -- ESS

INSERT INTO infra.infra_palvelut VALUES(2,6);  -- FIN-CLARIN - Kielipankki
INSERT INTO infra.infra_palvelut VALUES(2,7);  -- FIN-CLARIN

INSERT INTO infra.infra_palvelut VALUES(3,8);  -- FinELib

INSERT INTO infra.infra_palvelut VALUES(4,9);  -- Finna
INSERT INTO infra.infra_palvelut VALUES(4,243);  -- Finna

INSERT INTO infra.infra_palvelut VALUES(5,10);  -- FMAS
INSERT INTO infra.infra_palvelut VALUES(5,11);  -- FMAS
INSERT INTO infra.infra_palvelut VALUES(5,12);  -- FMAS
INSERT INTO infra.infra_palvelut VALUES(5,13);  -- FMAS

INSERT INTO infra.infra_palvelut VALUES(6,14);  -- FSD&CESSDA - Aila
INSERT INTO infra.infra_palvelut VALUES(6,15);  -- FSD&CESSDA
INSERT INTO infra.infra_palvelut VALUES(6,16);  -- FSD&CESSDA
INSERT INTO infra.infra_palvelut VALUES(6,17);  -- FSD&CESSDA
INSERT INTO infra.infra_palvelut VALUES(6,18);  -- FSD&CESSDA

-- INSERT INTO infra.infra_palvelut VALUES(7,19);  -- ATT & KDK-PAS -palvelulistaus
-- INSERT INTO infra.infra_palvelut VALUES(7,14);  -- ATT & KDK-PAS - Aila
INSERT INTO infra.infra_palvelut VALUES(7,20);  -- ATT & KDK-PAS - AVAA
INSERT INTO infra.infra_palvelut VALUES(7,21);  -- ATT & KDK-PAS - Etsin
-- INSERT INTO infra.infra_palvelut VALUES(7,22);  -- ATT & KDK-PAS - Finto
INSERT INTO infra.infra_palvelut VALUES(7,23);  -- ATT & KDK-PAS - IDA
INSERT INTO infra.infra_palvelut VALUES(7,24);  -- ATT & KDK-PAS - REMS
-- INSERT INTO infra.infra_palvelut VALUES(7,25);  -- ATT & KDK-PAS - Theseus
-- INSERT INTO infra.infra_palvelut VALUES(7,6);  -- ATT & KDK-PAS - Kielipankki
-- INSERT INTO infra.infra_palvelut VALUES(7,26);  -- ATT & KDK-PAS - TUPA
-- INSERT INTO infra.infra_palvelut VALUES(7,27);  -- ATT & KDK-PAS - Tutkimus-PAS
-- INSERT INTO infra.infra_palvelut VALUES(7,28);  -- ATT & KDK-PAS - Tuuli
INSERT INTO infra.infra_palvelut VALUES(7,29);  -- ATT & KDK-PAS -KDK-PAS

INSERT INTO infra.infra_palvelut VALUES(8,30);  -- EISCAT_3D
INSERT INTO infra.infra_palvelut VALUES(8,31);  -- EISCAT_3D
INSERT INTO infra.infra_palvelut VALUES(8,32);  -- EISCAT_3D
INSERT INTO infra.infra_palvelut VALUES(8,33);  -- EISCAT_3D
INSERT INTO infra.infra_palvelut VALUES(8,34);  -- EISCAT_3D
INSERT INTO infra.infra_palvelut VALUES(8,35);  -- EISCAT_3D
INSERT INTO infra.infra_palvelut VALUES(8,36);  -- EISCAT_3D

INSERT INTO infra.infra_palvelut VALUES(9,37);  -- EPOS

INSERT INTO infra.infra_palvelut VALUES(10,38);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,39);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,40);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,41);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,42);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,43);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,44);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,45);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,46);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,47);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,48);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,49);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,50);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,51);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,52);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,53);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,54);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,55);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,56);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,57);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,58);  -- FINMARI
INSERT INTO infra.infra_palvelut VALUES(10,59);  -- FINMARI

INSERT INTO infra.infra_palvelut VALUES(11,60);  -- ICOS
INSERT INTO infra.infra_palvelut VALUES(11,61);  -- ICOS
INSERT INTO infra.infra_palvelut VALUES(11,62);  -- ICOS
INSERT INTO infra.infra_palvelut VALUES(11,63);  -- ICOS
INSERT INTO infra.infra_palvelut VALUES(11,64);  -- ICOS
INSERT INTO infra.infra_palvelut VALUES(11,65);  -- ICOS
INSERT INTO infra.infra_palvelut VALUES(11,66);  -- ICOS
INSERT INTO infra.infra_palvelut VALUES(11,67);  -- ICOS
INSERT INTO infra.infra_palvelut VALUES(11,68);  -- ICOS
INSERT INTO infra.infra_palvelut VALUES(11,69);  -- ICOS
INSERT INTO infra.infra_palvelut VALUES(11,70);  -- ICOS

INSERT INTO infra.infra_palvelut VALUES(12,71);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,72);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,73);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,74);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,75);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,76);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,77);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,78);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,176);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,177);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,178);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,179);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,180);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,181);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,182);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,183);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,184);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,185);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,186);  -- INAR RI
INSERT INTO infra.infra_palvelut VALUES(12,187);  -- INAR RI

-- OGIIR - ei saatavilla olevia tietoja palveluista

INSERT INTO infra.infra_palvelut VALUES(14,244);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,245);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,246);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,247);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,248);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,249);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,250);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,251);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,252);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,253);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,254);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,255);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,256);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,257);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,258);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,259);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,260);  -- BBMRI.fi,
INSERT INTO infra.infra_palvelut VALUES(14,261);  -- BBMRI.fi,

INSERT INTO infra.infra_palvelut VALUES(15,89);  -- Biokeskus Suomi
INSERT INTO infra.infra_palvelut VALUES(15,90);  -- Biokeskus Suomi
INSERT INTO infra.infra_palvelut VALUES(15,91);  -- Biokeskus Suomi
INSERT INTO infra.infra_palvelut VALUES(15,92);  -- Biokeskus Suomi
INSERT INTO infra.infra_palvelut VALUES(15,93);  -- Biokeskus Suomi
INSERT INTO infra.infra_palvelut VALUES(15,94);  -- Biokeskus Suomi
INSERT INTO infra.infra_palvelut VALUES(15,95);  -- Biokeskus Suomi
INSERT INTO infra.infra_palvelut VALUES(15,96);  -- Biokeskus Suomi
INSERT INTO infra.infra_palvelut VALUES(15,97);  -- Biokeskus Suomi

INSERT INTO infra.infra_palvelut VALUES(16,98);  -- EATRIS
INSERT INTO infra.infra_palvelut VALUES(16,99);  -- EATRIS
INSERT INTO infra.infra_palvelut VALUES(16,100);  -- EATRIS
INSERT INTO infra.infra_palvelut VALUES(16,101);  -- EATRIS
INSERT INTO infra.infra_palvelut VALUES(16,102);  -- EATRIS
INSERT INTO infra.infra_palvelut VALUES(16,103);  -- EATRIS

INSERT INTO infra.infra_palvelut VALUES(17,205);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,206);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,207);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,208);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,209);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,210);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,211);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,212);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,213);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,214);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,215);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,216);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,217);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,218);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,219);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,220);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,221);  -- ELIXIR (Suomi)
-- INSERT INTO infra.infra_palvelut VALUES(17,222);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,223);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,224);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,225);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,226);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,227);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,228);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,229);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,230);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,231);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,232);  -- ELIXIR (Suomi)
-- INSERT INTO infra.infra_palvelut VALUES(17,233);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,234);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,235);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,236);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,237);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,238);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,239);  -- ELIXIR (Suomi)
INSERT INTO infra.infra_palvelut VALUES(17,240);  -- ELIXIR (Suomi)

INSERT INTO infra.infra_palvelut VALUES(18,119);  -- EuBI
INSERT INTO infra.infra_palvelut VALUES(18,120);  -- EuBI
INSERT INTO infra.infra_palvelut VALUES(18,121);  -- EuBI
INSERT INTO infra.infra_palvelut VALUES(18,122);  -- EuBI
INSERT INTO infra.infra_palvelut VALUES(18,123);  -- EuBI
-- INSERT INTO infra.infra_palvelut VALUES(18,124);  -- EuBI
INSERT INTO infra.infra_palvelut VALUES(18,125);  -- EuBI

INSERT INTO infra.infra_palvelut VALUES(19,126);  -- EU-OPENSCREEN
INSERT INTO infra.infra_palvelut VALUES(19,127);  -- EU-OPENSCREEN
INSERT INTO infra.infra_palvelut VALUES(19,128);  -- EU-OPENSCREEN

-- INSERT INTO infra.infra_palvelut VALUES(20,129);  -- INFRAFRONTIER
-- INSERT INTO infra.infra_palvelut VALUES(20,130);  -- INFRAFRONTIER
-- INSERT INTO infra.infra_palvelut VALUES(20,131);  -- INFRAFRONTIER
-- INSERT INTO infra.infra_palvelut VALUES(20,132);  -- INFRAFRONTIER
INSERT INTO infra.infra_palvelut VALUES(20,133);  -- INFRAFRONTIER
INSERT INTO infra.infra_palvelut VALUES(20,134);  -- INFRAFRONTIER
-- INSERT INTO infra.infra_palvelut VALUES(20,135);  -- INFRAFRONTIER
INSERT INTO infra.infra_palvelut VALUES(20,136);  -- INFRAFRONTIER

INSERT INTO infra.infra_palvelut VALUES(21,137);  -- Instruct
INSERT INTO infra.infra_palvelut VALUES(21,138);  -- Instruct
INSERT INTO infra.infra_palvelut VALUES(21,139);  -- Instruct
INSERT INTO infra.infra_palvelut VALUES(21,140);  -- Instruct

INSERT INTO infra.infra_palvelut VALUES(22,141);  -- NaPPI

INSERT INTO infra.infra_palvelut VALUES(23,142);  -- NVVL

INSERT INTO infra.infra_palvelut VALUES(24,143);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,144);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,145);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,146);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,147);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,148);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,149);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,190);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,191);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,192);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,193);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,194);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,195);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,196);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,197);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,198);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,199);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,200);  -- MAX IV
INSERT INTO infra.infra_palvelut VALUES(24,201);  -- MAX IV

INSERT INTO infra.infra_palvelut VALUES(25,150);  -- OMN
INSERT INTO infra.infra_palvelut VALUES(25,151);  -- OMN
INSERT INTO infra.infra_palvelut VALUES(25,152);  -- OMN
INSERT INTO infra.infra_palvelut VALUES(25,153);  -- OMN
INSERT INTO infra.infra_palvelut VALUES(25,154);  -- OMN
INSERT INTO infra.infra_palvelut VALUES(25,155);  -- OMN
-- INSERT INTO infra.infra_palvelut VALUES(25,156);  -- OMN
-- INSERT INTO infra.infra_palvelut VALUES(25,157);  -- OMN
-- INSERT INTO infra.infra_palvelut VALUES(25,158);  -- OMN
-- INSERT INTO infra.infra_palvelut VALUES(25,159);  -- OMN

INSERT INTO infra.infra_palvelut VALUES(26,160);  -- XBI&XFEL

INSERT INTO infra.infra_palvelut VALUES(27,161);  -- BIOECONOMY
INSERT INTO infra.infra_palvelut VALUES(27,162);  -- BIOECONOMY
INSERT INTO infra.infra_palvelut VALUES(27,163);  -- BIOECONOMY

INSERT INTO infra.infra_palvelut VALUES(28,164);  -- CTA

-- INSERT INTO infra.infra_palvelut VALUES(29,165);  -- Euclid
INSERT INTO infra.infra_palvelut VALUES(29,241);  -- Euclid
INSERT INTO infra.infra_palvelut VALUES(29,242);  -- Euclid

INSERT INTO infra.infra_palvelut VALUES(30,166);  -- JYFL-ACCLAB
INSERT INTO infra.infra_palvelut VALUES(30,167);  -- JYFL-ACCLAB
INSERT INTO infra.infra_palvelut VALUES(30,168);  -- JYFL-ACCLAB
INSERT INTO infra.infra_palvelut VALUES(30,169);  -- JYFL-ACCLAB
INSERT INTO infra.infra_palvelut VALUES(30,170);  -- JYFL-ACCLAB

INSERT INTO infra.infra_palvelut VALUES(31,202);  -- CSC RI
INSERT INTO infra.infra_palvelut VALUES(31,203);  -- CSC RI
INSERT INTO infra.infra_palvelut VALUES(31,204);  -- CSC RI

INSERT INTO infra.infra_palvelut VALUES(32,173);  -- PRACE
INSERT INTO infra.infra_palvelut VALUES(32,174);  -- PRACE

INSERT INTO infra.infra_palvelut VALUES(33,175);  -- FGCI

-- INSERT INTO infra.infra_palvelut VALUES(INFRA_ID,PALVELU_ID);  -- comment

INSERT INTO infra.infra_palvelut VALUES (34, 262); -- ESRF" INSERT INTO infra.infra_palvelut VALUES (35, 263); -- IODP" INSERT INTO infra.infra_palvelut VALUES (35, 264); -- IODP" INSERT INTO infra.infra_palvelut VALUES (35, 265); -- IODP"
INSERT INTO infra.infra_palvelut VALUES (35, 263); -- IODP
INSERT INTO infra.infra_palvelut VALUES (35, 264); -- ECORD
INSERT INTO infra.infra_palvelut VALUES (35, 265); -- IODP in Finland
INSERT INTO infra.infra_palvelut VALUES (36, 266); -- FinBIF"
INSERT INTO infra.infra_palvelut VALUES (36, 267); -- FinBIF"
INSERT INTO infra.infra_palvelut VALUES (36, 268); -- FinBIF"
INSERT INTO infra.infra_palvelut VALUES (36, 269); -- FinBIF"
INSERT INTO infra.infra_palvelut VALUES (36, 270); -- FinBIF"
INSERT INTO infra.infra_palvelut VALUES (37, 271); -- GBIF"
INSERT INTO infra.infra_palvelut VALUES (38, 272); -- EMBL"
INSERT INTO infra.infra_palvelut VALUES (39, 273); -- SC-infra"
INSERT INTO infra.infra_palvelut VALUES (39, 274); -- SC-infra"
INSERT INTO infra.infra_palvelut VALUES (39, 275); -- SC-infra"
INSERT INTO infra.infra_palvelut VALUES (39, 276); -- SC-infra"
INSERT INTO infra.infra_palvelut VALUES (39, 277); -- SC-infra"
INSERT INTO infra.infra_palvelut VALUES (39, 278); -- SC-infra"
INSERT INTO infra.infra_palvelut VALUES (39, 279); -- SC-infra"
INSERT INTO infra.infra_palvelut VALUES (42, 280); -- HIM"
INSERT INTO infra.infra_palvelut VALUES (43, 282); -- ESO"
INSERT INTO infra.infra_palvelut VALUES (44, 283); -- NextGenTH"
INSERT INTO infra.infra_palvelut VALUES (47, 284); -- NOT"
INSERT INTO infra.infra_palvelut VALUES (48, 285); -- NeIC"
INSERT INTO infra.infra_palvelut VALUES (48, 286); -- NeIC"


/*
table_data_infra_vastuuorganisaatiot.sql

INFRA_VASTUUORGANISAATIOT-TAULU: yhdistää infran ja vastuuorganisaation toisiinsa
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(INFRA_ID,ORGANISAATIO_ID);  -- comment
INFRA_ID - BIGINT(20): juokseva numero, kannan sisäinen, uniikki, linkki infra-tauluun
ORGANISAATIO_ID - BIGINT(20): juokseva numero, kannan sisäinen, uniikki, linkki organisaatio-tauluun
HUOM! Yksittäisen infran kohdalla vastuuorganisaatioista vain alimman tason organisaatioon viitataan, ja organisaatioiden oma "emo-organisaatio"-tietue kertoo ketjun loppuosan
  Esim. ei erillistä viittausta Turun yliopistoon, jos Yhteiskuntatieteellinen tiedekunta on jo viitattu, ja sillä "emo-organisaatio"-linkki UTUun.
*/

-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(1,1);  -- ESS, UTU, poistettu redundanttina
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(1,2);  -- ESS, UTU-Yhteiskuntatieteellinen tdk
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(1,3);  -- ESS, UK-ESFRI-isäntämaa

-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(2,4);  -- FIN-CLARIN, HY, poistettu redundanttina
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(2,5);  -- FIN-CLARIN, HY-nykykielten laitos
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(2,61);  -- FIN-CLARIN, CLARIN-ERIC, ESFRI-isäntä
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(2,6);  -- FIN-CLARIN, Alankomaat-ESFRI-isäntämaa

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(3,7);  -- FinElib, Kansalliskirjasto
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(3,4);  -- FinElib, HY

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(4,7);  -- Finna, Kansalliskirjasto
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(4,4);  -- Finna, HY

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(5,40);  -- FMAS, Kansallisarkisto
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(5,8);  -- FMAS, tilastokeskus

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(6,10);  -- FSD&CESSDA, yhteiskuntatieteellinen tietoarkisto
-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(6,9);  -- FSD&CESSDA, UTA, poistettu redundanttina
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(6,11);  -- FSD&CESSDA, Norja-esfri-isäntämaa

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(7,12);  -- TTA&KDK-PAS, CSC

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(8,14);  -- EISCAT_3D, sodankylän geofysiikan labra
-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(8,13);  -- EISCAT_3D, OY, poistettu redundanttina
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(8,15);  -- EISCAT_3D, Ruotsi-esfri-isäntämaa

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(9,16);  -- FIN-EPOS, seismologian instituutti
-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(9,4);  -- FIN-EPOS, HY, poistettu redundanttina
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(9,17);  -- FIN-EPOS, ITalia-esfri-isäntämaa

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(10,41);  -- FINMARI, suomen ympäristökeskus
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(10,18);  -- FINMARI, ilmatieteen laitos
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(10,54);  -- FINMARI, geologian tutkimuskeskus
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(10,55);  -- FINMARI, luonnonvarakeskus
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(10,56);  -- FINMARI, tvärminnen eläintiet.
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(10,57);  -- FINMARI, saaristomeren tutkim.
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(10,58);  -- FINMARI, husö biologiska
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(10,59);  -- FINMARI, EMBRC
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(10,60);  -- FINMARI, euro-argo
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(10,37);  -- FINMARI, Ranska, esfri-isäntämaa

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(11,4);  -- ICOS, HY
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(11,18);  -- ICOS, ilmatieteen laitos
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(11,19);  -- ICOS, itä-suomen yliopisto
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(11,20);  -- ICOS, suomi-esfri-isäntämaa

-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(12,4);  -- INAR, HY, poistettu redundanttina
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(12,21);  -- INAR, HY mat-luonn.tiet-tdk

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(13,66);  -- oGIIR, paikkatietokeskus - maanmittauslaitos
-- id 22 maanmittauslaitos, redundantti
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(13,67);  -- oGIIR, maantieteen ja geologian laitos - turun yo
-- id 1, turun yliopisto, redundantti
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(13,68);  -- oGIIR, maankäyttötieteiden laitos - aalto yliopisto
-- id 33, aalto yliopisto, redundantti
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(13,12);  -- oGIIR, CSC
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(13,41);  -- oGIIR, suomen ympäristökeskus
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(13,55);  -- oGIIR, luonnonvarakeskus

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(14,23);  -- BBMRI, THL
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(14,69);  -- BBMRI, BBMRI-ERIC (itävalta)
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(14,24);  -- BBMRI, Itävalta-esfri-isäntämaa

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(15,4);  -- biokeskus, HY

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(16,25);  -- EATRIS, FIMM
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(16,4);  -- EATRIS, HY
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(16,6);  -- EATRIS, Alankomaat-esfri-isäntämaa

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(17,49);  -- ELIXIR, UK-esfri-isäntäorg
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(17,12);  -- ELXIR, CSC
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(17,3);  -- ELIXIR, UK-esfri-isäntämaa

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(18,26);  -- eubi, ÅA
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(18,1);  -- eubi, UTU
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(18,50);  -- eubi, Turku bioimaging
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(18,51);  -- eubi, suomi, hubin ERIC statutory seat
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(18,20);  -- eubi, suomi, esfri-isäntämaa
-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(18,27);  -- eubi, Saksa-esfri-isäntämaa

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(19,25);  -- EU-OPENSCREEN, FIMM
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(19,4);  -- EU-OPENSCREEN, HY
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(19,27);  -- EU-OPENSCREEN, Saksa-esfri-isäntämaa

-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(20,13);  -- INFRAFRONTIER, OY, poistettu redundanttina
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(20,63);  -- INFRAFRONTIER, biocenter oulu
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(20,62);  -- INFRAFRONTIER, gmbh, esfri-isäntä
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(20,27);  -- INFRAFRONTIER, saksa-esfri-isäntämaa

-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(21,28);  -- Instruct, bio- jaympäristötiet.tdk, poistettu redundanttina
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(21,46);  -- Instruct, biotieteiden laitos
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(21,29);  -- Instruct, biotekn. instituutti
-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(21,4);  -- INSTRUCT, HY, poistettu redundanttina
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(21,48);  -- Isntruct, div.struct.biol., oxford, esfri-isäntä
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(21,3);  -- Isntruct, UK-esfri-isäntämaa

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(22,28);  -- NaPPI, bio- ja ympäristötiet.tdk
-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(22,4);  -- NaPPI, HY, poistettu redundanttina

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(23,30);  -- NVVL, AIV-instituutti
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(23,31);  -- NVVL, biokeskus kuopio
-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(23,19);  -- NVVL, itäsuomen yliopisto, poistettu redundanttina

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(24,32);  -- MAX-IV, Lundin yo
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(24,13);  -- MAX-IV, Oulun yliopisto
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(24,15);  -- MAX-IV, Ruotsi-esfri-isäntämaa

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(25,33);  -- OMN/OtaNano, Aalto-ylopisto
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(25,44);  -- OMN/OtaNano, Aalto-ylopisto

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(26,13);  -- XFEL&XBI, OY
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(26,52);  -- XFEL&XBI, XFEL gmbh
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(26,27);  -- XFEL&XBI, Saksa-esfri-isäntämaa

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(27,34);  -- BIOECONOMY, biotekn.&kem.tek.laitos
-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(27,33);  -- BIOECONOMY, aaltoYO, poistettu redundanttina

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(28,35);  -- CTA, fys. ja tähtitiet. laitos
-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(28,1);  -- CTA, UTU, poistettu redundanttina
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(28,27);  -- CTA, saksa-esfri-isäntä

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(29,36);  -- Euclid, Fys.laitos
-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(29,4);  -- Euclid, HY, poistettu redundanttina
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(29,37);  -- Euclid, Ranska-esfri-isäntämaa

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(30,38);  -- JYFL-ACCLAB, fys.laitos/JYU
-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(30,42);  -- JYFL-ACCLAB, jyU

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(31,12);  -- CSC RI

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(32,12);  -- PRACE, CSC
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(32,64);  -- PRACE, prace aisbl
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(32,39);  -- PRACE, Belgia

INSERT INTO infra.infra_vastuuorganisaatiot VALUES(33,36);  -- FGCI, Fys.latios/HY
INSERT INTO infra.infra_vastuuorganisaatiot VALUES(33,33);  -- FGCI, Aalto
-- INSERT INTO infra.infra_vastuuorganisaatiot VALUES(33,4);  -- FGCI, HY, poistettu redundanttina

INSERT INTO infra.infra_vastuuorganisaatiot VALUES (34, 37); -- ESRF"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (35, 72); -- IODP"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (35, 73); -- IODP"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (35, 74); -- IODP"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (36, 75); -- FinBIF"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (36, 4); -- FinBIF"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (37, 75); -- GBIF
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (37, 103); -- GBIF
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (37, 4); -- GBIF
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (37, 100); -- GBIF
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (38, 76); -- EMBL"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (38, 77); -- EMBL"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (38, 78); -- EMBL"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (38, 79); -- EMBL"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (38, 80); -- EMBL"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (38, 27); -- EMBL"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (39, 81); -- SC-infra"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (39, 82); -- SC-infra"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (39, 83); -- SC-infra"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (39, 84); -- SC-infra"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (41, 33); -- RAMI
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (41, 44); -- RAMI
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (41, 54); -- RAMI
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (42, 85); -- HIM"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (42, 86); -- HIM"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (42, 38); -- HIM
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (43, 87); -- ESO"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (43, 1); -- ESO"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (43, 27); -- ESO"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (44, 88); -- NextGenTH"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (44, 89); -- NextGenTH"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (44, 20); -- NextGenTH"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (45, 36); -- CERN"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (46, 36); -- FAIR"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (47, 71); -- NOT"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (47, 101); -- NOT"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (48, 12); -- NeIC"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (48, 11); -- NeIC"
INSERT INTO infra.infra_vastuuorganisaatiot VALUES (48, 102); -- NeIC"


/*
table_data_infra_yhteystiedot.sql

INFRA_YHTEYSTIEDOT-TAULU: yhdistää infran ja yhteystiedon toisiinsa
INSERT INTO infra.infra_yhteystiedot VALUES(INFRA_ID,YHTEYSTIETO_ID);  -- comment
INFRA_ID - BIGINT(20): juokseva numero, kannan sisäinen, uniikki, linkki infra-tauluun
YHTEYSTIETO_ID - BIGINT(20): juokseva numero, kannan sisäinen, uniikki, linkki yhteystieto-tauluun
*/
INSERT INTO infra.infra_yhteystiedot VALUES(1,1);  -- ESS
INSERT INTO infra.infra_yhteystiedot VALUES(2,2);  -- FIN-CLARIN
INSERT INTO infra.infra_yhteystiedot VALUES(2,65);  -- FIN-CLARIN
INSERT INTO infra.infra_yhteystiedot VALUES(2,66);  -- FIN-CLARIN
INSERT INTO infra.infra_yhteystiedot VALUES(3,3);  -- FinElib
INSERT INTO infra.infra_yhteystiedot VALUES(3,67);  -- FinElib
INSERT INTO infra.infra_yhteystiedot VALUES(4,4);  -- Finna
INSERT INTO infra.infra_yhteystiedot VALUES(4,67);  -- Finna
INSERT INTO infra.infra_yhteystiedot VALUES(5,6);  -- FMAS
INSERT INTO infra.infra_yhteystiedot VALUES(6,7);  -- FSD, CESSDA

INSERT INTO infra.infra_yhteystiedot VALUES(7,8);  -- ATT&KDK-PAS
INSERT INTO infra.infra_yhteystiedot VALUES(7,9);  -- ATT&KDK-PAS
INSERT INTO infra.infra_yhteystiedot VALUES(7,10);  -- TTA&KDK-PAS
-- INSERT INTO infra.infra_yhteystiedot VALUES(7,11);  -- ATT&KDK-PAS

INSERT INTO infra.infra_yhteystiedot VALUES(8,12);  -- EISCAT
INSERT INTO infra.infra_yhteystiedot VALUES(8,13);  -- EISCAT
INSERT INTO infra.infra_yhteystiedot VALUES(8,57);  -- EISCAT
INSERT INTO infra.infra_yhteystiedot VALUES(9,14);  -- EPOS
INSERT INTO infra.infra_yhteystiedot VALUES(9,69);  -- EPOS
INSERT INTO infra.infra_yhteystiedot VALUES(10,15);  -- FINMARI
-- INSERT INTO infra.infra_yhteystiedot VALUES(34,15);  -- FINMARI-EUROARGO
-- INSERT INTO infra.infra_yhteystiedot VALUES(35,15);  -- FINMARI-EMBRC

INSERT INTO infra.infra_yhteystiedot VALUES(11,16);  -- ICOS
INSERT INTO infra.infra_yhteystiedot VALUES(11,17);  -- ICOS
INSERT INTO infra.infra_yhteystiedot VALUES(11,18);  -- ICOS

INSERT INTO infra.infra_yhteystiedot VALUES(12,19);  -- INAR

INSERT INTO infra.infra_yhteystiedot VALUES(13,74);  -- oGIIR
INSERT INTO infra.infra_yhteystiedot VALUES(13,75);  -- oGIIR

INSERT INTO infra.infra_yhteystiedot VALUES(14,20);  -- BBMRI
INSERT INTO infra.infra_yhteystiedot VALUES(14,76);  -- BBMRI
INSERT INTO infra.infra_yhteystiedot VALUES(14,77);  -- BBMRI
INSERT INTO infra.infra_yhteystiedot VALUES(14,78);  -- BBMRI

INSERT INTO infra.infra_yhteystiedot VALUES(15,21);  -- biokeskus
INSERT INTO infra.infra_yhteystiedot VALUES(15,22);  -- biokeskus
INSERT INTO infra.infra_yhteystiedot VALUES(16,23);  -- EATRIS
INSERT INTO infra.infra_yhteystiedot VALUES(16,24);  -- EATRIS

INSERT INTO infra.infra_yhteystiedot VALUES(17,25);  -- ELIXIR
INSERT INTO infra.infra_yhteystiedot VALUES(17,72);  -- ELIXIR

INSERT INTO infra.infra_yhteystiedot VALUES(18,26);  -- EuBI
INSERT INTO infra.infra_yhteystiedot VALUES(18,27);  -- EuBI
INSERT INTO infra.infra_yhteystiedot VALUES(18,28);  -- EuBI

INSERT INTO infra.infra_yhteystiedot VALUES(19,29);  -- EU-OPENSCREEN
INSERT INTO infra.infra_yhteystiedot VALUES(19,30);  -- EU-OPENSCREEN
INSERT INTO infra.infra_yhteystiedot VALUES(19,31);  -- EU-OPENSCREEN
INSERT INTO infra.infra_yhteystiedot VALUES(19,32);  -- EU-OPENSCREEN
INSERT INTO infra.infra_yhteystiedot VALUES(19,33);  -- EU-OPENSCREEN

INSERT INTO infra.infra_yhteystiedot VALUES(20,35);  -- INFRAFRONTIER
INSERT INTO infra.infra_yhteystiedot VALUES(20,36);  -- INFRAFRONTIER

INSERT INTO infra.infra_yhteystiedot VALUES(21,37);  -- Instruct
INSERT INTO infra.infra_yhteystiedot VALUES(21,38);  -- Instruct
INSERT INTO infra.infra_yhteystiedot VALUES(21,39);  -- Instruct
INSERT INTO infra.infra_yhteystiedot VALUES(21,40);  -- Instruct
-- INSERT INTO infra.infra_yhteystiedot VALUES(21,58);  -- Instruct

INSERT INTO infra.infra_yhteystiedot VALUES(22,41);  -- NaPPI
INSERT INTO infra.infra_yhteystiedot VALUES(23,42);  -- NVVL

INSERT INTO infra.infra_yhteystiedot VALUES(24,43);  -- MAX IV
-- INSERT INTO infra.infra_yhteystiedot VALUES(24,59);  -- MAX IV
-- INSERT INTO infra.infra_yhteystiedot VALUES(24,60);  -- MAX IV

INSERT INTO infra.infra_yhteystiedot VALUES(25,44);  -- OMN/OtaNano
INSERT INTO infra.infra_yhteystiedot VALUES(25,45);  -- OMN/OtaNano
INSERT INTO infra.infra_yhteystiedot VALUES(25,46);  -- OMN/OtaNano
INSERT INTO infra.infra_yhteystiedot VALUES(25,47);  -- OMN/OtaNano
INSERT INTO infra.infra_yhteystiedot VALUES(25,71);  -- OMN/OtaNano

INSERT INTO infra.infra_yhteystiedot VALUES(26,48);  -- XFEL&XBI
INSERT INTO infra.infra_yhteystiedot VALUES(26,73);  -- XFEL&XBI

INSERT INTO infra.infra_yhteystiedot VALUES(27,49);  -- BIOECONOMY
INSERT INTO infra.infra_yhteystiedot VALUES(27,50);  -- BIOECONOMY
INSERT INTO infra.infra_yhteystiedot VALUES(27,51);  -- BIOECONOMY

INSERT INTO infra.infra_yhteystiedot VALUES(28,52);  -- CTA
INSERT INTO infra.infra_yhteystiedot VALUES(28,70);  -- CTA

INSERT INTO infra.infra_yhteystiedot VALUES(29,53);  -- Euclid

INSERT INTO infra.infra_yhteystiedot VALUES(30,54);  -- JYFL-ACCLAB
-- INSERT INTO infra.infra_yhteystiedot VALUES(30,61);  -- JYFL-ACCLAB
-- INSERT INTO infra.infra_yhteystiedot VALUES(30,62);  -- JYFL-ACCLAB

INSERT INTO infra.infra_yhteystiedot VALUES(31,55);  -- CSC RI
INSERT INTO infra.infra_yhteystiedot VALUES(31,63);  -- CSC RI

INSERT INTO infra.infra_yhteystiedot VALUES(32,56);  -- PRACE
INSERT INTO infra.infra_yhteystiedot VALUES(32,64);  -- PRACE
INSERT INTO infra.infra_yhteystiedot VALUES(32,79);  -- PRACE

INSERT INTO infra.infra_yhteystiedot VALUES(33,68);  -- FGCI

INSERT INTO infra.infra_yhteystiedot VALUES (34, 80); -- ESRF"
INSERT INTO infra.infra_yhteystiedot VALUES (34, 81); -- ESRF"
INSERT INTO infra.infra_yhteystiedot VALUES (35, 82); -- IODP"
INSERT INTO infra.infra_yhteystiedot VALUES (35, 83); -- IODP"
INSERT INTO infra.infra_yhteystiedot VALUES (36, 84); -- FinBIF"
INSERT INTO infra.infra_yhteystiedot VALUES (36, 85); -- FinBIF"
INSERT INTO infra.infra_yhteystiedot VALUES (37, 86); -- GBIF"
INSERT INTO infra.infra_yhteystiedot VALUES (38, 87); -- EMBL"
INSERT INTO infra.infra_yhteystiedot VALUES (39, 88); -- SC-infra"
INSERT INTO infra.infra_yhteystiedot VALUES (39, 89); -- SC-infra"
INSERT INTO infra.infra_yhteystiedot VALUES (39, 90); -- SC-infra"
INSERT INTO infra.infra_yhteystiedot VALUES (39, 91); -- SC-infra"
INSERT INTO infra.infra_yhteystiedot VALUES (41, 92); -- RAMI"
INSERT INTO infra.infra_yhteystiedot VALUES (41, 93); -- RAMI"
INSERT INTO infra.infra_yhteystiedot VALUES (41, 94); -- RAMI"
INSERT INTO infra.infra_yhteystiedot VALUES (41, 95); -- RAMI"
INSERT INTO infra.infra_yhteystiedot VALUES (41, 96); -- RAMI"
INSERT INTO infra.infra_yhteystiedot VALUES (42, 97); -- HIM"
INSERT INTO infra.infra_yhteystiedot VALUES (42, 98); -- HIM"
INSERT INTO infra.infra_yhteystiedot VALUES (43, 99); -- ESO"
INSERT INTO infra.infra_yhteystiedot VALUES (44, 100); -- NextGenTH"
INSERT INTO infra.infra_yhteystiedot VALUES (44, 109); -- NextGenTH"
INSERT INTO infra.infra_yhteystiedot VALUES (45, 101); -- CERN"
INSERT INTO infra.infra_yhteystiedot VALUES (45, 102); -- CERN"
INSERT INTO infra.infra_yhteystiedot VALUES (46, 103); -- FAIR"
INSERT INTO infra.infra_yhteystiedot VALUES (46, 104); -- FAIR"
INSERT INTO infra.infra_yhteystiedot VALUES (47, 105); -- NOT"
INSERT INTO infra.infra_yhteystiedot VALUES (47, 106); -- NOT"
INSERT INTO infra.infra_yhteystiedot VALUES (48, 107); -- NeIC"
INSERT INTO infra.infra_yhteystiedot VALUES (48, 108); -- NeIC"


/*
table_data_palvelu_palvelutyypit.sql

PALVELU_PALVELUTYYPIT-TAULU: yhdistää palvelun ja palvelutyypit toisiinsa
INSERT INTO infra.palvelu_palvelutyypit VALUES(PALVELU_ID,PALVELUTYYPPI_ID);  -- comment
PALVELU_ID - BIGINT(20): juokseva numero, kannan sisäinen, uniikki, linkki palvelu-tauluun
PALVELUTYYPPI_ID - BIGINT(20): juokseva numero, kannan sisäinen, uniikki, linkki palvelutyyppi-tauluun
*/

INSERT INTO infra.palvelu_palvelutyypit VALUES(1,1);  -- ESS online analysis, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(2,1);  -- ESS cumulative data wizard, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(3,1);  -- ESS bibliography, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(4,1);  -- ESS multilevel data, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(5,1);  -- ESS edunet, aineisto (koulutusmateriaali)
INSERT INTO infra.palvelu_palvelutyypit VALUES(5,2);  -- ESS edunet, palvelu (koulutusmateriaali)

INSERT INTO infra.palvelu_palvelutyypit VALUES(6,1);  -- FIN-CLARIN Kielipankki, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(6,2);  -- FIN-CLARIN Kielipankki, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(7,1);  -- FIN-CLARIN Tieteen termipankki, aineisto

INSERT INTO infra.palvelu_palvelutyypit VALUES(8,1);  -- FinELib, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(8,2);  -- FinELib, palvelu

INSERT INTO infra.palvelu_palvelutyypit VALUES(9,1);  -- Finna.fi, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(243,2);  -- Finna, palvelu

INSERT INTO infra.palvelu_palvelutyypit VALUES(10,1);  -- FMAS, aineistokatalogi, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(10,2);  -- FMAS, aineistokatalogi, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(11,1);  -- FMAS, käyttölupien sähkhaku, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(11,2);  -- FMAS, käyttölupien sähkhaku, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(12,2);  -- FMAS, etätyöpöytä, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(13,2);  -- FMAS, informatio- ja tukipalve, palvelu

INSERT INTO infra.palvelu_palvelutyypit VALUES(14,1);  -- FSD&CESSDA, Aila, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(14,2);  -- FSD&CESSDA, Aila, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(15,1);  -- FSD&CESSDA, tutkim.aineist. tiedhal käsikirja, aineisto (koulutusmateriaali)
INSERT INTO infra.palvelu_palvelutyypit VALUES(16,2);  -- FSD&CESSDA, menetelmäop. tietovar., palvelu (koulutusmateriaali)
INSERT INTO infra.palvelu_palvelutyypit VALUES(17,1);  -- FSD&CESSDA, demokratiaindik., aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(18,1);  -- FSD&CESSDA, pohtiva, aineisto

-- INSERT INTO infra.palvelu_palvelutyypit VALUES(19,2);  -- TTA&KDK-PAS, ATT kansalliset palv., palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(20,1);  -- TTA&KDK-PAS, AVAA, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(20,2);  -- TTA&KDK-PAS, AVAA, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(21,1);  -- TTA&KDK-PAS, Etsin, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(21,2);  -- TTA&KDK-PAS, Etsin, palvelu
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(22,1);  -- TTA&KDK-PAS, Finto, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(23,1);  -- TTA&KDK-PAS, IDA, aineisto, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(23,2);  -- TTA&KDK-PAS, IDA, aineisto, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(24,1);  -- TTA&KDK-PAS, REMS, aineisto, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(24,2);  -- TTA&KDK-PAS, REMS, aineisto, palvelu
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(25,1);  -- TTA&KDK-PAS, Theseus, aineisto
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(26,1);  -- TTA&KDK-PAS, TUPA, aineisto
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(27,1);  -- TTA&KDK-PAS, Tutkimus-PAS, aineisto, palvelu
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(27,2);  -- TTA&KDK-PAS, Tutkimus-PAS, aineisto, palvelu
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(28,1);  -- TTA&KDK-PAS, Tuuli, aineisto, palvelu
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(28,2);  -- TTA&KDK-PAS, Tuuli, aineisto, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(29,2);  -- TTA&KDK-PAS, KDK-PAS, palvelu

INSERT INTO infra.palvelu_palvelutyypit VALUES(30,2);  -- EISCAT_3D
INSERT INTO infra.palvelu_palvelutyypit VALUES(31,2);  -- EISCAT_3D
INSERT INTO infra.palvelu_palvelutyypit VALUES(32,1);  -- EISCAT_3D
INSERT INTO infra.palvelu_palvelutyypit VALUES(33,1);  -- EISCAT_3D
INSERT INTO infra.palvelu_palvelutyypit VALUES(34,1);  -- EISCAT_3D
INSERT INTO infra.palvelu_palvelutyypit VALUES(35,1);  -- EISCAT_3D
INSERT INTO infra.palvelu_palvelutyypit VALUES(36,1);  -- EISCAT_3D

INSERT INTO infra.palvelu_palvelutyypit VALUES(37,1);  -- EPOS

INSERT INTO infra.palvelu_palvelutyypit VALUES(38,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(39,1);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(40,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(41,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(42,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(43,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(44,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(45,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(46,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(47,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(48,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(49,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(50,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(51,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(52,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(53,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(54,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(55,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(56,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(57,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(58,2);  -- FINMARI
INSERT INTO infra.palvelu_palvelutyypit VALUES(59,2);  -- FINMARI

INSERT INTO infra.palvelu_palvelutyypit VALUES(60,2);  -- ICOS, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(61,2);  -- ICOS, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(62,2);  -- ICOS, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(188,2);  -- ICOS, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(189,2);  -- ICOS, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(63,2);  -- ICOS, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(64,2);  -- ICOS, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(65,2);  -- ICOS, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(66,2);  -- ICOS, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(67,2);  -- ICOS, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(68,2);  -- ICOS, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(69,2);  -- ICOS, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(70,2);  -- ICOS, palvelu

INSERT INTO infra.palvelu_palvelutyypit VALUES(71,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(72,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(72,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(73,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(73,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(74,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(74,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(75,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(75,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(76,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(77,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(77,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(78,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(78,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(176,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(176,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(177,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(177,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(178,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(178,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(179,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(179,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(180,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(180,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(181,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(181,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(182,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(182,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(183,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(183,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(184,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(184,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(185,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(185,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(186,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(186,3);  -- INAR RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(187,1);  -- INAR RI, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(187,3);  -- INAR RI, laitteisto

-- OGIIR - ei saatavilla olevia tietoja palveluista


INSERT INTO infra.palvelu_palvelutyypit VALUES(257,1);  -- BBMRI.fi, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(258,1);  -- BBMRI.fi, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(259,1);  -- BBMRI.fi, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(260,1);  -- BBMRI.fi, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(261,3);  -- BBMRI.fi, laitteisto

INSERT INTO infra.palvelu_palvelutyypit VALUES(89,3);  -- Biokeskus Suomi, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(89,2);  -- Biokeskus Suomi, palvelut
INSERT INTO infra.palvelu_palvelutyypit VALUES(90,3);  -- Biokeskus Suomi, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(90,2);  -- Biokeskus Suomi, palvelut
INSERT INTO infra.palvelu_palvelutyypit VALUES(91,3);  -- Biokeskus Suomi, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(91,1);  -- Biokeskus Suomi, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(91,2);  -- Biokeskus Suomi, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(92,3);  -- Biokeskus Suomi, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(92,1);  -- Biokeskus Suomi, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(92,2);  -- Biokeskus Suomi, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(93,3);  -- Biokeskus Suomi, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(93,2);  -- Biokeskus Suomi, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(94,3);  -- Biokeskus Suomi, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(94,1);  -- Biokeskus Suomi, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(94,2);  -- Biokeskus Suomi, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(95,3);  -- Biokeskus Suomi, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(95,2);  -- Biokeskus Suomi, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(96,3);  -- Biokeskus Suomi, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(96,1);  -- Biokeskus Suomi, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(96,2);  -- Biokeskus Suomi, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(97,1);  -- Biokeskus Suomi, aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(97,2);  -- Biokeskus Suomi, palvelu

INSERT INTO infra.palvelu_palvelutyypit VALUES(98,3);  -- EATRIS
INSERT INTO infra.palvelu_palvelutyypit VALUES(99,3);  -- EATRIS
INSERT INTO infra.palvelu_palvelutyypit VALUES(100,1);  -- EATRIS
INSERT INTO infra.palvelu_palvelutyypit VALUES(101,3);  -- EATRIS
INSERT INTO infra.palvelu_palvelutyypit VALUES(102,3);  -- EATRIS
INSERT INTO infra.palvelu_palvelutyypit VALUES(103,3);  -- EATRIS

INSERT INTO infra.palvelu_palvelutyypit VALUES(205,3);  -- ELIXIR (Suomi), laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(206,3);  -- ELIXIR (Suomi), laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(207,3);  -- ELIXIR (Suomi), laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(208,3);  -- ELIXIR (Suomi), laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(209,3);  -- ELIXIR (Suomi), laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(210,3);  -- ELIXIR (Suomi), laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(211,3);  -- ELIXIR (Suomi), laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(212,2);  -- ELIXIR (Suomi), palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(213,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(214,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(215,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(216,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(217,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(218,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(219,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(220,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(221,1);  -- ELIXIR (Suomi), aineisto
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(222,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(223,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(224,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(225,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(226,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(227,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(228,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(229,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(230,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(231,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(232,1);  -- ELIXIR (Suomi), aineisto
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(233,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(234,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(235,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(236,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(237,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(238,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(239,1);  -- ELIXIR (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(240,1);  -- ELIXIR (Suomi), aineisto

INSERT INTO infra.palvelu_palvelutyypit VALUES(119,3);  -- EuBI (Suomi), laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(120,3);  -- EuBI (Suomi), laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(121,3);  -- EuBI (Suomi), laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(122,3);  -- EuBI (Suomi), laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(123,1);  -- EuBI (Suomi), aineisto (ohjelmsito)
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(124,3);  -- EuBI (Suomi)
INSERT INTO infra.palvelu_palvelutyypit VALUES(125,2);  -- EuBI (Suomi), palvelu

INSERT INTO infra.palvelu_palvelutyypit VALUES(126,1);  -- EU-OPENSCREEN (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(127,3);  -- EU-OPENSCREEN (Suomi), laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(128,3);  -- EU-OPENSCREEN (Suomi), laitteisto

-- INSERT INTO infra.palvelu_palvelutyypit VALUES(129,1);  -- INFRAFRONTIER (Suomi)
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(130,3);  -- INFRAFRONTIER (Suomi)
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(131,3);  -- INFRAFRONTIER (Suomi)
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(132,3);  -- INFRAFRONTIER (Suomi)
INSERT INTO infra.palvelu_palvelutyypit VALUES(133,2);  -- INFRAFRONTIER (Suomi), palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(133,1);  -- INFRAFRONTIER (Suomi), aineisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(134,2);  -- INFRAFRONTIER (Suomi), palvelu
-- INSERT INTO infra.palvelu_palvelutyypit VALUES(135,3);  -- INFRAFRONTIER (Suomi)
INSERT INTO infra.palvelu_palvelutyypit VALUES(136,2);  -- INFRAFRONTIER (Suomi), palvelu

INSERT INTO infra.palvelu_palvelutyypit VALUES(137,1);  -- Instruct (Suomi)
INSERT INTO infra.palvelu_palvelutyypit VALUES(137,2);  -- Instruct (Suomi)
INSERT INTO infra.palvelu_palvelutyypit VALUES(137,3);  -- Instruct (Suomi)
INSERT INTO infra.palvelu_palvelutyypit VALUES(138,3);  -- Instruct (Suomi)
INSERT INTO infra.palvelu_palvelutyypit VALUES(139,2);  -- Instruct (Suomi)
INSERT INTO infra.palvelu_palvelutyypit VALUES(139,3);  -- Instruct (Suomi)
INSERT INTO infra.palvelu_palvelutyypit VALUES(140,3);  -- Instruct (Suomi)

INSERT INTO infra.palvelu_palvelutyypit VALUES(141,1);  -- NaPPI
INSERT INTO infra.palvelu_palvelutyypit VALUES(141,3);  -- NaPPI

INSERT INTO infra.palvelu_palvelutyypit VALUES(142,2);  -- NVVL, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(142,3);  -- NVVL, laitteisto

INSERT INTO infra.palvelu_palvelutyypit VALUES(143,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(143,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(144,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(144,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(145,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(145,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(146,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(146,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(147,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(147,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(148,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(148,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(149,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(149,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(190,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(190,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(191,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(191,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(192,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(192,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(193,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(193,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(194,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(194,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(195,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(195,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(196,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(196,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(197,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(197,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(198,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(198,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(199,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(199,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(200,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(200,3);  -- MAX IV, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(201,2);  -- MAX IV, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(201,3);  -- MAX IV, laitteisto

INSERT INTO infra.palvelu_palvelutyypit VALUES(150,3);  -- OMN/otanano
INSERT INTO infra.palvelu_palvelutyypit VALUES(150,2);  -- OMN/otanano
INSERT INTO infra.palvelu_palvelutyypit VALUES(151,3);  -- OMN/otanano
INSERT INTO infra.palvelu_palvelutyypit VALUES(151,2);  -- OMN/otanano
INSERT INTO infra.palvelu_palvelutyypit VALUES(152,3);  -- OMN/otanano
INSERT INTO infra.palvelu_palvelutyypit VALUES(152,2);  -- OMN/otanano
INSERT INTO infra.palvelu_palvelutyypit VALUES(153,3);  -- OMN/otanano
INSERT INTO infra.palvelu_palvelutyypit VALUES(153,2);  -- OMN/otanano
INSERT INTO infra.palvelu_palvelutyypit VALUES(154,3);  -- OMN/otanano
INSERT INTO infra.palvelu_palvelutyypit VALUES(154,2);  -- OMN/otanano
INSERT INTO infra.palvelu_palvelutyypit VALUES(155,3);  -- OMN/otanano
INSERT INTO infra.palvelu_palvelutyypit VALUES(155,2);  -- OMN/otanano

INSERT INTO infra.palvelu_palvelutyypit VALUES(160,2);  -- XBI&XFEL, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(160,3);  -- XBI&XFEL, laitteisto

INSERT INTO infra.palvelu_palvelutyypit VALUES(161,2);  -- BIOECONOMY
INSERT INTO infra.palvelu_palvelutyypit VALUES(162,2);  -- BIOECONOMY
INSERT INTO infra.palvelu_palvelutyypit VALUES(163,2);  -- BIOECONOMY

INSERT INTO infra.palvelu_palvelutyypit VALUES(164,3);  -- CTA (Suomi), laitteisto

-- INSERT INTO infra.palvelu_palvelutyypit VALUES(165,2);  -- Euclid
INSERT INTO infra.palvelu_palvelutyypit VALUES(241,3);  -- Euclid, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(241,2);  -- Euclid, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(242,1);  -- Euclid, aineisto

INSERT INTO infra.palvelu_palvelutyypit VALUES(166,3);  -- JYFL-ACCLAB, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(166,2);  -- JYFL-ACCLAB, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(167,2);  -- JYFL-ACCLAB, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(168,3);  -- JYFL-ACCLAB, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(168,2);  -- JYFL-ACCLAB, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(169,3);  -- JYFL-ACCLAB, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(169,2);  -- JYFL-ACCLAB, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(170,3);  -- JYFL-ACCLAB, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(170,2);  -- JYFL-ACCLAB, palvelu

INSERT INTO infra.palvelu_palvelutyypit VALUES(202,2);  -- CSC RI, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(202,3);  -- CSC RI,laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(203,2);  -- CSC RI, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(203,3);  -- CSC RI, laitteisto
INSERT INTO infra.palvelu_palvelutyypit VALUES(204,2);  -- CSC RI, palvelu
INSERT INTO infra.palvelu_palvelutyypit VALUES(204,3);  -- CSC RI, laitteisto

INSERT INTO infra.palvelu_palvelutyypit VALUES(173,2);  -- PRACE (Suomi)
INSERT INTO infra.palvelu_palvelutyypit VALUES(173,3);  -- PRACE (Suomi)
INSERT INTO infra.palvelu_palvelutyypit VALUES(174,2);  -- PRACE (Suomi)
INSERT INTO infra.palvelu_palvelutyypit VALUES(174,3);  -- PRACE (Suomi)

INSERT INTO infra.palvelu_palvelutyypit VALUES(175,2);  -- FGCI


INSERT INTO infra.palvelu_palvelutyypit VALUES(262, 3); -- ESRF "
INSERT INTO infra.palvelu_palvelutyypit VALUES(263, 1); -- IODP"
INSERT INTO infra.palvelu_palvelutyypit VALUES(264, 1); -- IODP"
INSERT INTO infra.palvelu_palvelutyypit VALUES(265, 1); -- IODP"
INSERT INTO infra.palvelu_palvelutyypit VALUES(266, 1); -- FinBIF"
INSERT INTO infra.palvelu_palvelutyypit VALUES(267, 1); -- FinBIF"
INSERT INTO infra.palvelu_palvelutyypit VALUES(268, 1); -- FinBIF"
INSERT INTO infra.palvelu_palvelutyypit VALUES(269, 1); -- FinBIF"
INSERT INTO infra.palvelu_palvelutyypit VALUES(270, 1); -- FinBIF"
INSERT INTO infra.palvelu_palvelutyypit VALUES(271, 1); -- GBIF"
INSERT INTO infra.palvelu_palvelutyypit VALUES(272, 3); -- EMBL"
INSERT INTO infra.palvelu_palvelutyypit VALUES(273, 3); -- SC-infra"
INSERT INTO infra.palvelu_palvelutyypit VALUES(274, 3); -- SC-infra"
INSERT INTO infra.palvelu_palvelutyypit VALUES(275, 3); -- SC-infra"
INSERT INTO infra.palvelu_palvelutyypit VALUES(276, 3); -- SC-infra"
INSERT INTO infra.palvelu_palvelutyypit VALUES(277, 3); -- SC-infra"
INSERT INTO infra.palvelu_palvelutyypit VALUES(278, 3); -- SC-infra"
INSERT INTO infra.palvelu_palvelutyypit VALUES(279, 3); -- SC-infra"
INSERT INTO infra.palvelu_palvelutyypit VALUES(280, 3); -- HIM"
INSERT INTO infra.palvelu_palvelutyypit VALUES(280, 2); -- HIM"
INSERT INTO infra.palvelu_palvelutyypit VALUES(283, 2); -- NextGenTH"
INSERT INTO infra.palvelu_palvelutyypit VALUES(283, 3); -- NextGenTH"
INSERT INTO infra.palvelu_palvelutyypit VALUES(284, 3); -- NOT"

INSERT INTO infra.kayttoehto VALUES(34,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO infra.kayttoehto VALUES(35,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO infra.kayttoehto VALUES(36,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO infra.kayttoehto VALUES(37,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO infra.kayttoehto VALUES(38,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO infra.kayttoehto VALUES(39,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO infra.kayttoehto VALUES(41,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO infra.kayttoehto VALUES(42,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO infra.kayttoehto VALUES(43,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO infra.kayttoehto VALUES(44,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO infra.kayttoehto VALUES(45,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO infra.kayttoehto VALUES(46,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO infra.kayttoehto VALUES(47,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
INSERT INTO infra.kayttoehto VALUES(48,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

