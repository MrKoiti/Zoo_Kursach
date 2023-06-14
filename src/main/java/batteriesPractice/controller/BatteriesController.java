package batteriesPractice.controller;

import batteriesPractice.service.zooService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/")
@AllArgsConstructor
public class BatteriesController {

    private final zooService zs;

    @GetMapping("/connectionOpen")
    public String connectionOpen() throws Exception {
        try{
            return zs.connectionOpen();}
        catch (Exception e) {
            return null;
        }}

    @GetMapping("/connectionClose")
    public String connectionClose() throws Exception {
        try{
            return zs.connectionClose();}
        catch (Exception e) {
            return null;
        }}



    @GetMapping("/getAllWorkers")
    public String getAllWorkers() throws Exception {
        try{
        return zs.getAllWorkers();}
        catch (Exception e) {
            return null;
        }}


    @GetMapping("/getWorkersByAT/{at}")
    public String getWorkersByAT(@PathVariable("at") String at) throws Exception {
        try{
            return zs.getWorkersByAT(at);}
        catch (Exception e) {
            return null;
        }}


    @GetMapping("/getAnimalsByWeight/{weight}")
    public String getAnimalsByWeight(@PathVariable("weight") String weight) throws Exception {
        try{
            return zs.getAnimalsByWeight(weight);}
        catch (Exception e) {
            return null;
        }}


    @GetMapping("/getAnimalsByWarmPlace")
    public String getAnimalsByWarmPlace() throws Exception {
        try{
            return zs.getAnimalsByWarmPlace();}
        catch (Exception e) {
            return null;
        }}


    @GetMapping("/getAnimalsByVac/{vac}")
    public String getAnimalsByVac(@PathVariable("vac") String vac) throws Exception {
        try{
            return zs.getAnimalsByVac(vac);}
        catch (Exception e) {
            return null;
        }}


    @GetMapping("/getAnimalsByCompatibility/{type}")
    public String getAnimalsByCompatibility(@PathVariable("type") String type) throws Exception {
        try{
            return zs.getAnimalsByCompatibility(type);}
        catch (Exception e) {
            return null;
        }}

    @GetMapping("/getFeed")
    public String getFeed() throws Exception {
        try{
            return zs.getFeed();}
        catch (Exception e) {
            return null;
        }}


    @GetMapping("/getFeedZoo")
    public String getFeedZoo() throws Exception {
        try{
            return zs.getFeedZoo();}
        catch (Exception e) {
            return null;
        }}


    @GetMapping("/getAnimal")
    public String getAnimal() throws Exception {
        try{
            return zs.getAnimal();}
        catch (Exception e) {
            return null;
        }}


}









