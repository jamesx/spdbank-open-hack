package com.chinasofti.training.config;

import com.chinasofti.training.entity.SessionEntity;
import com.chinasofti.training.entity.SpeakerEntity;
import com.chinasofti.training.service.SessionService;
import com.chinasofti.training.service.SpeakerService;
import com.chinasofti.training.utils.PageUtils;
import com.chinasofti.training.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.*;

//@Order(1)
//@Component
public class AppStartupRunner implements ApplicationRunner {
    @Autowired
    private SessionService sessionService;

    @Autowired
    private SpeakerService speakerService;
    
    @Override
    public void run(ApplicationArguments args) throws Exception {


        Map<String, Object> params = new HashMap<String, Object>();

        PageUtils sessions = sessionService.queryPage(params);
        
        if(sessions.getList().size()==0){
            ArrayList<SessionEntity> sessionList = new ArrayList<>();
            SessionEntity sessionEntity1 = new SessionEntity();
            UUID uuid = UUID.randomUUID();
            sessionEntity1.setId(uuid.toString());
            sessionEntity1.setMyAbstract("<b>Objective:</b> Understand the relationship between placental abnormalities and neonatal stroke.<br/><b>Background:</b> Arterial ischemic stroke (AIS) and venous infarction (VI) affect 1 in 4,000 newborns. While maternal and fetal/neonatal factors exist, placental risk factors have not been well described.<br/><b>Methods:</b> We retrospectively reviewed patients with neonatal stroke at three academic medical centers from 2005-2015 and identified 46 cases with placental specimens, including 26 AIS and 18 VI. We identified 100 control newborns matched for gestational age and year with placentas collected for any indication. One pathologist reviewed all specimens. Stroke type was determined by consensus neuroimaging review.<br/><b>Results:</b> Forty-five of 46 cases (98%) and 95/100 controls had any abnormal finding; cases had significantly more by number and severity, as follows. Fifteen cases (33%) met pathologically defined criteria for two or more major categories of placental abnormality, compared to 8/100 controls (OR 5.56, ?² p<0.0001). Uteroplacental malperfusion occurred in 30% of cases and 20% of controls. Fetal vascular flow restriction occurred in 50% of cases and 17% of controls (OR 5.25, ?² p<0.0001). Amniotic fluid inflammation with maternal- and fetal-side response occurred in 32% of cases and 20% of controls; of cases, it occurred in 11 with AIS (39%) and 4 with VI (22%). There was evidence of non-acute stress (meconium plus many nucleated red blood cells) in 24% of cases and 1% of controls (OR 5.25, Fisher’s t-test p<0.0001), including 29% of AIS and 17% of VI.<br/><b>Conclusions:</b> Major placental abnormalities were common in stroke cases relative to controls, with trends towards different patterns in arterial versus venous stroke. Many findings were subacute to chronic and reflect intrauterine stressors that may predispose to acute stroke in the perinatal period. We are continuing to investigate these abnormalities and their implications for screening, monitoring, and even prevention of neonatal stroke.<br/>");
            sessionEntity1.setDate("05/19/2017");
            sessionEntity1.setEndtime(new Date());
            sessionEntity1.setEventname("2015 Spring");
            sessionEntity1.setHidden("false");
            sessionEntity1.setRoomid(130);
            sessionEntity1.setRoomname("PRINCESS F&G");
            sessionEntity1.setSessionid(1165);
            sessionEntity1.setSessioncode("AB08");
            sessionEntity1.setSpeakernames("Miya Bernson-Leung,Theonia K. Boyd");
            sessionEntity1.setSpeakers("");
            sessionEntity1.setStarttime(new Date());
            sessionEntity1.setTimeslot(74);
            sessionEntity1.setTitle("Placental Pathology in Neonatal Stroke: A Retrospective Case-Control Study");
            sessionEntity1.setTracknames("Anglebrackets");
            sessionEntity1.setTracks("131");
            sessionList.add(sessionEntity1);


            SessionEntity sessionEntity2 = new SessionEntity();
            sessionEntity2.setId(UUID.randomUUID().toString());
            sessionEntity2.setMyAbstract("<b>Objective:</b> To evaluate the effects of EPI-743 in subjects with Parkinson’s disease (PD).<br/><b>Background:</b> Oxidative stress and energetic disturbances are thought to contribute to the pathogenesis of PD. EPI-743 (alpha-tocotrienol quinone) is an investigational drug targeting oxidoreductase enzymes essential for redox control of metabolism. In preclinical tests on primary cells from sporadic and mito-PD variants, EPI-743 provides protection against oxidative stress secondary to glutathione depletion.<br/><b>Methods:</b> This was a 6-month open label trial comparing 2 dose levels of orally administered EPI-743 (200 mg or 400 mg TID). Study outcomes included changes from baseline in UPDRS II and III “ON” scores, and brain metabolite levels as measured by 3T magnetic resonance spectroscopy (MRS). Wilcoxon signed rank sum tests were used in the statistical analysis.<br/><b>Results:</b> Ten subjects were enrolled in the trial (mean Hoehn and Yahr 1.5); 3 patients discontinued the study after 3 months for reasons unrelated to drug. Six of 7 patients with follow up MRS studies demonstrated a decrease in glutamine/glutamate levels in the basal ganglia opposite the side most severely affected by PD (mean decrease of 1.18 ppm to 0.74 ppm, p=0.002), signifying CNS target engagement. Clinically, subjects demonstrated an improvement in UPDRS Parts II/III, with a mean decrease from 8.1 to 6.7 (p=0.19) in UPDRS Part II and a mean decrease from 16.6 to 13.3 (p=0.17) in UPDRS Part III (n=10). EPI-743 was well tolerated with no dose-limiting toxicities or serious adverse events.<br/><b>Conclusions:</b> EPI-743 resulted in a significant decrease in CNS glutamine/glutamate levels in PD patients as well as improvements in UPDRS combined parts II and III scores, and UPDRS part III scores alone, that approached statistical significance. Treatment with EPI-743 improved an objective CNS marker of oxidative stress that correlated with clinical improvement. These positive data provide the foundation for further development of EPI-743 for PD.<br/>");
            sessionEntity2.setDate("05/19/2015");
            sessionEntity2.setEndtime(new Date());
            sessionEntity2.setEventname("2015 Spring");
            sessionEntity2.setHidden("false");
            sessionEntity2.setRoomid(126);
            sessionEntity2.setRoomname("PALOMINO 10");
            sessionEntity2.setSessionid(1174);
            sessionEntity2.setSessioncode("VS04");
            sessionEntity2.setSpeakernames("Theresa Zesiewicz");
            sessionEntity2.setSpeakers("");
            sessionEntity2.setStarttime(new Date());
            sessionEntity2.setTimeslot(69);
            sessionEntity2.setTitle("Improves Motor Function and CNS Biomarkers in PD: Results from a Phase 2A Pilot Trial");
            sessionEntity2.setTracknames("Visual Studio/Azure intersection");
            sessionEntity2.setTracks("124");
            sessionList.add(sessionEntity2);


            SessionEntity sessionEntity3 = new SessionEntity();
            sessionEntity3.setId(UUID.randomUUID().toString());
            sessionEntity3.setMyAbstract("<b>Objective:</b> Our objective is to determine if features seen on chronic MR imaging could be used to assist in prognosis of cognitive outcomes in children.<br/><b>Background:</b> Perinatal ischemic strokes are caused by a vascular disruption between 20 weeks gestation and 28 days postnatal, resulting in a focal brain injury. Although studies show children with a perinatal stroke may have IQ in the normal range, there are individuals that have significant intellectual impairment. In literature symptomatic epilepsy has been linked to poor cognitive outcomes but evidence for other predictive factors is scant and inconsistent.<br/><b>Methods:</b> Twenty-six children with perinatal stroke were tested with a neuropsychological battery including Wechsler IQ and additional tests of memory and spatial skills. Existing structural MRI were obtained for all patients. MRI were analyzed for location of stroke (by lobe and regions of interest), tissue volumes relative to healthy controls (based on curve estimation after automated segmentation), and hippocampus volumes (by manual tracing) and related to performance on neuropsychological measures.<br/><b>Results:</b> The only connection between location of stroke lesion and testing performance that was found was a difference in FSIQ between those children that had a lesion that included the dorsolateral prefrontal (DLPF) cortex and those whose lesion did not. There was a correlation between grey matter volume loss and the verbal comprehension component of IQ testing. A reduction in hippocampus volume was observed in those children that had symptomatic epilepsy, but there was no correlation between volume and IQ or memory performance.<br/><b>Conclusions:</b> As seen in other studies, prognosis of cognitive outcome is difficult and there was no correlation between site of lesion and areas of intellectual deficit. However, there was some indication that loss of more cortical volume, or involvement of the DLPF cortex may be risk factors for intellectual impairment in childhood.<br/>");
            sessionEntity3.setDate("05/21/2015");
            sessionEntity3.setEndtime(new Date());
            sessionEntity3.setEventname("2015 Spring");
            sessionEntity3.setHidden("false");
            sessionEntity3.setRoomid(127);
            sessionEntity3.setRoomname("PRINCESS C");
            sessionEntity3.setSessionid(1179);
            sessionEntity3.setSessioncode("AB14");
            sessionEntity3.setSpeakernames("Giuseppe Iaria");
            sessionEntity3.setSpeakers("");
            sessionEntity3.setStarttime(new Date());
            sessionEntity3.setTimeslot(69);
            sessionEntity3.setTitle("Neuroimaging Markers of Cognitive Outcome in Children with Perinatal Stroke");
            sessionEntity3.setTracknames("Visual Studio/Azure intersection");
            sessionEntity3.setTracks("124");
            sessionList.add(sessionEntity3);
            sessionService.saveBatch(sessionList);
            System.out.println("初始化session数据成功!");
        }else{
            System.out.println("已有session数据，不用添加");
        }

        Map<String, Object> params1 = new HashMap<String, Object>();
        PageUtils speakers = speakerService.queryPage(params1);
        if(speakers.getList().size()==0){

            ArrayList<SpeakerEntity> speakerEntities = new ArrayList<>();

            SpeakerEntity speakerEntity1 = new SpeakerEntity();
            speakerEntity1.setId(UUID.randomUUID().toString());
            speakerEntity1.setBio("<b>John C Morris</b> MD is the Friedman Distinguished Professor of Neurology and Director of the Charles F. and Joanne Knight Alzheimer's Disease Research Center at Washington University School of Medicine. Dr. Morris has more than 500 published articles. He has received many honors and awards, including the Lifetime Achievement Award from the Alzheimer’s Association (2002); the MetLife Award for Medical Research in Alzheimer’s Disease (2004); the Potamkin Prize for Research in Pick’s, Alzheimer’s, and Related Dementias (2005); and the Peter H. Raven Lifetime Achievement Award from the Academy of Science St. Louis. He is ranked in the top 1% of investigators in the field of Neuroscience and Behavior by Essential Science Indicators database.");
            speakerEntity1.setCompany("Washington University School of Medicine, St Louis, Missouri, USA");
            speakerEntity1.setFirst("John");
            speakerEntity1.setHidden("false");
            speakerEntity1.setInshow("Fall2015");
            speakerEntity1.setLast("Morris");
            speakerEntity1.setPhoto("speaker4.jpg");
            speakerEntity1.setSessions("");
            speakerEntity1.setSessionscodes("");
            speakerEntity1.setSpeakerid(1013);
            speakerEntity1.setTitle("MD");
            speakerEntity1.setTracks("");
            speakerEntities.add(speakerEntity1);


            SpeakerEntity speakerEntity2 = new SpeakerEntity();
            speakerEntity2.setId(UUID.randomUUID().toString());
            speakerEntity2.setBio("<b>Geoff Nichol</b> BMed Sc, MB, ChB, MBA, FRACP is currently Executive Vice President of Research and Development at Sangamo BioSciences in San Francisco, USA.  He has over 20 years of experience in the pharmaceutical and biotechnology industries, and has been closely associated with the development of over 15 new drug candidates and the approval or launch of several marketed drugs, including Augmentin BID (amoxicillin/clavulanate), Foradil (formoterol) and Yervoy (ipilimumab). He started his career in drug development with SmithKline Beecham, then served on the senior global development management team at Novartis. He then led all aspects of product development for Medarex Inc, pioneering the pharmaceutical development of the novel immunotherapeutic antibodies ipilimumab, the first agent to improve survival in advanced melanoma, and nivolumab. Following the acquisition of Medarex by Bristol-Myers Squibb Company in 2009, he served as CMO at Ikaria prior to joining Sangamo.");
            speakerEntity2.setCompany("Sangamo BioSciences, USA");
            speakerEntity2.setFirst("Geoffrey");
            speakerEntity2.setHidden("false");
            speakerEntity2.setInshow("Fall2015");
            speakerEntity2.setLast("Nichol");
            speakerEntity2.setPhoto("speaker1.jpg");
            speakerEntity2.setSessions("");
            speakerEntity2.setSessionscodes("");
            speakerEntity2.setSpeakerid(1021);
            speakerEntity2.setTitle("Dr");
            speakerEntity2.setTracks("");
            speakerEntities.add(speakerEntity2);


            SpeakerEntity speakerEntity3 = new SpeakerEntity();
            speakerEntity3.setId(UUID.randomUUID().toString());
            speakerEntity3.setBio("<b>Prof Lesley Jones</b> has a long-standing interest in neurodegeneration, particularly in Huntington’s (HD) and Alzheimer’s disease (AD).  She has organised and performed genetic and genomic studies in HD and AD, analysed mouse models of disease and determined the biological mechanisms through which the diseases work, to identify new targets for therapies. In AD her pathway analysis papers highlighted the aetiological contribution of the immune system to AD that now forms a key area of therapeutic research. In HD her leadership in the Genetic Modifiers of HD consortium and in other repeat diseases provide novel avenues for therapeutic exploitation in DNA repair that inform her current research.");
            speakerEntity3.setCompany("Cardiff University School of Medicine, Cardiff, UK");
            speakerEntity3.setFirst("Lesley");
            speakerEntity3.setHidden("false");
            speakerEntity3.setInshow("none");
            speakerEntity3.setLast("Jones");
            speakerEntity3.setPhoto("speaker2.jpg");
            speakerEntity3.setSessions("");
            speakerEntity3.setSessionscodes("");
            speakerEntity3.setSpeakerid(1125);
            speakerEntity3.setTitle("Prof");
            speakerEntity3.setTracks("");
            speakerEntities.add(speakerEntity3);

            speakerService.saveBatch(speakerEntities);
            System.out.println("初始化speakers数据成功!");
        }else{
            System.out.println("已有speakers数据，不用添加");
        }

    }
}